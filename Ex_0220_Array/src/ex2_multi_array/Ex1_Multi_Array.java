package ex2_multi_array;

public class Ex1_Multi_Array {

	public static void main(String[] args) {
		//������ �迭 : ������ �迭�̶� 2���� �̻��� �迭�� �ǹ��ϸ�,
		//�迭�� ��ҷ� �� �ٸ� �迭�� ������ �ִ°��� �ǹ��մϴ�.
		//2���� �迭�� ��ҷν� 1���� �迭�� ������ �ְ�,
		//3���� �迭�� ��ҷν� 2���� �迭�� ������ �ֽ��ϴ�.
		
		//�ڷ���[][] �迭�� = new �ڷ���[1���� �迭�� ����][1���� �迭�� ���� �������� ����];
		//�ڷ��� [][][] �迭�� = new �ڷ���[][][];
		
		//2���� �迭������ ���� ��������� 3�������ʹ� ���� ������ �ʴ´�.
		
		int[][] test = new int[2][3];
		
		//2���� �迭�� ������ �濡 �����ϴ� ��
		//�迭�� [2�����迭�� index][1�����迭�� index] = ������;
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
		
		test[1][0] = 400;
		test[1][1] = 500;
		test[1][2] = 600;
		
		//2���� �迭 ����ϱ�
		//System.out.println(test[0][0]);
		
		//2���� �迭 ����ϱ�2
		//test.length�� 2�� �ȴ�. test[i].length�� 3�� �ȴ�.
		
		for(int i = 0; i < test.length; i++) {
			for(int j = 0; j < test[i].length; j++) {
				System.out.println(test[i][j]);
			}
		}
		
		//2���� �迭�� �ʱ�ȭ
		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		//arr.length -> 3
		//arr[0].length -> 3
		
		//2���� �迭���ʹ� ū �濡 ����ִ� ���� ���� ũ�Ⱑ �ٸ� �� �ִ�.
		int[][] iArr = {{1,2}, {3,4,5}, {6}};
		
		for(int i = 0; i < iArr.length; i++) {
			for(int j = 0; j < iArr[i].length; j++) {
				System.out.print(iArr[i][j] + " ");
			}
			System.out.println();
		}
		
		//2���� �迭�� �������� ũ�⸦ ���� ������ ���� �ֽ��ϴ�.
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
