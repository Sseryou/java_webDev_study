package ex7_scanner;

import java.util.Scanner;

public class Ex1_Scanner {

	public static void main(String[] args) {
		//ScannerŬ���� : Ű���忡�� ���� ���� �Է¹޾� ������ ������ �� �ֵ���
		//���ִ� Ŭ����
		Scanner sc = new Scanner(System.in);
//		//Ű���忡�� ���ڸ� �Է¹޾� ������ ������ ����ִ´�.
//		//�̸�.nextInt();
//		System.out.printf("������ �Է��� �ּ���. : ");
//		int num = sc.nextInt();
//		System.out.printf("�Է¹��� num : %d\n", num);
//		
//		//Ű���忡�� ���ڿ��� �Է¹޾� ���ڿ� ������ ����ִ´�.
//		//�̸�.next();
//		System.out.printf("���ڸ� �Է��� �ּ���. : ");
//		String str = sc.next();
//		System.out.printf("�Է¹��� str : %s\n", str);
		
		//for vs while
		//for : ���� �ݺ��ϰ��� �ϴ� Ƚ���� ��Ȯ�ϰ� �˰� ������ ����Ѵ�.
		//while : �� �� �ݺ��ؾ� �ϴ� �� ��Ȯ�ϰ� �˼� ���� ���� ����� �����ϴ�.
		System.out.printf("������ �Է��� �ּ���. : ");
		int number = sc.nextInt();
		
		while(number != -1) {
			System.out.printf("�Է��� ���� : %d\n", number);
			System.out.printf("������ �Է��� �ּ���. : ");
			number = sc.nextInt();
			if(number == -1) {
				System.out.println("-1�� �ԷµǾ� �����մϴ�.");
				break;
			}
		}

	}

}
