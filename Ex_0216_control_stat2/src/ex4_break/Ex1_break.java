package ex4_break;

public class Ex1_break {

	public static void main(String[] args) {
		//��Ÿ��� : �ݺ��� �ȿ��� ����.
		//-break
		//-continue
		
		//break : �ݺ��� ������ ���Ǹ鼭 break�� ������ �Ǹ�
		//break�� ���� ������ �ִ� �ݺ����� �������ɴϴ�.
		
		for(int i = 1; i <= 2; i++) {
			for(int j = 1; j <= 5; j++) {
				if(j % 2 == 0) {
					break;//���� ����� �ݺ��� Ż��
				}
				System.out.println(j + " ");
			}
			System.out.println();
		}

	}

}
