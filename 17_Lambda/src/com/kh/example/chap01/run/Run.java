package com.kh.example.chap01.run;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import com.kh.example.chap01.model.Product;
import com.kh.example.chap01.strategy_pattern_impl.NameAndStoreFilter;
import com.kh.example.chap01.strategy_pattern_impl.NameFilter;
import com.kh.example.chap01.strategy_pattern_interface.FilterPredicate;

public class Run {

	public static void main(String[] args) {

		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product("새우깡", 1200, true, "농심", "이마트"));
		products.add(new Product("감자깡", 1200, true, "농심", "이마트"));
		products.add(new Product("양파링", 1000, true, "농심", "홈플러스"));
		products.add(new Product("고구마칩", 3000, true, "오리온", "홈플러스"));
		products.add(new Product("자갈치", 800, true, "오리온", "홈플러스"));
		products.add(new Product("가위", 4000, false, "문방구", "코스트코"));
		products.add(new Product("청소기", 70000, false, "LG", "코스트코"));
		products.add(new Product("양주", 30000, true, "진로", "코스트코"));
		products.add(new Product("곰젤리", 4000, true, "Bear", "코스트코"));

		// 필터링 내용만을 넘길 방법이 없기에 Implement class를 만들어서 넘겨줘야한다.
		ArrayList<Product> filteredByName = filter(products, new NameFilter("새우깡"));
		ArrayList<Product> filteredByPrice = filter(products, new NameAndStoreFilter("새우깡", "owner"));

		// FilterPredicate 의 구현내용을 별도 클래스를 만들지 않고 바로 람다식으로 넘겨줄 수 있다
		// 인자 //내용
		ArrayList<Product> filteredByNameLambda = filter(products,
				(Product product) -> product.getName().equals("새우깡"));
		ArrayList<Product> filteredByComplexLambda = filter(products, (Product product) -> {
			return product.getName().equals("새우깡") && product.getStore().equals("이마트");
		});

		/*
		 * Predicate<T> interface의 사용
		 * 
		 * Strategy pattern을 사용하면서 FilterPredicate 라는 interface를 썼습니다. 이 interface는 한개의
		 * 추상 메서드를 가지며, 한개의 인자를 받아 boolean을 return합니다. 이런 형태를 (T) -> boolean 으로 표현하며, 이를
		 * Lambda signature라고 합니다.
		 * 
		 * Java8에서부터 이런 interface들을 미리 framework이 만들어서 제공해 줍니다. 많이 사용하는 형태이니, 굳이 만들어 쓰지
		 * 말라는거죠.
		 * 
		 * (T) -> boolean의 lambda signature를 갖는 interface는 Predicate<T>라는 interface 입니다.
		 * Predicate<T>는 public abstract boolean test(T t); 라는 abstract를 갖습니다.
		 * 
		 * 따라서 아래와 같이 filter 함수를 수정할 수 있습니다.
		 */

		ArrayList<Product> filteredByNamePredicate = filterPredicate(products, (Product product) -> product.getName().equals("새우깡"));
		
		Predicate<Product> predicate = (Product product) -> product.getName().equals("새우깡") && product.getStore().equals("이마트");
		
		ArrayList<Product> filteredByPredicateInterface = filterPredicate(products, predicate);
		
		// 여기까지 결과적으로.. interface는 Java8에서 구현한 Predicate로 대체, Imple는 람다식으로 대체해서 다 필요없어졌다;

		Predicate<String> isEmptyString = (String s) -> s.isEmpty();
		System.out.println(isEmptyString.test(""));
		
		Consumer<Integer> printInt = (Integer i) -> System.out.println("" + i);
		printInt.accept(3);

		Function<String, Integer> strCount = (String s) -> s.length();
		System.out.println(strCount.apply("holyShit"));
//
//		Supplier<People> makeObject = () -> new People();
//
//		UnaryOperator<Integer, Integer> sum = (int i) -> i + i;

		
	}

	public static ArrayList<Product> filter(ArrayList<Product> products, FilterPredicate filterInterface) {
		ArrayList<Product> filteredProducts = new ArrayList<>();
		for (Product product : products) {
			if (filterInterface.filter(product)) {
				filteredProducts.add(product);
			}
		}
		return filteredProducts;
	}

	public static ArrayList<Product> filterPredicate(ArrayList<Product> products, Predicate<Product> filter) {
		ArrayList<Product> filteredProducts = new ArrayList<>();
		for (Product product : products) {
			if (filter.test(product)) {
				filteredProducts.add(product);
			}
		}
		return filteredProducts;
	}

}
