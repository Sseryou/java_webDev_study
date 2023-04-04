package ex1_net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Ex3_InputStream {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.naver.com");
			String line = "";
			
			BufferedReader input = new BufferedReader(new InputStreamReader(url.openStream(),"UTF-8"));
			while((line = input.readLine()) != null) {
				//readLine은 String으로 반환하기 때문에 -1이 아닌 null을 넣어준다.
				System.out.println(line);
				//https://www.naver.com의 구성 요소를 전부 불러온다.(html)
			}
			
			input.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
