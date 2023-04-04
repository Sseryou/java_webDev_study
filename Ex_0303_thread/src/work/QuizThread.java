package work;

import java.util.Random;
import java.util.Scanner;

public class QuizThread extends Thread{
	
	int su1,su2; //���� 2�� �־��� ����
	int timer; //�ð��� ������� ����
	int count; //���� ���� ������ ���� ����
	boolean isCheck = true;
	final int FINISH = 5;
	
	
	public void startGame() {
		while(isCheck) {
			su1 = new Random().nextInt(100)+1;
			su2 = new Random().nextInt(100)+1;
			System.out.printf("%d + %d = " , su1, su2);
			Scanner sc = new Scanner(System.in);
			int result = sc.nextInt(); //������ ������ Ű���忡�� �Է¹ޱ�
			
			//������ üũ�ϴ� ����
			if(result == (su1 + su2)) {
				System.out.println("����!");
			} else {
				System.out.println("����!");
				continue;
			}
			count++;
			
			if(count == FINISH) {
				System.out.println("��� : " + timer + "��");
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
