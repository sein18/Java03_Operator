package com.practice;

import java.util.Scanner;

public class Example {
	public void sample1() {
		Scanner sc=new Scanner(System.in);

		System.out.print("���� ���� : ");
		int kor = sc.nextInt();
		System.out.print("���� ���� : ");
		int eng = sc.nextInt();
		System.out.print("���� ���� : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		System.out.println("�հ�: " + sum);
		System.out.println("���: " + avg);
		System.out.println("�հ� ���� : " + ((kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) ? "�հ�" : "���հ�"));
		sc.close();
	}
	
	public void sample2() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�л� �̸� : ");
		String name =sc.next();
		System.out.print("�г� : ");
		int grade =sc.nextInt();
		System.out.print("�� : ");
		int cl =sc.nextInt();
		System.out.print("��ȣ : ");
		int num =sc.nextInt();
		System.out.print("����(M/F) : ");
		char ch =sc.next().charAt(0);
		String gender = (ch=='M' ? "���л� " : "���л� ");
		System.out.print("���� : ");
		double gra =sc.nextDouble();
		
		System.out.println(grade + "�г� "+ cl + "�� " + num +"�� " + gender + name+ "�� ������ " + gra + "�̴�.");
		sc.close();
	}
	
	public void sample3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է�: ");
		int num = sc.nextInt();
		 
		String str = (num>0)? "�����" : (num<0)? "������" : "0�̴�";
		
		System.out.println(str);
		sc.close();
	}
	
	public void sample4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է��Ͻÿ�: ");
		int num = sc.nextInt();
		   
		System.out.println((num%2==0)? "¦����." : "Ȧ����.");
		sc.close();
		
	}
}
