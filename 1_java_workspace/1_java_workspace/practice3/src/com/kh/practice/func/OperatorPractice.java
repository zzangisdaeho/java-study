package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	Scanner sc = new Scanner(System.in);
	
 public void practice1() {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("���� : ");
	 int num = Integer.parseInt(sc.nextLine());
	 
	 String result = (num>0)? "�����" : "����� �ƴϴ�";
	 System.out.println(result);
	 
 }
 public void practice2() {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("���� : ");
	 int num = Integer.parseInt(sc.nextLine());
	 
	 String result = (num > 0)? "�����" : ((num == 0)? "0�̴�" : "������");
	 System.out.println(result);
 }
 public void practice3() {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("���� : ");
	 int num = Integer.parseInt(sc.nextLine());
	 
	 String result = (num % 2 == 0)? "¦����" : "Ȧ����";
	 System.out.println(result);
 }
 public void practice4() {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("�ο� �� : ");
	 int nPeople = Integer.parseInt(sc.nextLine());
	 	 
	 System.out.print("���� ���� : ");
	 int nCandy = Integer.parseInt(sc.nextLine());
	 
	 int nForPeople = nCandy / nPeople;
	 
	 int rCandy = nCandy % nPeople;
	 
	 System.out.println("1�δ� ���� ���� : "+ nForPeople);
	 System.out.println("���� ���� ���� : "+ rCandy);
 }
 public void practice5() {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("�̸� : ");
	 String name = sc.nextLine();
	 
	 System.out.print("�г� (���ڸ�) : ");
	 int grade = Integer.parseInt(sc.nextLine());
	 
	 System.out.print("��(���ڸ�) : ");
	 int groupnumber = Integer.parseInt(sc.nextLine());
	 
	 System.out.print("��ȣ(���ڸ�) : ");
	 int num = Integer.parseInt(sc.nextLine());
	 
	 System.out.print("����(M/F) : ");
	 char sex = sc.nextLine().charAt(0);
	 char MF = (sex == 'M')? '��' : '��';
	 
	 System.out.print("���� (�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
	 double score = Double.parseDouble(sc.nextLine());
	 
	 System.out.printf("%d�г� %d�� %d�� %s %c�л��� ������ %.2f�̴�."
			 ,grade,groupnumber,num,name,MF,score);
 }
 public void practice6() {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("���� : ");
	 int age = Integer.parseInt(sc.nextLine());
	 
	 String judge = (age<=13)? "���" : ((age <=19)? "û�ҳ�" : "����");
	 
	 System.out.println(judge);
 }
 public void practice7() {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("���� : ");
	 int kor = Integer.parseInt(sc.nextLine());
	 
	 System.out.print("���� : ");
	 int eng = Integer.parseInt(sc.nextLine());
	 
	 System.out.print("���� : ");
	 int math = Integer.parseInt(sc.nextLine());
	 
	 int total = kor + eng + math;
	 System.out.println("�հ� : " + total);
			 
	 double avg = total/3;
	 System.out.printf("��� : %.1f", avg);
	 System.out.println();
	 String judge = (avg >= 60 && kor >=40 && eng >= 40 && math >= 40)?
			 "�հ�" : "���հ�";
	 
	 System.out.println(judge);
 }
 public void practice8() {
	 //7��° �ڸ����� �Ǻ�

	 System.out.print("�ֹι�ȣ�� �Է��ϼ���(-����) : ");
	 char id = sc.nextLine().charAt(7);
	 System.out.println(id);
	 String result = (id == '1')? "����" : "����";
	 System.out.println(result);
	 
 }
 public void practice9() {
	 System.out.print("���� 1 : ");
	 int num1 = Integer.parseInt(sc.nextLine());
	 
	 System.out.print("���� 2 : ");
	 int num2 = Integer.parseInt(sc.nextLine());
	 
	 System.out.print((num1 >= num2)? "���� 1�� ���� 2���� �۾ƾ� �մϴ�." : "");
	 
	 System.out.print("�Է� : ");
	 int num3 = Integer.parseInt(sc.nextLine());
	 
	 boolean result = (num3 <= num1 || num3 > num2);
	 
	 System.out.println(result);
 }
 public void practice10() {
	 System.out.print("�Է� 1 : ");
	 double num1 = Double.parseDouble(sc.nextLine());
	 System.out.print("�Է� 2 : ");
	 double num2 = Double.parseDouble(sc.nextLine());
	 System.out.print("�Է� 3 : ");
	 double num3 = Double.parseDouble(sc.nextLine());
	
	 boolean result = (num1 == num2)&&(num1==num3)&&(num2==num3);
	 System.out.println(result);
	 
 }
 public void practice11() {
	 System.out.print("A����� ���� : ");
	 int aIncome = Integer.parseInt(sc.nextLine());
	 double aTIncome = aIncome * (1+0.4);
	 
	 System.out.print("B����� ���� : ");
	 int bIncome = Integer.parseInt(sc.nextLine());
	 double bTIncome = bIncome * (1);
	 
	 System.out.print("C����� ���� : ");
	 int cIncome = Integer.parseInt(sc.nextLine());
	 double cTIncome = cIncome * (1+0.15);
	 
	 System.out.println("A��� ����/����+a : "+aIncome + "/" + aTIncome);
	 System.out.println((aTIncome>=3000)? "3000 �̻�" : "3000 �̸�");
	 
	 System.out.println("B��� ����/����+a : "+bIncome + "/" + bTIncome);
	 System.out.println((bTIncome>=3000)? "3000 �̻�" : "3000 �̸�");
	 
	 System.out.println("C��� ����/����+a : "+cIncome + "/" + cTIncome);
	 System.out.println((cTIncome>=3000)? "3000 �̻�" : "3000 �̸�");
 }
}
