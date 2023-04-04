package ex1_net;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex2_URL {
	public static void main(String[] args) {
		try {
			//MalformedURLException이 발생할 가능성이 있다.
			URL url = new URL("http://dm.n-mk.kr:80/board/list.html?referer=kim#index1");
			
			//호스트명과 포트번호를 문자열 형태로 반환한다.
			System.out.println("url.getAuthority() : " + url.getAuthority());
			
			//포트번호를 반환한다. //정수형
			System.out.println("url.getPort() : " + url.getPort());
			//호스트를 반환한다. //문자열
			System.out.println("url.getHost() : " + url.getHost());
			//프로토콜을 반환한다. //문자열
			System.out.println("url.getProtocol() : " + url.getProtocol());
			//쿼리를 반환한다. //문자열
			System.out.println("url.getQuery()" + url.getQuery());
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
