package ex4_charStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Ex4_ByteCharReader {
	public static void main(String[] args) {
		//byte��� ��Ʈ���� char��� ��Ʈ���� ����
		File f = new File("D:\\web1500_sms\\java\\work\\Ex_0214_operator\\src\\ex1_casting/Ex1_Promotion.java");
			
		
		try {
			FileInputStream fis = new FileInputStream(f);
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			if(fis != null) {
				fis.close();
			}
			if(br != null) {
				br.close();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
