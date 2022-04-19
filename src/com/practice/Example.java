package com.practice;

import java.util.Scanner;

public class Example {
	public void sample1() {
		Scanner sc=new Scanner(System.in);

		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
		System.out.println("합격 조건 : " + ((kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) ? "합격" : "불합격"));
		sc.close();
	}
	
	public void sample2() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("학생 이름 : ");
		String name =sc.next();
		System.out.print("학년 : ");
		int grade =sc.nextInt();
		System.out.print("반 : ");
		int cl =sc.nextInt();
		System.out.print("번호 : ");
		int num =sc.nextInt();
		System.out.print("성별(M/F) : ");
		char ch =sc.next().charAt(0);
		String gender = (ch=='M' ? "남학생 " : "여학생 ");
		System.out.print("성적 : ");
		double gra =sc.nextDouble();
		
		System.out.println(grade + "학년 "+ cl + "반 " + num +"번 " + gender + name+ "은 성적이 " + gra + "이다.");
		sc.close();
	}
	
	public void sample3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력: ");
		int num = sc.nextInt();
		 
		String str = (num>0)? "양수다" : (num<0)? "음수다" : "0이다";
		
		System.out.println(str);
		sc.close();
	}
	
	public void sample4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력하시오: ");
		int num = sc.nextInt();
		   
		System.out.println((num%2==0)? "짝수다." : "홀수다.");
		sc.close();
		
	}
}
