package ex1_if;

public class Ex3_if_elseif_else {

	public static void main(String[] args) {
		//if - else if - else : ���ؾ��� ������ ������ �ִ°��
		//�⺻��
		//if(���ǽ�1){
		//	���ǽ�1 ���϶� ����
		//} else if(���ǽ�2){
		//	���ǽ�1�� �����̰� ���ǽ� 2�� ���ΰ�� ����
		//} else if(���ǽ�3){
		//	���ǽ�2�� �����̰� ���ǽ� 3�� ���ΰ�� ����
		//} else if(���ǽ�4){
		//	���ǽ�3�� �����̰� ���ǽ� 4�� ���ΰ�� ����
		//} else { ��������
		//	�� ���ǽĵ��� ��� �����϶� ����
		//}
		
		//������ �ű涧
		int score = 75;
		if (score >= 90) {
			System.out.println("������ A�Դϴ�.");
		} else if(score >= 80) {
			System.out.println("������ B�Դϴ�.");
		} else if(score >= 70) {
			System.out.println("������ C�Դϴ�.");
		} else if(score >= 60) {
			System.out.println("������ D�Դϴ�.");	
		} else {
			System.out.println("������ F�Դϴ�.");
		}
		
		//if���� ��ø
		//if(���ǽ�1){
		//	if(���ǽ�2){
		//			���ǽ� 1,2�� ��� ���϶� ������ ���
		//		}
		//		���ǽ� 1�� ���϶� ������ ���
		//	}
		
		//������ ���� num�� ������ ���ڸ� �����ϰ�
		//�ش� ���ڰ� 5�ǹ���̸鼭 Ȧ������ �Ǻ��ϴ� ���ǹ��� �ۼ�
		
		int num = 14;
		//���� % n == 0 -> �� ������ n�� ���
		if(num % 5 == 0) {
			System.out.println(num + " �� 5�ǹ���Դϴ�.");
			//���� % n == 1 -> Ȧ��
			//���� % n != 0 -> Ȧ��
			//���� % n == 0 -> ¦��
			if(num % 2 != 0) {
				System.out.println(num + " �� 5�ǹ���̸鼭 Ȧ���Դϴ�.");
			} else {
				System.out.println(num + " �� 5�ǹ�������� ¦���Դϴ�.");
			}
		} else {
			System.out.println(num + " �� 5�ǹ���� �ƴմϴ�.");
		}
		
		
		
		
		
	}

}
