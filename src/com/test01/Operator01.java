package com.test01;

import java.util.Scanner;

public class Operator01 {

	public static void main(String[] args) {
		//class.�޼ҵ�();	
		Operator01.testMethod();
	}
		
	public static void testMethod() {
		// !���� : ������ �ݴ�� �ٲٴ� ������
		// !true => false
		System.out.println("true�� ����: "+ !true);
		System.out.println("false�� ����: "+ !false);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		System.out.println("�Է��� ������ ����ΰ�? " +  (num>0));
		System.out.println("�Է��� ������ ����ΰ�? " +  !(num<0));

		
		
	}
}
