package com.test01;

import java.util.Scanner;

public class Operator06 {
	//���׿�����
	//(���ǽ�) ? ���϶� : �����϶�
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է�: ");
		int num = sc.nextInt();
		
		//num�� �������, �ƴ��� �Ǵ�
		//String str = (num>0)?"�����" : "����� �ƴϴ�";
		
		//��ø���
		String str = (num>0)? "�����" : (num<0)? "������" : "0�̴�";
		
		System.out.println(str);
	}

}
