package ex2_Map;

import java.util.HashMap;

public class Ex1_Map {
	public static void main(String[] args) {
		//Map������ Ű(Key)�� ��(value)�� �� ���� �����ͷ� ����˴ϴ�.
		//Map������ Key���� ���� Value���� �˻��ϱ� ������ ���� ���� �����͸�
		//��ȸ�ϴ� �� �־ �ſ� �پ ������ �����մϴ�.
		
		//Map�� �������̽��̰� Map�������̽��� �����ϴ� Ŭ���� �� ���� ���Ǵ�
		//Ŭ������ HashMap�Դϴ�.
		
		HashMap<Integer, Character> map = new HashMap<Integer, Character>();
		
		//HashMap�� ��Ҹ� �߰��� ��
		map.put(1, 'A');
		map.put(2, 'B');
		map.put(3, 'C');
		
		//map�� ����Ǵ� value���� �ߺ��� �� �� �ִ�.
		//���� key������ �߰��� �ϸ� ���Ӱ� �߰��� �ȴ�.
		map.put(4, 'A');
		
		//map�� ����Ǵ� key���� �ߺ��� �� �� ����.
		//������ ���� �̸��� ���� key�� �ִٸ� value�� �����Ѵ�.
		map.put(1, 'F');
		
		//HashMap�� ũ��
		System.out.println("map�� ũ�� : " + map.size());
		
		//HashMap�� ��� �����ϱ�
		//key���� �̿��Ͽ� ��Ҹ� �����մϴ�.
		map.remove(3);
		
		//HashMap�� ���
		System.out.println(map);
		
		//HashMap���� value���� �����ϱ�
		//key���� ���� Value���� �����´�.
		char ch = map.get(1);
		System.out.println("map.get(1) : " + ch);
	}
	

}
