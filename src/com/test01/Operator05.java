package com.test01;

import java.util.Scanner;

public class Operator05 {

	public static void main(String[] args) {
		new Operator05().opTest1();

	}
	public void opTest1() {
		// 1<= �� <=100 X,   ��>=1 && ��<=100  => true,false
		Scanner sc= new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է�: ");
		int num = sc.nextInt();
		
		System.out.println("1���� 100������ �������� Ȯ��: "+ (num>=1 && num<=100));
		
		//���� �빮������ Ȯ��
		System.out.print("���� �Է�: ");
		char ch = sc.next().charAt(0);
		
		System.out.println("���� �빮������ Ȯ��: " + (ch>='A' && ch<='Z'));

		///////////////
		System.out.print("��� �Ͻðڽ��ϱ�?(Y/N) : ");
		char ch2 = sc.next().charAt(0);

		System.out.println("������ Y ���� Ȯ��: " + (ch2 == 'Y' || ch2 == 'y'));

		
	}
}
