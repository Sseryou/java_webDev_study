package ex2_Map;

import java.util.HashMap;
import java.util.Scanner;

public class Ex3_Map {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("kim", 1111);
		map.put("lee", 2222);
		map.put("park", 3333);
		
		//id : aaa
		//pw : 1111
		//���̵� �������� �ʽ��ϴ�.
		
		//id : lee
		//pw : 3333
		//��й�ȣ ����ġ
		
		//id : park
		//pw : 3333
		//�α��� ����
		
		//Ű���忡�� id�� pw�� �Է¹ޱ�
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵� �Է��� �ּ���.");
			String id = sc.next();
			System.out.println("��й�ȣ�� �Է��� �ּ���.");
			int pw = sc.nextInt();
			
		if(map.containsKey(id)) {
			if(map.get(id) == pw) {
				System.out.println("�α��� ����");
				break;
			}else {
				System.out.println("��й�ȣ ����ġ");
			}
		}else {
			System.out.println("���̵� �������� �ʽ��ϴ�.");
		}
		}
	}
	
	
	

}
