package ex1_overload;

public class OverloadMain {
	public static void main(String[] args) {
		Ex1_overload ol = new Ex1_overload();
		ol.result();
		ol.result(1);
		ol.result('a');
		ol.result("저그", 100);
		ol.result(100, "저그");
		
		//오버로드의 장점 : 메서드를 상황에 따라서 구분할 필요가 없다.
		//ex) : println
		
		System.out.println();
	}

}
