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
			
			String msg = "fileOutput예제입니다.\n";
			String msg2 = "여러줄도 가능\n";
			
			//getBytes() : 문자열을 byte[] 배열로 반환하는 메서드
			fos.write(msg.getBytes());
			fos.write(msg2.getBytes());
			
			fos.close();
		} catch(IOException e){
			e.printStackTrace();
		}
		
		
	}

}
