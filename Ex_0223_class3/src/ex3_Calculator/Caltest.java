package ex3_Calculator;

public class Caltest {
		
	public void Calculator(int x, int y, String z) {
		
		int result = 0;
		
		switch(z) {
		case "+" : 
			result = (x + y);
			System.out.printf("%d + %d의 값 : %d",x,y,result);
			break;
		case "-" : 
			result = (x - y);
			System.out.printf("%d - %d의 값 : %d",x,y,result);
			break;
			
		case "/" : 
			result = (x / y);
			System.out.printf("%d / %d의 값 : %d",x,y,result);
			break;
			
		case "%" : 
			result = (x % y);
			System.out.printf("%d % %d의 값 : %d",x,y,result);
			break;
			
		case "*" : 
			result = (x * y);
			System.out.printf("%d * %d의 값 : %d",x,y,result);
			break;
			
		}
		
	}
	
}
