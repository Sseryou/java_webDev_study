package ex2_Abstract;

abstract public class AbsParent {
	//�߻� �޼��尡 �Ѱ� �̻� ���ǵǾ� �ִ� Ŭ������ �߻�Ŭ���� ��� �ϴµ�
	//�߻�Ŭ���� ���� abstract�� ���� �ڽ��� �߻�Ŭ������°� �������� �մϴ�.
	//abstract ���������� class Ŭ������ {}
	int value = 100;
	
	public int getValue() { //�Ϲ����� �޼���
		return value;
	}
	
	//�߻� �޼��� : ��ü������ ����(����� ����) �޼���
	//�߻�޼����� ���� : ���������� abstract ��ȯ�� �޼����();
					//abstract ���������� ��ȯ�� �޼����();
	
	//�ϼ��� �ܰ谡 �ƴ� �̿ϼ��� �������� �ΰ�, ���߿� Ÿ Ŭ���� ������ �������Ͽ�
	//����� �� �ֵ��� ����� ��
	abstract public void setValue(int n);
	

}
