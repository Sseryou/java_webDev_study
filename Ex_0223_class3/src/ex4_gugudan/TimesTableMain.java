package ex4_gugudan;

import java.util.Scanner;

public class TimesTableMain {

	public static void main(String[] args) {
		
		TimesTable gugu = new TimesTable();
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ���� �Է� : ");
		int dan = sc.nextInt();
		gugu.ShowTable(dan);
		
		

	}

}
