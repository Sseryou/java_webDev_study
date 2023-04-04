package ex1_net;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex2_URL {
	public static void main(String[] args) {
		try {
			//MalformedURLException�� �߻��� ���ɼ��� �ִ�.
			URL url = new URL("http://dm.n-mk.kr:80/board/list.html?referer=kim#index1");
			
			//ȣ��Ʈ��� ��Ʈ��ȣ�� ���ڿ� ���·� ��ȯ�Ѵ�.
			System.out.println("url.getAuthority() : " + url.getAuthority());
			
			//��Ʈ��ȣ�� ��ȯ�Ѵ�. //������
			System.out.println("url.getPort() : " + url.getPort());
			//ȣ��Ʈ�� ��ȯ�Ѵ�. //���ڿ�
			System.out.println("url.getHost() : " + url.getHost());
			//���������� ��ȯ�Ѵ�. //���ڿ�
			System.out.println("url.getProtocol() : " + url.getProtocol());
			//������ ��ȯ�Ѵ�. //���ڿ�
			System.out.println("url.getQuery()" + url.getQuery());
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
