package ex3_while;

public class Ex1_while {
	public static void main(String[] args) {
		//while : for�����ٴ� ������ ������ ���� �ݺ���(���� ��ó��)
		//�⺻��
		//while(���ǽ�){
		// 		�ݺ��ϰ��� �ϴ� ���
		//	}
		
		int num = 1; //�ʱ��
		
		while(num <= 10) {
			System.out.println(num);
			num++; // ������ ���� ���������ִ� ������
		}
	System.out.println("-------------------------------------------");
		//while���� ��ø
		int n1 = 1;
		int n2 = 1;
		
		while(n1 <= 3) {
			while(n2 <= 3) {
				System.out.println(n1 + " " + n2);
				n2++;
			}
			System.out.println(n1 + " " + n2);
			n1++;
		}
		System.out.println("-------------------------------------------");
		
		//1~10������ �� ���� while������ �ۼ��ϱ�
		int i = 0;
		int j = 0;
		while(i < 10) {
			i++;
			j += i;	
		}
		System.out.println("1���� 10������ ���� =" + j);
		System.out.println("-------------------------------------------");
		
		
		
	}

}
