package ex4_charStream;


import java.io.FileReader;
import java.io.IOException;

public class Ex2_FileReader {
	
	//test.txt파일에 한글, 영어 (소문자, 대문자 포함) 을 섞어서 작성
	//text.txt의 내용을 읽어와서
	//내용에 영어의 대문자가 몇개인지, 소문자가 몇개인지
	//갯수를 각각 출력하세요
	
	//결과
	//대문자 : X개
	//소문자 : X개
	
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("D:\\web1500_sms\\java/test.txt");
			
			int code = 0;
			int up = 0;
			int down = 0;
			while((code = fr.read()) != -1) {
				System.out.println((char)code);
				
				if(code >= 'A' && code <= 'Z') {
					up++;
				}
				if(code >= 'a' && code <= 'z') {
					down++;
				}
			}
			
			fr.close();
			System.out.println("대문자 갯수 : " + up);
			System.out.println("소문자 갯수 : " + down);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
