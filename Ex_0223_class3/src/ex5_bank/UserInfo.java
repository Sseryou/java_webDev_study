package ex5_bank;

public class UserInfo {
	
	private int money;
	
	public void deposit(int money) {
		this.money += money;
		System.out.println("�Աݼ���");
	}
	
	public int showMoney() {
		return money;
	}
	
	public void withdrow(int money) {
		if(this.money < money) {
			System.out.println("�ܾ��� �����մϴ�.");
		} else {
			this.money -= money;
			System.out.println("��� ����");
		}
		
		
		
		
	}

}
