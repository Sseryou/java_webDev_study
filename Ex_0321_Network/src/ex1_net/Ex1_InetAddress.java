package ex1_net;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Ex1_InetAddress {
	public static void main(String[] args) {
		//InetAddress
		//�ڹٿ��� ip�ּҸ� �ٷ�� ���� Ŭ������ InetAddress�� �����Ѵ�.
		
		InetAddress ip = null; //��ü�� �����ϰ�, null���� �־��ش�. 
		//����ƽ �޼����̴�.
		
		try {
			//�� ������ UnknownHostException �� �߻��� ���ɼ��� �ִ�.
			ip = InetAddress.getByName("www.naver.com");
			System.out.println("getHostName() : " + ip.getHostName());//�������� ��ȯ�Ѵ�.
			System.out.println("getHostAddress() : " + ip.getHostAddress()); //�������� ip�ּҸ� ���ڿ� ���·� ��ȯ�Ѵ�.
			
			byte[] ipaddr = ip.getAddress();//��ȯ���� byte�迭�̴�.
			System.out.println("getAddress() : " + Arrays.toString(ipaddr));
			//ip�� ���� �����ιۿ� �̷������ �ʴ´�.
			//������ 4�� �������� �̷���� �ְ�, 0~255 ������ ���� ������.
			//������ 256�� �����ָ� ������ ���� ���´�.
			
			InetAddress[] iparr = InetAddress.getAllByName("www.naver.com");
			//getAllByName(������) : �������� ��ϴ� ��� ����(ip) �ּҸ�
			//�迭�� ��� ��ȯ
			
			for(int i = 0; i < iparr.length; i++) {
				System.out.printf("iparr[%d] : %s\n",i,iparr[i]);
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
