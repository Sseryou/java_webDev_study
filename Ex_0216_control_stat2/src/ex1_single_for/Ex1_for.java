package ex1_single_for;

public class Ex1_for {

	public static void main(String[] args) {
		//��� : �ڵ��� �帧�� �����ϴ� ����
		//�ݺ��� : Ư�� ���๮�� ���ϴ� ��ŭ �ݺ��Ͽ� �����ϴ� ���
		//for, while
		
		//for�� : Ư�� ����� ���ϴ� ��ŭ �ݺ������� ó���Ҷ� ���
		
		//�⺻��
		//for(�ʱ��; ���ǽ�; ������){
		//		������ ���϶� �ݺ��ϰ��� �ϴ� ���
		//}
		
		//�ʱ�� : �ݺ��� �����ϱ� ���� ���۰� - ������ �ϳ� �ʱ�ȭ ��Ų��.
		//���ǽ� : �ݺ��� �ϱ� ���� ���ᰪ  - �񱳿����ڸ� ���� ����Ѵ�.
		//������ : �ʱ���� �������� ���������ִ� ����  - ���������ڸ� ���� ����Ѵ�.
		
		
//		int i; // ��������
//		
//	
//		for(int j = 0;/*��������*/ j < 3; j++) {
//			System.out.println(j);
//		}
		//for�� �ٱ����� ������ �����ؾ� �� ������ ����� �� ����
		
	
		//1~10���� ����ϴ� for�� ����ϱ�
		for(int a = 1; a < 11; a++) {
			System.out.print(a + " ");
		}
		
			System.out.println();
		
		//10~1���� ����ϴ� for�� ����ϱ�
		for(int a = 10; a > 0; a--) {
			System.out.print(a + " ");
		}
			System.out.println();
		
		//1~10���� 3�� ����� ����ϴ� for�� �ۼ��ϱ�
		for(int a = 1; a < 11; a++) {
			if(a % 3 == 0) {
				System.out.print(a + " ");
			}
		}
		
		   System.out.println();
		//1���� 20 Ȧ����
		for(int a = 1; a < 21; a++) {
			if(a % 2 != 0) {
				System.out.print(a + " ");
			}
		}
				System.out.println();
		//1~10������ ������ ���ϴ� for�� �ۼ��ϱ�
				
				int sum = 0; //���� ���� ����
				
		for(int a = 1; a <= 10; a++ ) {
			sum += a;
		}
		System.out.print("1~10 ����" + sum);
		
		
				System.out.println();
		//������ ���� num�� ������ ���� �ְ�
		//1 ~ num ������ ������ ���ϴ� for�� �ۼ��ϱ�
				
		//for�� ��� ��
		// 1. ���� �ݺ��ϰ��� �ϴ� Ƚ���� ����
		// 2. i�� ����Ҽ� �ִٸ� ���
		int num = 100;
		
		int sum1 = 0; //����
		for(int i = 1; i <= num; i++) {
			sum1 += i;
		}
		System.out.print("1~"+ num + "���� = " + sum1);
		
		//������ ���� dan�� ���ڸ� �ϳ� �ְ�
		//�ش� ���ڿ� �ش��ϴ� ������ ����ϱ�
		
		int dan = 9;
		
		for(int i = 0; i < 10; i++) {
			System.out.println(dan + " X " + i + " = "+(dan * i));
		}
			
			System.out.println();
			
			
		//�١ڡ١ڡ١� ����ϱ�
		for(int i = 0; i < 50; i++) {
			if(i % 2 == 0) {
				System.out.print("��");
			}
			if(i % 2 != 0) {
				System.out.print("��");
			}
		}
			System.out.println();
			
	
	}

}
	
