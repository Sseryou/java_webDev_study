package ex1_String;

import java.util.Scanner;

public class Ex1_String {
	public static void main(String[] args) {
		//자바로 만들어진 모든 프로그램은 클래스로 이루어져 있다.
		//우리가 문자열을 저장하기 위해 사용했던 String도 자바에 내장되어있는
		//클래스 입니다.
		
		//String 클래스는 2가지 특징을 가지고있다.
		//1) 객체 생성방법이 두가지(암시적, 명시적)
		//2) 한번 생성된 문자열의 내용은 변하지 않는다(불변의 특징)
		
		String s1 = "abc"; //암시적 객체 생성
		String s2 = "abc";
		//이미 앞에 같은 문자열로 생성된 암시적 객체가 있다면
		//앞서 생성된 객체의 주소를 재사용한다.
		
		//암시적 객체 생성을 할 수 있는 클래스는 String밖에 없다.
		//다른 모든 클래스들은 new를 사용하여 명시적 객체 생성을 해야합니다.
		
		
		//== 연산자는 기본 자료형을 비교할때는 데이터를 비교하지만.
		//그러나 객체끼리 비교를 할 때는 주소를 비교하는 연산자로 기능이 바뀐다.
		String s3 = new String("abc"); //명시적 객체 생성 
		String s4 = new String("abc");
		
		System.out.println();
		
//		if(s1 == s2) {
//			System.out.println("s1과 s2가 주소가 같습니다.");
//		} else {
//			System.out.println("s1과 s2가 주소가 다릅니다.");
//		}
//		
//		System.out.println();
//		
//		if(s2 == s3) {
//			System.out.println("s2과 s3가 주소가 같습니다.");
//		} else {
//			System.out.println("s2과 s3가 주소가 다릅니다.");
//		}
//		
//		System.out.println();
//		
//		if(s3 == s4) {
//			System.out.println("s3과 s4가 주소가 같습니다.");
//		} else {
//			System.out.println("s3과 s4가 주소가 다릅니다.");
//		}
//		
//		System.out.println();
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("문자열 : ");
//		//스캐너를 통해서 문자열을 입력받아 객체에 저장했을때
//		//주소를 재사용하지 않는다.
//		String s5 = sc.next();
//		
//		System.out.println("------------------");
//		
//		if(s1 == s5) {
//			System.out.println("s1과 s5가 주소가 같습니다.");
//		} else {
//			System.out.println("s1과 s5가 주소가 다릅니다.");
//		}
		
		//불변의 원칙
		
		String greet = "안녕";
		greet += "하세요";
		System.out.println(greet);
		
		//힙 영역에서 안녕과의 연결이 끊기고 안녕하세요라는 새 메모리를 할당받음
		//안녕은 소멸하지 않고 힙 영역에서 남음
		//남은 안녕을 JVM의 가비지콜렉터가 제거
		
		
		
		
		
	}

}
