package ex8_work;

import java.util.Random;
import java.util.Scanner;

public class Ex2_Random {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		
		//rnd.nextInt(���ᰪ)+���۰�
		int r = rnd.nextInt(45)+1;
		
		System.out.println(r);
		
		//�������� 1 ~ 130���� ���������� ������ �մϴ�. (1~100)
		//����� kor, eng, math
		//100������ ���� ������ ������ �ٽ� ������ �����Ͽ�
		//�� ������ ��� 100�� ���ϰ� �Ǹ� ����ϴ�  do-while����
		//�ۼ��غ�����.
		
		int randkor = 0;
		int randeng = 0;
		int randmath = 0;
		
		
		w:do {
			randkor = rnd.nextInt(130)+1;
			randeng = rnd.nextInt(130)+1;
			randmath = rnd.nextInt(130)+1;
			while(randkor < 100 && randeng < 100 && randmath < 100) {
				System.out.printf("�������� : %d �������� : %d �������� : %d", randkor, randeng, randmath);
				break w;
			}
			
		} while(randkor > 100 || randeng > 100 || randmath > 100);

	}

}
