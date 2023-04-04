package ex4_calculrator;

public class CalMain {
	public static void main(String[] args) {
		
		CalPlus cp = new CalPlus();
		CalMinus cm = new CalMinus();
		
		int res1 = cp.getResult(15, 10);
		int res2 = cm.getResult(15, 10);
		
		System.out.println("CalPlus : " + res1);
		System.out.println("CalMinus : " + res2);
		
		
	}

}
