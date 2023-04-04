package ex3_fileout;


import java.io.FileOutputStream;
import java.io.IOException;

public class Ex2_FileOutputStream {
	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("D:\\web1500_sms\\java/fileOut.txt", true);
			
			fos.write('f');
			fos.write('i');
			fos.write('l');
			fos.write('e');
			fos.write('\n');
			
			String msg = "fileOutput�����Դϴ�.\n";
			String msg2 = "�����ٵ� ����\n";
			
			//getBytes() : ���ڿ��� byte[] �迭�� ��ȯ�ϴ� �޼���
			fos.write(msg.getBytes());
			fos.write(msg2.getBytes());
			
			fos.close();
		} catch(IOException e){
			e.printStackTrace();
		}
		
		
	}

}
