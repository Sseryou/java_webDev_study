package ex2_operator;

public class Ex3_operator {

	public static void main(String[] args) {
		//��Ʈ������
		//&, |, ^, ~
		
		//�������ڿ� ���������� bit����(2����)�� ���길 �����ϴ�.
		//�Ϲ������� ��ȣȭ, ��ȣȭ �۾��� ���ȴ�.
		
		int a = 10; //1010
		int b = 7; //0111
		int c = a & b; //����(and) - �������� �ٲ����� �� ���� ��� 1�� ���� ����� 1, �������� 0
		System.out.println("a & b�� �� : " + c);
		
		c = a | b; //����(or) - �������� �ٲ����� �� ���� ��� 0�̸� 0, �������� 1
		System.out.println("a | b�� �� : " + c);
		
		c = a ^ b; //��Ÿ��or(xor) - �������� �ٲ����� �� ���� ���� ������ 0, ���� �ٸ��� 1
		System.out.println("a ^ b�� �� : " + c);
		
		System.out.println("~(a | b)�� �� : " + ~c);
		//�������� ������ 0�� ��� �տ� �ִ� ������. ���÷� ª�� 0000001011 ���� �����̴�.
		//�׷��� ������� ���ü� �ִ� ���� �ʰ��ϰ� �ǰ�, ������ �Ǵ� ������ �߻��Ѵ�.
		
		//����������
		//1�� ������Ű�ų� 1�� ���ҽ����ִ� ������
		// ++, --
		
		//��������
		//������ �տ��� ����� ��
		
		a = 10;
		System.out.println("++a : " + ++a);
		
		//��������
		//������ �ڿ��� ����� ��
		
		a = 10;
		System.out.println("a++ : " + a++);
		System.out.println("a++�� �� ���� ��: " + a);
		
		a = 10;
		b = 12;
		boolean result = ++a >= b || 2 + 7 <= b && 13 -b >= 0 && (a+=b) - (a % b) > 10;
		//++a >= b || 2 + 7 <= b && 13 -b >= 0 && (a+=b) - (a % b) > 10;
		System.out.println(result);
		
		/*
		 * ������
		 * ��, ���, ������ �Ϸ翡 ����
		 * 5, 7, 5 �� ����.
		 * �Ϸ翡 ����Ǵ� �Ѱ��� ���
		 * �ð��� ��ü���� ��� ���갹�� ���
		 * ��հ��� float�� �����
		 */
		int pear = 5;
		int apple = 7;
		int orange = 5;
		
		int dayProduce = pear + apple + orange;
		float timeProduce = ((float)dayProduce)/24;
		//���� / ���� -> ����, �Ǽ� / �Ǽ� -> �Ǽ�, ����/ �Ǽ� -> �Ǽ�
		
		System.out.println("�Ϸ� �� ���귮 : " + dayProduce);
		System.out.println("�ð��� ���귮 : " + timeProduce);
		
		
	}

}
