package ex4_gugudan;

public class TimesTable {
	
	public void ShowTable(int x) {
		System.out.println(x + "´Ü");
		for(int i = x; i <= x; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j +" = " + (i*j));
			}
		}
		
	}
}
