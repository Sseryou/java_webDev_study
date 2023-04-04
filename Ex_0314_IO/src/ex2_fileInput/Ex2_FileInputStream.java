package ex2_fileInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex2_FileInputStream {
	public static void main(String[] args) {
	
		String path = "D:\\web1500_sms\\java/test.txt";
		File f = new File(path);
		
		//�迭�� int���������� ���� �� �ִ�.
		byte[] read = new byte[(int)f.length()];
		//�迭�� ũ�⸦ �� ���߾ �޸� ���� ���� �ʴ°� ���� ������,
		//��Ȳ���� �ٸ� ������ �޴´ٸ� �뷮�� �� �� �� ����.
		
		if(f.exists()) {
			try {
				FileInputStream fis = new FileInputStream(f);
				fis.read(read);
				
				String res = new String(read);
				
				System.out.println(res);
			
				fis.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
		
	}
}
