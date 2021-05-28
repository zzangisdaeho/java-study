package com.kh.example.chap06_method.run;

import com.kh.example.chap06_method.controller.MethodController;
import com.kh.example.chap06_method.model.vo.Trainee;

public class Run {

	public static void main(String[] args) {
		MethodController mc = new MethodController();
		
		//매개변수와 반환 값이 없는 메소드 호출의 경우
		mc.method1();
		
		// 반환값이 없기 때문에 에러난다
//		System.out.println(mc.method1());
//		String str = mc.method1();
		
		
		// 매개변수가 없고 반환 값이 있는 메소드 호출의 경우
		// 반환 타입과 일치하는 자료형의 변수에 메소드 수행 결과를 담아서 사용
		int a = mc.method2();
		System.out.println(a);
		System.out.println(mc.method2());
		
		// 매개변수가 있고 반환 값이 없는 메소드 호출의 경우
		mc.method3(15, 1);
		
		// 매개변수 있고 반환 값 있는 메소드 호출의 경우
		int result = mc.method4(10, 20);
		System.out.println("result : " + result);
		System.out.println("result : " + mc.method4(10, 20));
		
		// 반환 값이 배열인 메소드 호출의 경우
		System.out.println("Run mc.method5() : "+ mc.method5());
		int[] arr = mc.method5();
		System.out.println("Run arr : "+ arr);
		for (int i  = 0 ; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// 반환 값이 클래스인 메소드 호출의 경우
		
		System.out.println("Run mc.method6() : " + mc.method6());
		
		System.out.println("==========================================");
		Trainee t1 = new Trainee();
		Trainee t2 = new Trainee("김대호",'H',"오후",23.5);
		System.out.println(t2.inform());
		
		t2.setClassRoom('G');
		System.out.println(t2.inform());
		
		t2.setTime("오전");
		System.out.println(t2.inform());
		
		Trainee.setScore(99.99); // static 함수니까 클래스에서 바로 가져올 수 있싐
		System.out.println(t2.inform());
		
		String name = t2.getName();
		String academy = t2.getACADEMY();
		char classRoom = t2.getClassRoom();
		String time = t2.getTime();
		double score = Trainee.getScore();
		
		System.out.println(name);
		System.out.println(academy);
		System.out.println(classRoom);
		System.out.println(time);
		System.out.println(score);
		System.out.println(name);
		
	}

}
