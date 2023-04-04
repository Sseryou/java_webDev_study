package ex3_message;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer extends Thread{
	ServerSocket ss;
	
	ArrayList<CopyClient> list;//복사본 클라이언트를 담을 리스트 준비
	
	public ChatServer() {
		try {
			list = new ArrayList<CopyClient>();
			
			ss = new ServerSocket(3200);
			System.out.println("서버시작");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//생성자
	
	public static void main(String[] args) {
		new ChatServer().start();
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Socket s = ss.accept();
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip + "님 접속");
				
				CopyClient cc = new CopyClient(s, this);
				list.add(cc);
				cc.start(); //클라이언트의 복사본 스레드 구동
				//이렇게 해야 CopyClient의 스레드에서
				//InputStream을 통해 클라이언트로 넘어온 값을
				//처리할 수 있다.
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
	}//run
	
	public void sendMessage(String msg) {
		//접속자들은 CopyClient상태로 만들어져 ArrayList에
		//저장된 상태이다.
		try {
			for(CopyClient cc : list) {
				cc.out.println(msg); //서버의 접속자들에게 메세지 전달
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}//sendMessage
	
	public void removeClient(CopyClient cc) {
		list.remove(cc); //인자로 전달된 CopyClient객체를
							//ArrayList에서 삭제
		sendMessage("----"+cc.ip+"님 퇴장 ----"); //남아있는 구성원들에게 퇴장 전달
	}

}
