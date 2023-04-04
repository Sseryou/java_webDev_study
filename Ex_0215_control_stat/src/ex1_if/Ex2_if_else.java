package ex1_if;

public class Ex2_if_else {

	public static void main(String[] args) {
		
		//if-else
		
		//기본형
		//if(조건식){
		//	조건이 참일때 실행할 명령
		//} else {
		//	조건식이 참이 아닐때 실행할 명령 
		//}
		
		int n = 49;
		String str = null;
		
		if(++n >= 50) {
			str = "n은 50이상의 수";
		} else {
			str = "n은 50미만의 수";
		}
		System.out.println(str);
		
		//변수 age에 나이를 대입하고, 30이상이면
		//"드실만큼 드셨네요" 출력, 그렇지않으면 "더 드셔도 되겠네요"
		//출력하는 조건문 작성하기
		//마지막으로는 감사합니다 라는 문장 출력하기
		
		int age = 25;
		String message;
		
		if (age >= 30) {
			message = "드실만큼 드셨네요";
		} else {
			message = "더 드셔도 되겠네요";
		}
		
		System.out.println(message + " 감사합니다.");
		// 위 조건문 코드를 삼항연산자로 바꾸기
		
		str = age >= 30 ? "드실만큼 드셨네요" : "더 드셔도 되겠네요" ;
		
	}

}
