package ex2_method;

import java.util.Scanner;

public class MethodMain {
	public static void main(String[] args) {
		
		MethodTest mt = new MethodTest();
		int num = mt.f(3); //반환값을 변수에 담아서 출력
		System.out.println(num);
		
		int su = 10; 
		mt.test(su); //결과 : 11 , 다른 클래스에 값을 '복사'
		System.out.println(su); //결과 : 10, int su를 그대로 가져옴.
		
		
		mt.add(11, 22);
		
		//1~n까지 총합을 구해주는 '함수' 만들기
		mt.total(10);
		
		//1부터 10까지 총합을 구하는 메서드 만들기
		
		mt.onetoten();
		
		//외부에서 수를 하나 입력받아서 해당 수에 해당하는 구구단을 출력하는
		//함수만들기
		
		mt.gugu();
		
		
	}
}
