package com.test01;

public class Operator02 {
	// ++ : 1 ����
	// -- : 1 ����
	public static void main(String[] args) {
		Operator02 test =new Operator02();
		test.test1();
	}

	public void test1() {
		//���� ����
		int age = 19;
		System.out.println("���� ���̴� ? "+ age);

		++age;
		System.out.println("++age : "+ age);
	
		age++;
		System.out.println("age++ : "+ age);
		
		--age;
		System.out.println("--age : "+ age);
		
		age--;
		System.out.println("age-- : "+ age);
		
		////
		int a = 10;
		int b= ++a;
		System.out.println("a: " + a + ", b: " + b);
		
		int c = 10;
		int d= c++;
		System.out.println("c: " + c + ", d: " + d);
		
		////
		int num1 = 20;
		int result = num1++ * 3;
		System.out.println("result: " + result);
		
		int num2 = 20;
		int result2 = ++num2 * 3;
		System.out.println("result2: " + result2);
		
	}
}
