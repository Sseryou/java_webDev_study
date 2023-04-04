package ex4_person;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 40, "010-1111-1111");
		
		Person p2 = new Person("김길동", 30, "010-2222-2222");
		
		p2.name = "저글링";
		
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.tel);
		
		//파라미터를 받는 생성자를 정의한 순간부터
		//기본생성자는 사용할 수 없습니다.
		//기본생성자를 따로 정의해 놓는다면 사용할 수 있다.
		Person p3 = new Person();
		
	}

}
