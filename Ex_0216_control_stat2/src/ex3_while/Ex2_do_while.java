package ex3_while;

public class Ex2_do_while {

	public static void main(String[] args) {
		//do-while : 선처리 후비교
		//조건에 맞지 않는 명령일지라도 무조건 한번은 수행을 하고
		//빠져나감. 제어문 중에서 유일하게 뒤에 ;를 붙여야 하는 문법
		//do {
		//	무조건 한번은 실행할 반복할 명령
		//} while (조건식);
		
		int i = 11;
		do {
			System.out.println(i);
		}while(i <= 10);
		
		
	}

}
