package ex6_printf;

public class Ex1_Printf {

	public static void main(String[] args) {
		//printf: ���ڿ��� ������ ����ִ� �����͸� �Բ� ����� �� �ֵ��� �����ִ� ��������
		//f�� format�̶�� ���Դϴ�.
		
		int su1 = 10;
		int su2 = 7;
		
		System.out.printf("%d + %d = %d\n", su1, su2, (su1+su2));
		
		//%d : ������ �����͸� �Է¹����� ���
		//%c : ������ ������
		//%s : ���ڿ� ������
		//%f : �Ǽ��� ������
		
		
		//�� ���̴� 30�� �Դϴ�.
		int age = 30;
		System.out.printf("�� ���̴� %d�� �Դϴ�.\n", age);
		
		// �� �̸��� OOO�̰�, �� ���̴� OO���̰�, �� Ű�� OOO.Ocm�̰�, �� �������� OO�� �Դϴ�.
		
		String name = "ȫ�浿";
		float height = 178.5f;
		String btype = "AB";
		System.out.printf("�� �̸��� %s �̰�, �� ���̴�  %d�� �̰�, �� Ű�� %.1fcm �̰�, �� ��������  %s �� �Դϴ�.\n", name, age, height, btype);
		
	}

}
