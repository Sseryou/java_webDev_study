package ex1_enum;

public enum Item {
	
	//�������� ����� ������ �����Ǵ� ��ü���� �� ���� ��Ƴ��� �����̴�.
	//������� ����ڰ� ������ �̸����κ��� 0���� ���������� �����Ѵ�.(index���� ������.)
	//Ŭ����ó�� ���̰� �ϴ� ���
	//���� �����ִ� ����鳢�� ��� ������� �����ϴ°�
	START("����" ,"s"), STOP("����","p"), EXIT("����","e");
	//����� ���� ���� �������� �����ڸ� ������ �־�� �Ѵ�.
	
	String itemStr;
	String symbol;
	
	Item(String str, String symbol){
		//�����ڸ� �ܺο��� ���� ȣ���� �� ����.
		this.itemStr = str;
		this.symbol = symbol;
	}
	
	public String getItemStr() {
		return itemStr;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
}
