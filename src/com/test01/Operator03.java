package com.test01;

public class Operator03 {

	public static void main(String[] args) {
		
		new Operator03().opTest();
		
	}
	public void opTest() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		//���������� ���� ���Ѵ�.
		System.out.println(num1 / num2);
		//���������� �������� ���Ѵ�.
		System.out.println(num1 % num2);

		//¦������			�� % 2 == 0
		//5�� �������		�� % 5 == 0
	}
}
