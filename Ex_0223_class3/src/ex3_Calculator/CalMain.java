package ex3_Calculator;

import java.util.Scanner;

public class CalMain {

	public static void main(String[] args) {
		Caltest ca = new Caltest();
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 1을 입력해 주세요. : ");
		int x = sc.nextInt();
		
		System.out.println("숫자 2을 입력해 주세요. : ");
		int y = sc.nextInt();
		
		System.out.println("연산기호를 입력해 주세요. : ");
		String z = sc.next();
		
		
		ca.Calculator(x, y, z);

	}

}
