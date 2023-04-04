package ex2_switch;

public class Ex3_switch {

	public static void main(String[] args) {
		//�ΰ��� ������ ������ �ʱ�ȭ �Ѵ�(���� ����)
		//�׸��� ��������ڸ� ����� ���ڿ� ������ �����.
		//switch���� �̿��Ͽ� ������ ������ �����ϴ� ���� �ڵ� �ۼ��ϱ�
		
		int i = 1;
		int j = 2;
		
		char ch;
		
		ch = '+';
		
		switch(ch) {
			case '+' : 
				System.out.println(i + "+" + j + "=" + (i + j));
				break;
			case '-' : 
				System.out.println(i + "-" + j + "=" + (i - j));
				break;
			case '*' : 
				System.out.println(i + "*" + j + "=" + (i * j));
				break;
			case '/' : 
				System.out.println(i + "/" + j + "=" + (i / j));
				break;
			case '%' : 
				System.out.println(i + "%" + j + "=" + (i % j));
				break;
				
		}
		
		//������ ������ �ϳ� ����� ��(1��, 2��...)�� �����Ѵ�.
		//�ش� ���� ���ϱ��� �ִ���
		//switch���� �̿��Ͽ� �ۼ��Ͻÿ�.
		
		// 28�� = 2��
		// 30�� = 1 3 5 7 8 10 12
		// 31�� = 4 6 9 11
		int month = 4;
		
		
		switch(month) {
		case 2:System.out.println(month + "���� 28�ϱ��� �ֽ��ϴ�.");
			break;
			
		case 1:case 3:case 5:case 7:case 8:case 10:
		case 12: System.out.println(month + "���� 31�ϱ��� �ֽ��ϴ�.");
			break;
			
		case 4:case 6:case 9:
		case 11: System.out.println(month + "���� 30�ϱ��� �ֽ��ϴ�.");
			break;
		}
		
	}

}
