package ex2_bread;

public class Method {
	
	public void makeBread() {
		System.out.println("���� ��������ϴ�.");
		System.out.println("-------------");
	}
	public void makeBread(int n) {
		for(int i = 0; i < n; i++) {
			System.out.println("���� ��������ϴ�.");
		}
		System.out.println("��û�Ͻ� " + n + "���� ���� ��������ϴ�.");
		System.out.println("-------------");
	}
	public void makeBread(int n, String s) {

		for(int i = 0; i < n; i++) {
			System.out.println(s + "���� ��������ϴ�.");
		}
		System.out.println("��û�Ͻ� " + n + "���� "+ s +"���� ��������ϴ�.");
		System.out.println("-------------");
	}

}
