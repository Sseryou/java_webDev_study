package ex2_operator;

public class Ex2_operator {

	public static void main(String[] args) {
		//대입연산자
		//우변값을 좌변에 대입한다 라는점을 잊지말자
		
		int n1 = 10;
		int n2 = 7;
		System.out.println("=연산자 : n1 : " + n1 + " n2 : " + n2);
		
		//복합대입연산자 : 산술연산자와 대입연산자가 합쳐진 형대 (+=, -=, *=, /=, %=)
		//+=연산자						n1 = n1 + n2;
		System.out.println("+=연산자 : n1 += n2 " + (n1+=n2)); //17
		//누적합
		
		//-=연산자						n1 = n1 - n2;
		System.out.println("-=연산자 : n1 -= n2 " + (n1-=n2)); //10
		
		//*=연산자						n1 = n1 * n2;
		System.out.println("*=연산자 : n1 *= n2 " + (n1*=n2)); //70
		
		///=연산자						n1 = n1 / n2;
		System.out.println("/=연산자 : n1 /= n2 " + (n1/=n2)); //10
		
		//%=연산자						n1 = n1 % n2;
		System.out.println("%=연산자 : n1 %= n2 " + (n1%=n2)); //3
		
		//비교연산자
		//두 수의 값을 비교할 때 사용하는 연산자
		//비교한 결과를 논리형 데이터로 반환 (true, false)로 반환한다.
		
		 n1 = 10;
		 n2 = 7;
		 boolean result;
		 result = n1 < n2;
		 System.out.println(result); //false;
		
		 result = n1 == n2;
		 System.out.println("==연산자 : " + result);
		 
		 result = n1 != n2;
		 System.out.println("!=연산자 : " + result);
		 
		 //논리연산자
		 //비교연산자를 통한 연산이 2개 이상 필요할때 사용된다.
		 // &&, ||, !
		 // && : 앞뒤연산이 모두 true여야 true (그리고)
		 	// && : 앞의 연산이 거짓이면 뒤의 연산을 진행하지 않는다.
		 // || : 둘 중 하나라도 연산이 true여도 true (또는)
		 	// || : 앞의 연산이 참이면 뒤의 연산을 진행하지 않는다.
		 // ! : not true를 false로 false를  true로 바꾼다.
		 
		 //연산결과를 논리형 데이터로 반환한다.
		 
		 result = n1 > n2 && n1 != n2;
		 System.out.println("&&연산자의 값 : " + result);
		 
		 result = n1 < n2 || n1 != n2;
		 System.out.println("||연산자의 값 : " + result);
		 
		 System.out.println("!연산자 : " + !result);
		 
		 
		 
	}

}
