package ex2_method;

import java.util.Scanner;

public class MethodMain {
	public static void main(String[] args) {
		
		MethodTest mt = new MethodTest();
		int num = mt.f(3); //��ȯ���� ������ ��Ƽ� ���
		System.out.println(num);
		
		int su = 10; 
		mt.test(su); //��� : 11 , �ٸ� Ŭ������ ���� '����'
		System.out.println(su); //��� : 10, int su�� �״�� ������.
		
		
		mt.add(11, 22);
		
		//1~n���� ������ �����ִ� '�Լ�' �����
		mt.total(10);
		
		//1���� 10���� ������ ���ϴ� �޼��� �����
		
		mt.onetoten();
		
		//�ܺο��� ���� �ϳ� �Է¹޾Ƽ� �ش� ���� �ش��ϴ� �������� ����ϴ�
		//�Լ������
		
		mt.gugu();
		
		
	}
}
