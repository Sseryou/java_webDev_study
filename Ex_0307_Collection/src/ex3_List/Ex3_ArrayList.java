package ex3_List;

import java.util.ArrayList;

public class Ex3_ArrayList {
	public static void main(String[] args) {
	
//		String[] name = new String[10];//이름밖에 저장 못함
//		int[] age = new int[10]; //나이밖에 저장 못함
		
		ArrayList<Person> list = new ArrayList<>();
		
		Person p1 = new Person();
		p1.setName("홍길동");
		p1.setAge(30);
		p1.setHeight(180.5);
		
		Person p2 = new Person();
		p2.setName("김삿갓");
		p2.setAge(28);
		p2.setHeight(167.4);
		
		list.add(p1);
		list.add(p2);
		
//		System.out.println(list.get(0).name);
//		System.out.println(list.get(0).age);
//		System.out.println(list.get(0).height);
//		
//		System.out.println(list.get(1).name);
//		System.out.println(list.get(1).age);
//		System.out.println(list.get(1).height);
		
		for(int i = 0; i < list.size(); i++) {
			Person vo = list.get(i);
			System.out.println(vo.getName());
			System.out.println(vo.getAge());
			System.out.println(vo.getHeight());
			System.out.println("------------------");
		}
		
		
		
	}
	
}
