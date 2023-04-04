package ex2_fileInput;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex3_FileInputStream {
	public static void main(String[] args) {
		String path = "D:\\web1500_sms\\java/test.txt";
		
		File f = new File(path);
		
		byte[] keyboard = new byte[100];
		
		
		//표준입력장치 스트림
		try {
			System.out.println("값 : ");
			System.in.read(keyboard);
			String s = new String(keyboard);
			System.out.println(s);
			
//			Scanner sc = new Scanner(System.in);
//			String res = sc.next();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
