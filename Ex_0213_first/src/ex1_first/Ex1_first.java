package ex1_first;

public class Ex1_first {

	public static void main(String[] args) {
		//main 적고 컨트롤 + 스페이스
		
		//주석 : 프로그램의 소스코드에 프로그래머의 의견이나 설명을 적을수 있는 코드.
		//프로그램 소스 중간에 삽입하더라도 프로그램의 수행에 전혀 영향을 끼치지 않음
		//컴퓨터(jvm)에서 컴파일을 할 시 인식하지 못하는 코드
		/*
		 * 
		 * 
		 * 여러줄주석
		 */
		
		/*jvm란?
		 * 자바 가상 머신(java=virtual machine
		 * 자바 코드를 컴파일 하여 바이트 코드로 만들면 이 코드가
		 * 자바 가상머신 환경에서 실행됩니다.
		 * jvm은 자바 실행 환경에 포함되어 있습니다.
		 */
		
		
		/*
		 * 컴파일이란?
		 * 프로그래머가 작성한 .java(자바 코드)를 .class(바이트 코드)로 바꾸는 일련의 과정
		 */
		
		//sysout 적고 컨트롤스페이스
		System.out.println("hello world");
		System.out.println(100);
		System.out.println(100+50);
		//문장 뒤에 숫자를 더하면 문장뒤에 붙음
		System.out.println("안녕하세요" + 10);
		
		System.out.println(5 + 10 + " : " +( 5 + 10 ));
		//쌍따음표로 묶여있으면 문장취급을 받는다.
		System.out.println("2 + 2 = "+2+2);
		System.out.println("2 + 2 = "+(2+2));
		
	}
	
}
