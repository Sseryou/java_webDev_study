package ex1_generic;

public class GenEx_main {
	public static void main(String[] args) {
		
		//T에 원하는 클래스를 적어서 원하는 형태의 객체로 생성
		GenEx<String> v1 = new GenEx<String>(); //T자리에 String을 지정한다.
		v1.setValue("홍길동");
		System.out.println(v1.getValue());
		

		GenEx<Integer> v2 = new GenEx<>(); //앞쪽에 썻다면 뒤쪽을 생략가능하다.
		v2.setValue(100);
		System.out.println(v2.getValue());
		
		GenEx<Character> v3 = new GenEx<>();
		v3.setValue('A');
		System.out.println(v3.getValue());
		
		GenEx<Double> v4 = new GenEx<>();
		v4.setValue(3.14);
		System.out.println(v4.getValue());
		
	}

}
