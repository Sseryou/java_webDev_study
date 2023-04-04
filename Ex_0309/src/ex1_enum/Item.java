package ex1_enum;

public enum Item {
	
	//열거형은 상수를 가지고 생성되는 객체들을 한 곳에 모아놓은 묶음이다.
	//상수들은 사용자가 지정한 이름으로부터 0부터 순차적으로 증가한다.(index값을 가진다.)
	//클래스처럼 보이게 하는 상수
	//서로 관련있는 상수들끼리 모아 상수들을 정의하는것
	START("시작" ,"s"), STOP("멈춤","p"), EXIT("종료","e");
	//상수에 값을 직접 넣으려면 생성자를 정의해 주어야 한다.
	
	String itemStr;
	String symbol;
	
	Item(String str, String symbol){
		//생성자를 외부에서 직접 호출할 수 없다.
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
