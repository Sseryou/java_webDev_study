package ex6_updown;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Start s = new Start();
		
		
		
		while(true) {
			System.out.print("�����Է� : ");
			int number = sc.nextInt();
			if(s.check(number).equals("����")) {
				System.out.println(s.count + "ȸ ���� ����");
				break;
			} else {
				System.out.println(s.check(number));
				s.count++;
			}
			
		}
		
		
	}

}
