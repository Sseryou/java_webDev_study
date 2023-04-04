package ex4_Set;

import java.util.HashSet;
import java.util.Random;

public class Ex1_Set {
	public static void main(String[] args) {
		// �÷���(collection) : java.util��Ű���� �ִ� �������̽�
		// �迭�� ������ �����Ͽ� index������ �������� ���� �ټ��� ��ü��
		// �ٷ�� ���� ����ϴ� ���α׷��� ���

		// Set, Map, List -> �÷��� �������̽�

		// Set �������̽��� �����ϰ� �ִ� Ŭ����
		// HashSet, TreeSet

		// Set���� �������� �߻�޼��尡 �������̵�(������)�� �� �Ǿ��ִ�.
		HashSet<String> hs1 = new HashSet<>();

		// set�� �����͸� �߰��ϴ¹�
		hs1.add("a");
		hs1.add("b");
		hs1.add("f");
		hs1.add("d");

		// HashSet�� ����ִ� ����� ������ ���� �޼���
		System.out.println("hs1�� ����� ���� : " + hs1.size());

		// HashSet�� �ߺ��� �����͸� �߰��� �� ����.
		System.out.println(hs1.add("a"));
		hs1.add("b");

		// HashSet�� ����Ǿ��ִ� �����͸� �����ϴ� ��
		hs1.remove("a");

		// HashSet�� ���
		System.out.println(hs1);

		// HashSet�� ����Ǿ��ִ� ��� �����͸� �����ϴ� ��
		hs1.removeAll(hs1); // ����� �������� ��ȯ���ش�.
		hs1.clear(); // �����ϰ� ��ȯ�ϴ°��� ����.
		System.out.println(hs1);

		// HashSet ��ü hs2�� ����� 1~45���� ���� 6���� ��ҷ� �־ ����ϱ�

		HashSet<Integer> hs2 = new HashSet<>();
//		Random r = new Random();
//		for (int i = hs2.size(); i < 6; i++) {
//			if (hs2.add(r.nextInt(45) + 1) == false) {
//				i--;
//				continue;
//			}
//		}
//		System.out.println(hs2);
		
		while (hs2.size() < 6) {
			int rnd = new Random().nextInt(45)+1;
			
			hs2.add(rnd);
		}
		System.out.println(hs2);
		//index�� ���� ������ ��� �ϳ��ϳ��� ������ �� ���� ���ٴ� ��
		//Set -> �迭�� ��ȯ
		
		
		Integer[] arr = hs2.toArray(new Integer[0]);
		//Integer[0] --> �迭�� ���� ������ 0���� ������ Set�� add�ص� ����� ������ŭ
		//�˾Ƽ� ���� ������ش�.
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %d\n",i, arr[i]);
		}

	}
	
	
	
	

}
