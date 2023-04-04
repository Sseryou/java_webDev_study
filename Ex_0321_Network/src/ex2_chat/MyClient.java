package ex2_chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyClient {
	public static void main(String[] args) {
		System.out.println("입력 : ");
		Scanner sc = new Scanner(System.in);
		String msg = sc.nextLine();
		
		
		if(msg != null && msg.trim().length() > 0) {
			//값이 있고, 공백을 제외한 글자가 한개라도 있으면
			Socket s = null;
			
			try {
				s = new Socket("192.168.1.101",3001);
				//문자열을 서버로 보내기 위한 스트림 준비
				PrintWriter out = new PrintWriter(s.getOutputStream());
				//서버로 문자열 보내기
				out.write(msg);
				
				//스트림에 적재한 내용 비우기
				out.flush();
				
				if(out != null) {
					out.close();
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if(s != null) {
					try {
						s.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}
	}

}
