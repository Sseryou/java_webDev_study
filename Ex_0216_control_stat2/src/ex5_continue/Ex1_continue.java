package ex5_continue;

public class Ex1_continue {

	public static void main(String[] args) {
		//continue : �ݺ��� �ȿ��� continue�� ������ �Ǹ�
		//���� ������ �ִ� �ݺ����� ���������� ���ư���.
		
		for(int i = 1; i <= 2; i++) {
			for(int j = 1; j <= 5; j++) {
				if(j % 2 == 0) {
					continue;//Ư�� ������ �ǳʶ۶� ���
				}
				System.out.println(j + " ");
			}
			System.out.println();
		}

	}

}
