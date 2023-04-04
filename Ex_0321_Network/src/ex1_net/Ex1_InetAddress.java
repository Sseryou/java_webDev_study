package ex1_net;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Ex1_InetAddress {
	public static void main(String[] args) {
		//InetAddress
		//자바에서 ip주소를 다루기 위한 클래스로 InetAddress를 제공한다.
		
		InetAddress ip = null; //객체를 생성하고, null값을 넣어준다. 
		//스태틱 메서드이다.
		
		try {
			//이 구문은 UnknownHostException 이 발생할 가능성이 있다.
			ip = InetAddress.getByName("www.naver.com");
			System.out.println("getHostName() : " + ip.getHostName());//도메인을 반환한다.
			System.out.println("getHostAddress() : " + ip.getHostAddress()); //도메인의 ip주소를 문자열 형태로 반환한다.
			
			byte[] ipaddr = ip.getAddress();//반환값이 byte배열이다.
			System.out.println("getAddress() : " + Arrays.toString(ipaddr));
			//ip는 양의 정수로밖에 이루어지지 않는다.
			//숫자의 4개 묶음으로 이루어져 있고, 0~255 사이의 값을 가진다.
			//각각에 256를 더해주면 원래의 값이 나온다.
			
			InetAddress[] iparr = InetAddress.getAllByName("www.naver.com");
			//getAllByName(도메인) : 도메인이 운영하는 모든 서버(ip) 주소를
			//배열에 담아 반환
			
			for(int i = 0; i < iparr.length; i++) {
				System.out.printf("iparr[%d] : %s\n",i,iparr[i]);
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
