package ex5_bank;

public class UserInfo {
	
	private int money;
	
	public void deposit(int money) {
		this.money += money;
		System.out.println("입금성공");
	}
	
	public int showMoney() {
		return money;
	}
	
	public void withdrow(int money) {
		if(this.money < money) {
			System.out.println("잔액이 부족합니다.");
		} else {
			this.money -= money;
			System.out.println("출금 성공");
		}
		
		
		
		
	}

}
