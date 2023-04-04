package ex1_file;

import java.io.File;

public class Ex1_File {
	
	public static void main(String[] args) {
		//IO(Input, Output) : 입출력과 관련된 스트림
		//스트림 : 데이터 입출력을 위한 통로
		
		//파일 객체를 생성할 경로
		String path = "D:\\web1500_sms\\java/test.txt";
		
		//준비된 경로로 File 객체 생성
		File f = new File(path);
		
		//File클래스가 생성되면서 path경로까지 스트림을 생성
		System.out.println(f.length() + "byte");
		//파일의 용량을 알 수 있다. 한글 2byte, 영문, 특수문자는 1byte
		//파일이든 폴더든 최종 목적지에 해당하는 곳의 용량을 가져올 수 있다.
		
		
	}

	
	
	
}
