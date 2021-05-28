package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	Scanner sc = new Scanner(System.in);
	
 public void practice1() {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("정수 : ");
	 int num = Integer.parseInt(sc.nextLine());
	 
	 String result = (num>0)? "양수다" : "양수가 아니다";
	 System.out.println(result);
	 
 }
 public void practice2() {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("정수 : ");
	 int num = Integer.parseInt(sc.nextLine());
	 
	 String result = (num > 0)? "양수다" : ((num == 0)? "0이다" : "음수다");
	 System.out.println(result);
 }
 public void practice3() {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("정수 : ");
	 int num = Integer.parseInt(sc.nextLine());
	 
	 String result = (num % 2 == 0)? "짝수다" : "홀수다";
	 System.out.println(result);
 }
 public void practice4() {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("인원 수 : ");
	 int nPeople = Integer.parseInt(sc.nextLine());
	 	 
	 System.out.print("사탕 개수 : ");
	 int nCandy = Integer.parseInt(sc.nextLine());
	 
	 int nForPeople = nCandy / nPeople;
	 
	 int rCandy = nCandy % nPeople;
	 
	 System.out.println("1인당 사탕 개수 : "+ nForPeople);
	 System.out.println("남는 사탕 개수 : "+ rCandy);
 }
 public void practice5() {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("이름 : ");
	 String name = sc.nextLine();
	 
	 System.out.print("학년 (숫자만) : ");
	 int grade = Integer.parseInt(sc.nextLine());
	 
	 System.out.print("반(숫자만) : ");
	 int groupnumber = Integer.parseInt(sc.nextLine());
	 
	 System.out.print("번호(숫자만) : ");
	 int num = Integer.parseInt(sc.nextLine());
	 
	 System.out.print("성별(M/F) : ");
	 char sex = sc.nextLine().charAt(0);
	 char MF = (sex == 'M')? '남' : '여';
	 
	 System.out.print("성적 (소수점 아래 둘째자리까지) : ");
	 double score = Double.parseDouble(sc.nextLine());
	 
	 System.out.printf("%d학년 %d반 %d번 %s %c학생의 성적은 %.2f이다."
			 ,grade,groupnumber,num,name,MF,score);
 }
 public void practice6() {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("나이 : ");
	 int age = Integer.parseInt(sc.nextLine());
	 
	 String judge = (age<=13)? "어린이" : ((age <=19)? "청소년" : "성인");
	 
	 System.out.println(judge);
 }
 public void practice7() {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("국어 : ");
	 int kor = Integer.parseInt(sc.nextLine());
	 
	 System.out.print("영어 : ");
	 int eng = Integer.parseInt(sc.nextLine());
	 
	 System.out.print("수학 : ");
	 int math = Integer.parseInt(sc.nextLine());
	 
	 int total = kor + eng + math;
	 System.out.println("합계 : " + total);
			 
	 double avg = total/3;
	 System.out.printf("평균 : %.1f", avg);
	 System.out.println();
	 String judge = (avg >= 60 && kor >=40 && eng >= 40 && math >= 40)?
			 "합격" : "불합격";
	 
	 System.out.println(judge);
 }
 public void practice8() {
	 //7번째 자리수로 판별

	 System.out.print("주민번호를 입력하세요(-포함) : ");
	 char id = sc.nextLine().charAt(7);
	 System.out.println(id);
	 String result = (id == '1')? "남자" : "여자";
	 System.out.println(result);
	 
 }
 public void practice9() {
	 System.out.print("정수 1 : ");
	 int num1 = Integer.parseInt(sc.nextLine());
	 
	 System.out.print("정수 2 : ");
	 int num2 = Integer.parseInt(sc.nextLine());
	 
	 System.out.print((num1 >= num2)? "정수 1이 정수 2보다 작아야 합니다." : "");
	 
	 System.out.print("입력 : ");
	 int num3 = Integer.parseInt(sc.nextLine());
	 
	 boolean result = (num3 <= num1 || num3 > num2);
	 
	 System.out.println(result);
 }
 public void practice10() {
	 System.out.print("입력 1 : ");
	 double num1 = Double.parseDouble(sc.nextLine());
	 System.out.print("입력 2 : ");
	 double num2 = Double.parseDouble(sc.nextLine());
	 System.out.print("입력 3 : ");
	 double num3 = Double.parseDouble(sc.nextLine());
	
	 boolean result = (num1 == num2)&&(num1==num3)&&(num2==num3);
	 System.out.println(result);
	 
 }
 public void practice11() {
	 System.out.print("A사원의 연봉 : ");
	 int aIncome = Integer.parseInt(sc.nextLine());
	 double aTIncome = aIncome * (1+0.4);
	 
	 System.out.print("B사원의 연봉 : ");
	 int bIncome = Integer.parseInt(sc.nextLine());
	 double bTIncome = bIncome * (1);
	 
	 System.out.print("C사원의 연봉 : ");
	 int cIncome = Integer.parseInt(sc.nextLine());
	 double cTIncome = cIncome * (1+0.15);
	 
	 System.out.println("A사원 연봉/연봉+a : "+aIncome + "/" + aTIncome);
	 System.out.println((aTIncome>=3000)? "3000 이상" : "3000 미만");
	 
	 System.out.println("B사원 연봉/연봉+a : "+bIncome + "/" + bTIncome);
	 System.out.println((bTIncome>=3000)? "3000 이상" : "3000 미만");
	 
	 System.out.println("C사원 연봉/연봉+a : "+cIncome + "/" + cTIncome);
	 System.out.println((cTIncome>=3000)? "3000 이상" : "3000 미만");
 }
}
