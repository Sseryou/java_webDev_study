package ex2_String_method;

public class Ex1_String_Method {

	public static void main(String[] args) {
		//�޼���(method) : ��� ����� ������ �ִ� ��ɹ��� ����
		//�޼��带 ����ϴ� ���� ū ������ �ݺ������� ���Ǵ� �ڵ带 ���̱� ���ؼ��̴�.
		//���� ���Ǵ� ������ �ڵ带 �޼���� �ۼ��� �ΰ� �ʿ��Ҷ����� ȣ�⸸ �ϸ� �ȴ�.
		
		//�޼��� ȣ���ϴ¹�
		//��ü��.�Լ���();
		String str = "Hong Gil Dong"; //�Ͻ��� ��ü ����
		System.out.println("���ڿ� str�� ���� : " + str.length());
		
		
		int index = str.indexOf('n');
		System.out.println("�� ó�� ���� n�� ��ġ : "+ index); //��� 2
		
		
		//Ư���� ��ġ�� �ִ� ���ڸ� ��ȯ
		char c = str.charAt(2);
		System.out.println("������ ���� : " + c); //��� n
		
		
		//Ư���� ��ġ�������� ������ ��ŭ ���ڿ��� �߶� ��ȯ (������ġ,�����);
		String str2 = str.substring(0, 4);
		System.out.println("�߶� ���ڿ� : " + str2); //��� Hong
		
		
		//split() : �Ұ�ȣ �ȿ� ������ �������� ���ڿ��� ������ ���ڿ� �迭�� �־��ִ� ���
		String[] str3 = str.split(" ");
		
		for(int i = 0; i < str3.length; i++) {
			System.out.printf("str[%d] : %s\n", i, str3[i]);
			
		}
		
		System.out.println(str);
		str = " Hong Gil Dong ";
		
		//trim() : ���ڿ��� �յ� ������ �������ִ� ���
		System.out.println(str.trim());
		
		//StringŬ������ �����ִ� �޼���� �ƴ����� ������ �޼���
		//���ڿ��� �ۼ��� ���ڸ� ���� ������ �ٲ��ִ� �ڵ�
		
		//warper class
		//Integer Character Float Double
		String number = "1";
		//���ڿ��� ���� ������ �ٲ��ִ� �޼���
		System.out.println(Integer.parseInt(number) + 10);
		int number2 = 1;
		//���� ������ ���ڿ��� �ٲ��ִ� �޼���
		System.out.println(Integer.toString(number2) + 10);
		
	}

}
