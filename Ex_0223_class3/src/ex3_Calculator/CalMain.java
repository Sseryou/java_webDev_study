package ex3_Calculator;

import java.util.Scanner;

public class CalMain {

	public static void main(String[] args) {
		Caltest ca = new Caltest();
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 1�� �Է��� �ּ���. : ");
		int x = sc.nextInt();
		
		System.out.println("���� 2�� �Է��� �ּ���. : ");
		int y = sc.nextInt();
		
		System.out.println("�����ȣ�� �Է��� �ּ���. : ");
		String z = sc.next();
		
		
		ca.Calculator(x, y, z);

	}

}
