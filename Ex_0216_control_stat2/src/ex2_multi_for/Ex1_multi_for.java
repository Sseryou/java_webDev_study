package ex2_multi_for;

public class Ex1_multi_for {

	public static void main(String[] args) {
		//���� for�� : for�� �ȿ� for���� �ִ� ����
		
		//�⺻��
		//for(�ʱ��;���ǽ�;������){
		//	for(�ʱ��;���ǽ�;������){
		//			�ݺ��ϰ��� �ϴ� ���
		//		}
		//	}
		
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++) {
				System.out.println(i + " " + j);
			} //inner
			System.out.println(); //�ٹٲ�
		} //outer
		
		//1 2 3 4
		//1 2 3 4
		//1 2 3 4
		//1 2 3 4
		
		for(int i = 1; i < 5; i++) { //���� ������ŭ �ݺ�
			for(int j = 1; j < 5; j++) { //�������ϴ� ���ڰ�����ŭ �ݺ�
				System.out.print(j + " ");
			}
			System.out.println();
		}
			System.out.println();
		
		//1 1 1 1
		//1 1 1 1
		//1 1 1 1
		
		for(int i = 1; i < 4; i++) {
			for(int j = 1; j < 5; j++) {
				System.out.print(1 + " ");
			}
			System.out.println();
		}
			System.out.println();
			
		//1 2 3 4
		//5 6 7 8
		//9 10 11 12
			int num = 0;
		for(int i = 1; i < 4; i++) {
			for(int j = 1; j < 5; j++) {
				num++;
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
			System.out.println();
		
		//A B C D
		//A B C D
		//A B C D
			
			for(int i = 1; i < 4; i++) {
				for(int j = 1; j < 5; j++) {
					System.out.print((char)(64 + j) + " ");
				}
				System.out.println();
			}
				System.out.println();
				
				
				
	}

}
