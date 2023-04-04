package ex2_multi_array;

public class Ex1_Multi_Array {

	public static void main(String[] args) {
		//다차원 배열 : 다차원 배열이란 2차원 이상의 배열을 의미하며,
		//배열의 요소로 또 다른 배열을 가지고 있는것을 의미합니다.
		//2차원 배열은 요소로써 1차원 배열을 가지고 있고,
		//3차원 배열은 요소로써 2차원 배열을 가지고 있습니다.
		
		//자료형[][] 배열명 = new 자료형[1차원 배열의 갯수][1차원 배열의 들어가는 데이터의 갯수];
		//자료형 [][][] 배열명 = new 자료형[][][];
		
		//2차원 배열까지는 많이 사용하지만 3차원부터는 거의 사용되지 않는다.
		
		int[][] test = new int[2][3];
		
		//2차원 배열의 가각의 방에 접근하는 법
		//배열명 [2차원배열의 index][1차원배열의 index] = 데이터;
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
		
		test[1][0] = 400;
		test[1][1] = 500;
		test[1][2] = 600;
		
		//2차원 배열 출력하기
		//System.out.println(test[0][0]);
		
		//2차원 배열 출력하기2
		//test.length는 2가 된다. test[i].length는 3이 된다.
		
		for(int i = 0; i < test.length; i++) {
			for(int j = 0; j < test[i].length; j++) {
				System.out.println(test[i][j]);
			}
		}
		
		//2차원 배열의 초기화
		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		//arr.length -> 3
		//arr[0].length -> 3
		
		//2차원 배열부터는 큰 방에 들어있는 작은 방의 크기가 다를 수 있다.
		int[][] iArr = {{1,2}, {3,4,5}, {6}};
		
		for(int i = 0; i < iArr.length; i++) {
			for(int j = 0; j < iArr[i].length; j++) {
				System.out.print(iArr[i][j] + " ");
			}
			System.out.println();
		}
		
		//2차원 배열은 작은방의 크기를 직접 지정할 수도 있습니다.
		System.out.println("------------------------------------------");
		int num[][] = new int[2][];
		num[0] = new int[3];
		num[1] = new int[2];
		
		int n = 0;
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; i < num[i].length; j++) {
				System.out.print((num[i][j] = n+=100) + " ");
			}
			System.out.println();
		}
			
		
	}

}
