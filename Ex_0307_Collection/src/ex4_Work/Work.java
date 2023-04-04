package ex4_Work;

import java.util.ArrayList;
import java.util.Scanner;

public class Work {
	public static void main(String[] args) {
		//아래의 결과를 도출하세요
		//아이디 생성 : abc
		//abc
		
		//아이디 생성 : abc
		//abc
		//중복된 아이디
		
		//아이디 생성 : abc2
		//abc abc2 ....
		
		//아이디 생성 : c
		//abc abc2 c....
		
		//중복된 아이디를 검사하는 로직 추가하기
		
		ArrayList<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		w:while(true) {
			System.out.print("아이디 생성 : ");
			String id = sc.next();
			
			//id 중복체크
//			for(int i = 0; i < list.size(); i++) {
//				if(id.equals(list.get(i))) {
//					System.out.println("중복된 id");
//					continue w;
//				}
//					
//			}
			
			if(list.contains(id)) {
				System.out.println("중복된 id");
				continue;
			}
			
			list.add(id);
			for(String str : list) {
				System.out.print(str+ " ");
				
				}
			}
			
		}
		
		
		
	}
	

