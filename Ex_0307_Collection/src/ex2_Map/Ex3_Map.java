package ex2_Map;

import java.util.HashMap;
import java.util.Scanner;

public class Ex3_Map {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("kim", 1111);
		map.put("lee", 2222);
		map.put("park", 3333);
		
		//id : aaa
		//pw : 1111
		//아이디가 존재하지 않습니다.
		
		//id : lee
		//pw : 3333
		//비밀번호 불일치
		
		//id : park
		//pw : 3333
		//로그인 성공
		
		//키보드에서 id와 pw를 입력받기
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디를 입력해 주세요.");
			String id = sc.next();
			System.out.println("비밀번호를 입력해 주세요.");
			int pw = sc.nextInt();
			
		if(map.containsKey(id)) {
			if(map.get(id) == pw) {
				System.out.println("로그인 성공");
				break;
			}else {
				System.out.println("비밀번호 불일치");
			}
		}else {
			System.out.println("아이디가 존재하지 않습니다.");
		}
		}
	}
	
	
	

}
