package ex1_if;

public class Ex3_if_elseif_else {

	public static void main(String[] args) {
		//if - else if - else : 비교해야할 조건이 여러개 있는경우
		//기본형
		//if(조건식1){
		//	조건식1 참일때 실행
		//} else if(조건식2){
		//	조건식1이 거짓이고 조건식 2가 참인경우 실행
		//} else if(조건식3){
		//	조건식2이 거짓이고 조건식 3가 참인경우 실행
		//} else if(조건식4){
		//	조건식3이 거짓이고 조건식 4가 참인경우 실행
		//} else { 생략가능
		//	위 조건식들이 모두 거짓일때 실행
		//}
		
		//학점을 매길때
		int score = 75;
		if (score >= 90) {
			System.out.println("성적은 A입니다.");
		} else if(score >= 80) {
			System.out.println("성적은 B입니다.");
		} else if(score >= 70) {
			System.out.println("성적은 C입니다.");
		} else if(score >= 60) {
			System.out.println("성적은 D입니다.");	
		} else {
			System.out.println("성적은 F입니다.");
		}
		
		//if문의 중첩
		//if(조건식1){
		//	if(조건식2){
		//			조건식 1,2가 모두 참일때 실행할 명령
		//		}
		//		조건식 1만 참일때 실행할 명령
		//	}
		
		//정수형 변수 num에 임의의 솟자를 대입하고
		//해당 숫자가 5의배수이면서 홀수인지 판별하는 조건문을 작성
		
		int num = 14;
		//정수 % n == 0 -> 그 정수는 n의 배수
		if(num % 5 == 0) {
			System.out.println(num + " 은 5의배수입니다.");
			//정수 % n == 1 -> 홀수
			//정수 % n != 0 -> 홀수
			//정수 % n == 0 -> 짝수
			if(num % 2 != 0) {
				System.out.println(num + " 은 5의배수이면서 홀수입니다.");
			} else {
				System.out.println(num + " 은 5의배수이지만 짝수입니다.");
			}
		} else {
			System.out.println(num + " 은 5의배수가 아닙니다.");
		}
		
		
		
		
		
	}

}
