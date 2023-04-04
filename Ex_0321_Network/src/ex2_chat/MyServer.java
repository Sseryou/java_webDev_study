package ex2_chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread{
	//Socket�� Thread�� �ʿ��ϴ�.
	
	ServerSocket ss;
	
	public MyServer() {
		//��Ʈ��ȣ�� ����� �Ѵ�. �ٸ� ��Ʈ��ȣ���� ������ ���ϱ� ���� 3000���� �̻���
		//��Ʈ��ȣ�� ���°��� ����.
		try {
			ss = new ServerSocket(3001);
			System.out.println("���� ����!");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}//������ ��

	public static void main(String[] args) {
		new MyServer().start();
		
		//�����带 ��ӹ޾ұ� ������ run �޼��尡 �ʿ��ϴ�.
	}
	
	@Override
	public void run() {
		//thread�� �ؾ��� ��
		//(�����ڸ� �ް�, ���ڿ��� �޾Ƴ���.)
		while(true){
			try {
				Socket s = ss.accept();
				
				//Ŭ���̾�Ʈ�� ���� ���ڿ�
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(s.getInputStream()));
				String msg = reader.readLine(); //�����ڰ� ���� �޼���
				//�������� ip�� �����ͼ� ip�� �־��ش�.
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip + " : " + msg);
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}//try/catch
		}//while
		
	}//run
	
	
}
