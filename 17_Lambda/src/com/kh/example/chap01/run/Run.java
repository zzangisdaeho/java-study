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
		products.add(new Product("�����", 1200, true, "���", "�̸�Ʈ"));
		products.add(new Product("���ڱ�", 1200, true, "���", "�̸�Ʈ"));
		products.add(new Product("���ĸ�", 1000, true, "���", "Ȩ�÷���"));
		products.add(new Product("����Ĩ", 3000, true, "������", "Ȩ�÷���"));
		products.add(new Product("�ڰ�ġ", 800, true, "������", "Ȩ�÷���"));
		products.add(new Product("����", 4000, false, "���汸", "�ڽ�Ʈ��"));
		products.add(new Product("û�ұ�", 70000, false, "LG", "�ڽ�Ʈ��"));
		products.add(new Product("����", 30000, true, "����", "�ڽ�Ʈ��"));
		products.add(new Product("������", 4000, true, "Bear", "�ڽ�Ʈ��"));

		// ���͸� ���븸�� �ѱ� ����� ���⿡ Implement class�� ���� �Ѱ�����Ѵ�.
		ArrayList<Product> filteredByName = filter(products, new NameFilter("�����"));
		ArrayList<Product> filteredByPrice = filter(products, new NameAndStoreFilter("�����", "owner"));

		// FilterPredicate �� ���������� ���� Ŭ������ ������ �ʰ� �ٷ� ���ٽ����� �Ѱ��� �� �ִ�
		// ���� //����
		ArrayList<Product> filteredByNameLambda = filter(products,
				(Product product) -> product.getName().equals("�����"));
		ArrayList<Product> filteredByComplexLambda = filter(products, (Product product) -> {
			return product.getName().equals("�����") && product.getStore().equals("�̸�Ʈ");
		});

		/*
		 * Predicate<T> interface�� ���
		 * 
		 * Strategy pattern�� ����ϸ鼭 FilterPredicate ��� interface�� ����ϴ�. �� interface�� �Ѱ���
		 * �߻� �޼��带 ������, �Ѱ��� ���ڸ� �޾� boolean�� return�մϴ�. �̷� ���¸� (T) -> boolean ���� ǥ���ϸ�, �̸�
		 * Lambda signature��� �մϴ�.
		 * 
		 * Java8�������� �̷� interface���� �̸� framework�� ���� ������ �ݴϴ�. ���� ����ϴ� �����̴�, ���� ����� ����
		 * ����°���.
		 * 
		 * (T) -> boolean�� lambda signature�� ���� interface�� Predicate<T>��� interface �Դϴ�.
		 * Predicate<T>�� public abstract boolean test(T t); ��� abstract�� �����ϴ�.
		 * 
		 * ���� �Ʒ��� ���� filter �Լ��� ������ �� �ֽ��ϴ�.
		 */

		ArrayList<Product> filteredByNamePredicate = filterPredicate(products, (Product product) -> product.getName().equals("�����"));
		
		Predicate<Product> predicate = (Product product) -> product.getName().equals("�����") && product.getStore().equals("�̸�Ʈ");
		
		ArrayList<Product> filteredByPredicateInterface = filterPredicate(products, predicate);
		
		// ������� ���������.. interface�� Java8���� ������ Predicate�� ��ü, Imple�� ���ٽ����� ��ü�ؼ� �� �ʿ��������;

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
