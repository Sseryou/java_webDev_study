package ex2_method;

import java.util.Scanner;

public class MethodTest {
	
	//f(x) = 2x+1
	//f : �޼����
	//x : �Ķ����
	//2x+1 : ���
	
	public int f(int x) {
		int num = 2*x+1;
		return num;
	}
	
	public void test(int su) {
		su++;
		System.out.println("su : " + su);
	}
	
	//�ΰ��� ������ ���ϴ� add �Լ��� �����ϰ�,
	//main���� add�Լ��� ȣ���Ͽ� �� ���� ���ڸ� �Է��ϰ�
	//����� ����ϼ���
//	public int add(int num1, int num2) {
//		int total = num1 + num2;
//		System.out.println(total);
//		return 0;
//	}
	
	public void add(int x, int y) {
		System.out.println("add�Լ��� ��� : " +(x + y));
	}
	
	public int total(int x) {
		int total = 0;
		for(int i = 1; i <= x; i++) {
			total += i;
		}
		System.out.println(total);
		return 0;
	}
	
	public void onetoten() {
		int total = 0;
				int i = 0;
				while(i < 10) {
					i++;
					total += i;
				}
		System.out.println("1���� 10������ ���� : " + total);
	}
	
	public void gugu() {
		int gugu = 0;
		Scanner sc = new Scanner(System.in);
		System.out.printf("�������� �� ���ڸ� �Է� �� �ּ���. : ");
		int gu = sc.nextInt();
		for(int i = gu; i <= gu; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + " = " + (i*j));
			}
		}
	}
	

}
