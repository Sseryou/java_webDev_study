package calculator;

import java.util.ArrayList;

public class Calculator6 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("�̸�1");
		list.add("�̸�2");
		list.add("�̸�3");
		list.add("�̸�4");
		list.add("�̸�5");
		list.add("�̸�6");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" , ");
		}
		
		//���� for��
		for(String name : list) {
			System.out.println(name + " , ");
			
		}
		
		//forEach() ����Ͽ� ����ϱ�
		list.forEach(x -> System.out.println(x+ " , "));
		
		
	}

}
