package ex1_String;

import java.util.Scanner;

public class Ex1_String {
	public static void main(String[] args) {
		//�ڹٷ� ������� ��� ���α׷��� Ŭ������ �̷���� �ִ�.
		//�츮�� ���ڿ��� �����ϱ� ���� ����ߴ� String�� �ڹٿ� ����Ǿ��ִ�
		//Ŭ���� �Դϴ�.
		
		//String Ŭ������ 2���� Ư¡�� �������ִ�.
		//1) ��ü ��������� �ΰ���(�Ͻ���, �����)
		//2) �ѹ� ������ ���ڿ��� ������ ������ �ʴ´�(�Һ��� Ư¡)
		
		String s1 = "abc"; //�Ͻ��� ��ü ����
		String s2 = "abc";
		//�̹� �տ� ���� ���ڿ��� ������ �Ͻ��� ��ü�� �ִٸ�
		//�ռ� ������ ��ü�� �ּҸ� �����Ѵ�.
		
		//�Ͻ��� ��ü ������ �� �� �ִ� Ŭ������ String�ۿ� ����.
		//�ٸ� ��� Ŭ�������� new�� ����Ͽ� ����� ��ü ������ �ؾ��մϴ�.
		
		
		//== �����ڴ� �⺻ �ڷ����� ���Ҷ��� �����͸� ��������.
		//�׷��� ��ü���� �񱳸� �� ���� �ּҸ� ���ϴ� �����ڷ� ����� �ٲ��.
		String s3 = new String("abc"); //����� ��ü ���� 
		String s4 = new String("abc");
		
		System.out.println();
		
//		if(s1 == s2) {
//			System.out.println("s1�� s2�� �ּҰ� �����ϴ�.");
//		} else {
//			System.out.println("s1�� s2�� �ּҰ� �ٸ��ϴ�.");
//		}
//		
//		System.out.println();
//		
//		if(s2 == s3) {
//			System.out.println("s2�� s3�� �ּҰ� �����ϴ�.");
//		} else {
//			System.out.println("s2�� s3�� �ּҰ� �ٸ��ϴ�.");
//		}
//		
//		System.out.println();
//		
//		if(s3 == s4) {
//			System.out.println("s3�� s4�� �ּҰ� �����ϴ�.");
//		} else {
//			System.out.println("s3�� s4�� �ּҰ� �ٸ��ϴ�.");
//		}
//		
//		System.out.println();
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���ڿ� : ");
//		//��ĳ�ʸ� ���ؼ� ���ڿ��� �Է¹޾� ��ü�� ����������
//		//�ּҸ� �������� �ʴ´�.
//		String s5 = sc.next();
//		
//		System.out.println("------------------");
//		
//		if(s1 == s5) {
//			System.out.println("s1�� s5�� �ּҰ� �����ϴ�.");
//		} else {
//			System.out.println("s1�� s5�� �ּҰ� �ٸ��ϴ�.");
//		}
		
		//�Һ��� ��Ģ
		
		String greet = "�ȳ�";
		greet += "�ϼ���";
		System.out.println(greet);
		
		//�� �������� �ȳ���� ������ ����� �ȳ��ϼ����� �� �޸𸮸� �Ҵ����
		//�ȳ��� �Ҹ����� �ʰ� �� �������� ����
		//���� �ȳ��� JVM�� �������ݷ��Ͱ� ����
		
		
		
		
		
	}

}
