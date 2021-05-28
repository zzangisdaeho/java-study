package com.kh.example.chap06_method.run;

import com.kh.example.chap06_method.controller.MethodController;
import com.kh.example.chap06_method.model.vo.Trainee;

public class Run {

	public static void main(String[] args) {
		MethodController mc = new MethodController();
		
		//�Ű������� ��ȯ ���� ���� �޼ҵ� ȣ���� ���
		mc.method1();
		
		// ��ȯ���� ���� ������ ��������
//		System.out.println(mc.method1());
//		String str = mc.method1();
		
		
		// �Ű������� ���� ��ȯ ���� �ִ� �޼ҵ� ȣ���� ���
		// ��ȯ Ÿ�԰� ��ġ�ϴ� �ڷ����� ������ �޼ҵ� ���� ����� ��Ƽ� ���
		int a = mc.method2();
		System.out.println(a);
		System.out.println(mc.method2());
		
		// �Ű������� �ְ� ��ȯ ���� ���� �޼ҵ� ȣ���� ���
		mc.method3(15, 1);
		
		// �Ű����� �ְ� ��ȯ �� �ִ� �޼ҵ� ȣ���� ���
		int result = mc.method4(10, 20);
		System.out.println("result : " + result);
		System.out.println("result : " + mc.method4(10, 20));
		
		// ��ȯ ���� �迭�� �޼ҵ� ȣ���� ���
		System.out.println("Run mc.method5() : "+ mc.method5());
		int[] arr = mc.method5();
		System.out.println("Run arr : "+ arr);
		for (int i  = 0 ; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// ��ȯ ���� Ŭ������ �޼ҵ� ȣ���� ���
		
		System.out.println("Run mc.method6() : " + mc.method6());
		
		System.out.println("==========================================");
		Trainee t1 = new Trainee();
		Trainee t2 = new Trainee("���ȣ",'H',"����",23.5);
		System.out.println(t2.inform());
		
		t2.setClassRoom('G');
		System.out.println(t2.inform());
		
		t2.setTime("����");
		System.out.println(t2.inform());
		
		Trainee.setScore(99.99); // static �Լ��ϱ� Ŭ�������� �ٷ� ������ �� �֚�
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
