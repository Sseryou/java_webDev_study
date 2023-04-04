package ex8_work;

import java.util.Random;
import java.util.Scanner;

public class Ex2_Random {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		
		//rnd.nextInt(종료값)+시작값
		int r = rnd.nextInt(45)+1;
		
		System.out.println(r);
		
		//랜덤으로 1 ~ 130까지 시험점수를 대입을 합니다. (1~100)
		//과목명 kor, eng, math
		//100점보다 높은 난수가 나오면 다시 난수를 대입하여
		//세 과목이 모두 100점 이하가 되면 출력하는  do-while문을
		//작성해보세요.
		
		int randkor = 0;
		int randeng = 0;
		int randmath = 0;
		
		
		w:do {
			randkor = rnd.nextInt(130)+1;
			randeng = rnd.nextInt(130)+1;
			randmath = rnd.nextInt(130)+1;
			while(randkor < 100 && randeng < 100 && randmath < 100) {
				System.out.printf("국어점수 : %d 영어점수 : %d 수학점수 : %d", randkor, randeng, randmath);
				break w;
			}
			
		} while(randkor > 100 || randeng > 100 || randmath > 100);

	}

}
