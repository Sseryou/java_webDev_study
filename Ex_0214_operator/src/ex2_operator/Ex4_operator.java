package ex2_operator;

public class Ex4_operator {

	public static void main(String[] args) {
		//하나의 조건을 정의하여, 조건이 참일때 반환할 명령, 조건이 거짓일때 반환할 명령을
		//얻어내기 위한 연산자
		//반환되는 값과 값을 담을 변수의 자료형을 일치시켜놓아야 함.
		
		int a = 10;
		int b = 15;
		boolean result = ++a >= b ? true : false;
		System.out.println("result : " + result);
		
		char result2 = ++a >= b ? 'O' : 'X';
		System.out.println("result2 : " + result2);
		
		int result3 = ++a >= b ? 1 : 0;
		System.out.println("result3 : " + result3);

	}

}
