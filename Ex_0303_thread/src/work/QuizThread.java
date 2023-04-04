package work;

import java.util.Random;
import java.util.Scanner;

public class QuizThread extends Thread{
	
	int su1,su2; //난수 2개 넣어줄 변수
	int timer; //시간을 재기위한 변수
	int count; //정답 맞춘 갯수를 세줄 변수
	boolean isCheck = true;
	final int FINISH = 5;
	
	
	public void startGame() {
		while(isCheck) {
			su1 = new Random().nextInt(100)+1;
			su2 = new Random().nextInt(100)+1;
			System.out.printf("%d + %d = " , su1, su2);
			Scanner sc = new Scanner(System.in);
			int result = sc.nextInt(); //문제의 정답을 키보드에서 입력받기
			
			//정답을 체크하는 로직
			if(result == (su1 + su2)) {
				System.out.println("정답!");
			} else {
				System.out.println("오답!");
				continue;
			}
			count++;
			
			if(count == FINISH) {
				System.out.println("결과 : " + timer + "초");
				isCheck = false;
			}
			
		}
	} //startGame
	
	@Override
	public void run() {
		while(isCheck) {
			try {
				Thread.sleep(1000);
				timer++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}
