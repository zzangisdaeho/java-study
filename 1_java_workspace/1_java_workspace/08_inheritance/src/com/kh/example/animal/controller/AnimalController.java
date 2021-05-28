package com.kh.example.animal.controller;

import com.kh.example.animal.model.vo.Animal;
import com.kh.example.animal.model.vo.Dog;
import com.kh.example.animal.model.vo.Snake;

public class AnimalController {
	public void method() {
		Animal a = new Animal("강아지", 9, 6.3);
//		System.out.println(a.inform());
		
		Dog d = new Dog("모모", 3, 8.1, 50, "장모");
//		System.out.println(d.inform());
		
		Snake s = new Snake("방울이", 4, 10.2, "빗살");
//		System.out.println(s.inform());
		
		System.out.println(a.toString());
		System.out.println(a);
		System.out.println(d.toString());
		System.out.println(d);
		System.out.println(s.toString());
		System.out.println(s);
		
		System.out.println(d.finalMethod());
		System.out.println(d.method2());
	}
	
	public void method2() {
		Dog dog = new Dog("송송이", 3, 3.5, 20);
		dog.setParent("1");
		System.out.println(dog);
		dog.setParent("2");
		System.out.println(dog);
	}
	
	public void method3() {
		Dog dog = new Dog("송송이", 3, 3.5, 20);
		Dog newDog = dog.changeChild(dog,"1");
		System.out.println(newDog);
		Dog newDog2 = dog.changeChild(dog,"2");
		System.out.println(newDog2);
	}
}
