package ex6_printf;

public class Ex1_Printf {

	public static void main(String[] args) {
		//printf: 문자열과 변수에 들어있는 데이터를 함께 출력할 수 있도록 도와주는 포멧형식
		//f는 format이라는 뜻입니다.
		
		int su1 = 10;
		int su2 = 7;
		
		System.out.printf("%d + %d = %d\n", su1, su2, (su1+su2));
		
		//%d : 정수형 데이터를 입력받을때 사용
		//%c : 문자형 데이터
		//%s : 문자열 데이터
		//%f : 실수형 데이터
		
		
		//제 나이는 30세 입니다.
		int age = 30;
		System.out.printf("제 나이는 %d세 입니다.\n", age);
		
		// 제 이름은 OOO이고, 제 나이는 OO세이고, 제 키는 OOO.Ocm이고, 제 혈액형은 OO형 입니다.
		
		String name = "홍길동";
		float height = 178.5f;
		String btype = "AB";
		System.out.printf("제 이름은 %s 이고, 제 나이는  %d세 이고, 제 키는 %.1fcm 이고, 제 혈액형은  %s 형 입니다.\n", name, age, height, btype);
		
	}

}
