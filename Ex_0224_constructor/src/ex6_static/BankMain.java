package ex6_static;

public class BankMain {
	public static void main(String[] args) {
		Bank bk1 = new Bank("����", "02-222-2222");
		Bank bk2 = new Bank("����", "042-333-3333");
		Bank bk3 = new Bank("�λ�", "052-555-5555");
		
		//static������ Ŭ������ �̸����� �����ϴ°� ������ ����̴�.
		//��ü ���� ���̵� ������ �����ٰ� ����� �� �ִ�.
		//����ƽ�� �޸� �Լ��� ���� Ȯ���ϱ� ������, �����ϸ� �ε��� �������.
		//�׷��� �ʿ��� �� �ʿ��� ��ŭ�� �������Ѵ�.
		Bank.interest = 0.1f;
		
		bk1.printBank();
		bk2.printBank();
		bk3.printBank();
	}
}
