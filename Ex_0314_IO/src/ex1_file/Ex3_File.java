package ex1_file;

import java.io.File;

public class Ex3_File {
	
	public static void main(String[] args) {
		String path = "D:\\web1500_sms\\java/aaa/bbb";
		
		File f = new File(path);
		
		//파일클래스는 최종목적지까지 존재하지 않는 경로가 포함되어있는지 판단할 수 있다.
		//exist() : 파일클래스가 path경로로 찾아가던 중
		//정상적으로 폴더나 파일이 존재한다면 true를 반환
		if(!f.exists()) {
			System.out.println("폴더 생성");
			f.mkdirs();//폴더를 만들어주는 메서드
		}
		
		//파일 클래스는 특정 문서를 만들거나, 특정 문서에 들어있는 내용을 읽어오는것이
		//불가능하다.
		
		
		
	}
}
