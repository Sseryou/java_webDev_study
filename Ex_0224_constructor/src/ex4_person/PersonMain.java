package ex4_person;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", 40, "010-1111-1111");
		
		Person p2 = new Person("��浿", 30, "010-2222-2222");
		
		p2.name = "���۸�";
		
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.tel);
		
		//�Ķ���͸� �޴� �����ڸ� ������ ��������
		//�⺻�����ڴ� ����� �� �����ϴ�.
		//�⺻�����ڸ� ���� ������ ���´ٸ� ����� �� �ִ�.
		Person p3 = new Person();
		
	}

}
