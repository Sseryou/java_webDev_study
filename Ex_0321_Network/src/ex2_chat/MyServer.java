package ex2_chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread{
	//Socket은 Thread가 필요하다.
	
	ServerSocket ss;
	
	public MyServer() {
		//포트번호를 적어야 한다. 다른 포트번호와의 간섭을 피하기 위해 3000번대 이상의
		//포트번호를 적는것이 좋다.
		try {
			ss = new ServerSocket(3001);
			System.out.println("서버 시작!");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}//생성자 끝

	public static void main(String[] args) {
		new MyServer().start();
		
		//스레드를 상속받았기 때문에 run 메서드가 필요하다.
	}
	
	@Override
	public void run() {
		//thread가 해야할 일
		//(접속자를 받고, 문자열을 받아낸다.)
		while(true){
			try {
				Socket s = ss.accept();
				
				//클라이언트가 보낸 문자열
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(s.getInputStream()));
				String msg = reader.readLine(); //접속자가 보낸 메세지
				//접속자의 ip를 가져와서 ip에 넣어준다.
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip + " : " + msg);
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}//try/catch
		}//while
		
	}//run
	
	
}
