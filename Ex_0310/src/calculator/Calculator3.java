package calculator;

import java.util.ArrayList;

public class Calculator3 {
	public static void main(String[] args) {
		MyCalculator calc = (int num1, int num2) ->{
			return num1 + num2;
		};
		
		//�߰�ȣ�� return ���� ���� (����� ������ ����)
		MyCalculator calc2 = (int num1, int num2) -> num1 + num2;
		
		//�Ķ������ �ڷ����� ������ �����ϴ�.
		//�ڷ����� �����Ϸ��� ��� �Ķ���͸� �����ؾ��Ѵ�.
		MyCalculator calc3 = (num1, num2) -> num1 + num2;
		
		//�Ű������� �ϳ��϶� ���ڸ� ������ִ� ���ٽ� �ۼ�
		//�Ķ���Ͱ� �ϳ��� ���� �Ұ�ȣ�� ������ �� �ִ�.
		MyFunction func = num -> System.out.println(num);
		
		
		//::(�����ݷ�) : �޼��� ���� ������.
		//���ٽ��� ���� �����ϰ� ����� �� �ֵ��� ���ش�.
		MyFunction func2 = System.out::println;
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("�̸�1");
		list2.add("�̸�2");
		list2.add("�̸�3");
		list2.add("�̸�4");
		list2.add("�̸�5");
		list2.add("�̸�6");
		
		
		
		
	}
}
