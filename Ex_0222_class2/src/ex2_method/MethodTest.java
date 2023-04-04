package ex2_method;

import java.util.Scanner;

public class MethodTest {
	
	//f(x) = 2x+1
	//f : 메서드명
	//x : 파라미터
	//2x+1 : 명령
	
	public int f(int x) {
		int num = 2*x+1;
		return num;
	}
	
	public void test(int su) {
		su++;
		System.out.println("su : " + su);
	}
	
	//두개의 정수를 더하는 add 함수를 구현하고,
	//main에서 add함수를 호출하여 두 개의 숫자를 입력하고
	//결과를 출력하세요
//	public int add(int num1, int num2) {
//		int total = num1 + num2;
//		System.out.println(total);
//		return 0;
//	}
	
	public void add(int x, int y) {
		System.out.println("add함수의 결과 : " +(x + y));
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
		System.out.println("1부터 10까지의 총합 : " + total);
	}
	
	public void gugu() {
		int gugu = 0;
		Scanner sc = new Scanner(System.in);
		System.out.printf("구구단을 볼 숫자를 입력 해 주세요. : ");
		int gu = sc.nextInt();
		for(int i = gu; i <= gu; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + " = " + (i*j));
			}
		}
	}
	

}
