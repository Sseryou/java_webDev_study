package ex1_file;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		String path = "D:\\web1500_sms\\java";
		
		File f = new File(path);
		//파일클래스의 두번째 기능
		//최종 목적지가 폴더일때 해당 폴더가 가진 하위목록의 이름을 가져올 수 있습니다.
		
		//폴더 == 디렉토리
		if(f.isDirectory()) {
			String[] names = f.list();
			//알파벳 순으로 정렬한다.
			
			for(String s : names) {
				System.out.println(s);
			}
		}
		
		
		
	}

}
