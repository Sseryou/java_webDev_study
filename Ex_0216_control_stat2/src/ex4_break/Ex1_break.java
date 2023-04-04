package ex4_break;

public class Ex1_break {

	public static void main(String[] args) {
		//기타제어문 : 반복문 안에서 사용됨.
		//-break
		//-continue
		
		//break : 반복문 내에서 사용되면서 break를 만나게 되면
		//break와 가장 가까이 있는 반복문을 빠져나옵니다.
		
		for(int i = 1; i <= 2; i++) {
			for(int j = 1; j <= 5; j++) {
				if(j % 2 == 0) {
					break;//가장 가까운 반복문 탈출
				}
				System.out.println(j + " ");
			}
			System.out.println();
		}

	}

}
