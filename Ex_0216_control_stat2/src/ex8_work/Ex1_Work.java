package ex8_work;
import java.util.Scanner;

public class Ex1_Work {

	public static void main(String[] args) {
		//Ű���忡�� ���� �Է¹ް� �ش��ϴ� �������� ����غ�����.
		//2~9 �̿��� ���� �ԷµǸ� "2~9 ������ ���ڸ� �Է��ϼ���." ����ϱ�
		Scanner sc = new Scanner(System.in);
		
		
		//System.out.printf("�������� �� ���ڸ� ����ּ���. (2~9) :");
		//int gugu = sc.nextInt();
		
			
//			if(gugu < 2 || gugu > 9) {
//				System.out.printf("2~9 ������ ���ڸ� �Է��ϼ���. \n");
//			} else {
//				for(int i = 1; i <= 9; i++) {
//					System.out.printf("%d x %d = %d\n", gugu, i, (gugu * i));
//				}
//			}
			
			//Scanner�� ���� ���� n1, n2�� �Է¹޴´�.
			//�׸��� n1���� n2������ ���� ����Ͽ� �� ����� ����ϴ� ���α׷��� �ۼ�
			//������� 2�� 5�� �Է¹����� 2+3+4+5�� �������� 14�� ����ؾ� �մϴ�.
			//n1�� n2���� ũ�ٸ� �������� �ڸ��� �ٲ�־ ��� ����ϱ�
			//������� 5�� 2�� �Է¹����� 2+3+4+5�� �������� 14�� ����ؾ� �մϴ�.
			
			System.out.printf("����1�� �Է����ּ��� : ");
			int n1 = sc.nextInt();
			System.out.printf("����2�� �Է����ּ��� : ");
			int n2 = sc.nextInt();
			
			int total = 0;
			
//			if(n1 < n2) {
//			
//			for(int i = n1; i <= n2; i++) {
//				total += i;
//				}
//				System.out.printf("%d ~ %d ������ ���� : %d ", n1, n2, total);
//			} else if (n1 == n2) {
//				System.out.println(n1);
//			} else {
//				for(int i = n2; i <= n1; i++) {
//					total += i;
//					System.out.printf("%d ~ %d ������ ���� : %d ", n2, n1, total);
//					}
//			}
			
			if(n1 > n2) {
				int n3 = n1;
				n1 = n2;
				n2 = n3;
			}
			for(int i = n1; i <= n2; i++) {
				total += i;
			}
			System.out.printf("%d ~ %d ������ ���� : %d", n1, n2, total);
			
			

	}

}
