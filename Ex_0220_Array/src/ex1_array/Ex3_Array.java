package ex1_array;

import java.util.Scanner;

import java.util.Random;

public class Ex3_Array {

	public static void main(String[] args) {
		//�迭 arr�� ����ִ� ��� ���� ���� ����ϼ���
		//��� : 150
		
//		int[] arr = {10,20,30,40,50};
//		//int total = (arr[0] + arr[1] + arr[2] + arr[3] + arr[4]);
//		//System.out.println(total);
//		int total = 0; //���� ���� ����
//		for(int i = 0; i < arr.length; i++) {
//			total += arr[i]; //������
//		}
//		System.out.println("��� : " + total);
		
		//���α׷��� ����Ǹ� �迭�� ���̸� ������ �� ������ ���� ����.
		//���� ��� Ű���忡�� 5�� �Է¹�����
		
		//���
		
		//�迭�� ���̴� ������? : 5
		//ABCDE
		
		
		//�迭�� ���̴� ������? : 3
		//ABC
		
		//���� ���� ���α׷��� ������ִ� �ڵ� �ۼ��ϱ�
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("�迭�� ���̴� ������? : ");
//		int input = sc.nextInt();
//		char[] array = new char[input];
//		
//		
//		for(int i = 0; i < array.length; i++) {
//			array[i] = (char)(65+i);
//			System.out.print(array[i]);
//		}
		
//		//���� money�� 10~5000������ ������ �߻����� �ִ´�.
//		//��, 3450, 2100, 60�� ���� 1���ڸ��� �ݵ�� 0�̵ǵ��� �Ѵ�.
//		//�߻��� ���� money�� �������� �ٲٸ� ���� ������ ��� �ʿ�����
//		//�Ǵ��ϴ� �ڵ� �ۼ��ϱ�
//		//������ ���� ���� ������ ����ϵ��� �Ѵ�.
//		
//		Random rand = new Random();
//		
//		int money = rand.nextInt(5000)+10;
//		money *= 10; //�����ڸ��� ������
//		
//		int[] coin = {500,100,50,10};
//		System.out.println("�ݾ� : " + money);
//		
//		for(int i = 0; i < coin.length; i++) {
//			int res = money/coin[i];
//			System.out.println(coin[i]+ "�� : " + res);
//			money %= coin[i];
//			
//		}
		
		//1 ~ 45�� ������ �߻����� �ζǹ�ȣ�� �����ϴ� ���α׷� �����
		//1���� �ߺ��� �Ǹ� �ȵ�, 6��
		
		int[] lotto = new int[6];
		
		w:for (int i = 0; i > lotto.length;) {
			
			lotto[i] = new Random().nextInt(45)+1;
			//�ߺ����� ���ϴ� �ݺ���
			
			for(int j = 0; j < i; j++) {
				
				if(lotto[i] == lotto[j]) {
					
					continue w;
					
				}
			}
			
			System.out.print(lotto[i] + " ");
			
			i++;
		}
		
		
	
		
 		
		
		
		
		
		

	}

}
