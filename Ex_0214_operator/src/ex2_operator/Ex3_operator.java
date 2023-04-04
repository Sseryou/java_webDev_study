package ex2_operator;

public class Ex3_operator {

	public static void main(String[] args) {
		//비트연산자
		//&, |, ^, ~
		
		//논리연산자와 유사하지만 bit단위(2진수)의 연산만 가능하다.
		//일반적으로 암호화, 복호화 작업에 사용된다.
		
		int a = 10; //1010
		int b = 7; //0111
		int c = a & b; //논리곱(and) - 이진수로 바꿨을때 두 값이 모두 1일 때만 결과가 1, 나머지는 0
		System.out.println("a & b의 값 : " + c);
		
		c = a | b; //논리합(or) - 이진수로 바꿨을때 두 값이 모두 0이면 0, 나머지는 1
		System.out.println("a | b의 값 : " + c);
		
		c = a ^ b; //배타적or(xor) - 이진수로 바꿨을때 두 값이 서로 같으면 0, 서로 다르면 1
		System.out.println("a ^ b의 값 : " + c);
		
		System.out.println("~(a | b)의 값 : " + ~c);
		//이진수는 수많은 0이 결과 앞에 있는 형태임. 예시로 짧게 0000001011 같은 형태이다.
		//그래서 계산결과로 나올수 있는 값을 초과하게 되고, 음수가 되는 현상이 발생한다.
		
		//증감연산자
		//1씩 증가기키거나 1씩 감소시켜주는 연산자
		// ++, --
		
		//선행증감
		//변수의 앞에서 사용이 됨
		
		a = 10;
		System.out.println("++a : " + ++a);
		
		//후행증감
		//변수의 뒤에서 사용이 됨
		
		a = 10;
		System.out.println("a++ : " + a++);
		System.out.println("a++를 한 후의 값: " + a);
		
		a = 10;
		b = 12;
		boolean result = ++a >= b || 2 + 7 <= b && 13 -b >= 0 && (a+=b) - (a % b) > 10;
		//++a >= b || 2 + 7 <= b && 13 -b >= 0 && (a+=b) - (a % b) > 10;
		System.out.println(result);
		
		/*
		 * 과수원
		 * 배, 사과, 오렌지 하루에 각각
		 * 5, 7, 5 개 나옴.
		 * 하루에 생산되는 총갯수 출력
		 * 시간당 전체과일 평균 생산갯수 출력
		 * 평균값은 float로 만들것
		 */
		int pear = 5;
		int apple = 7;
		int orange = 5;
		
		int dayProduce = pear + apple + orange;
		float timeProduce = ((float)dayProduce)/24;
		//정수 / 정수 -> 정수, 실수 / 실수 -> 실수, 정수/ 실수 -> 실수
		
		System.out.println("하루 총 생산량 : " + dayProduce);
		System.out.println("시간당 생산량 : " + timeProduce);
		
		
	}

}
