package ex4_Work;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		//유저의 아이디와 패스워드를 만드는 UserInfo클래스를 만들고
		//Main클래스에서 유저의 정보를 ArrayList에 추가하여 출력해보자.
		
		
		//기존에 사용중인 아이디가 있을 경우 "아이디가 중복됩니다."
		//라고 출력하고 처음으로 돌아가기.
		
		ArrayList<UserInfo> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		
		w:while(true) {
			UserInfo ui = new UserInfo(); //while을 돌때마다 새로운 UserInfo객체 생성
			System.out.print("아이디 생성 : ");
			ui.setId(sc.next());
			
			for(int i = 0; i < list.size(); i++) {
				if(ui.getId().equals(list.get(i).getId())) {
					System.out.println("아이디가 중복됩니다.");
					continue w;
				}
			}
			
			System.out.print("비밀번호 생성 : ");
			ui.setPw(sc.nextInt());
			
			list.add(ui);
			
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getId());
				System.out.println(list.get(i).getPw());
				System.out.println("-----------------");
			}
		}
		
		
		
	}
}
