package ex1_file;

import java.io.File;

public class Ex3_File {
	
	public static void main(String[] args) {
		String path = "D:\\web1500_sms\\java/aaa/bbb";
		
		File f = new File(path);
		
		//����Ŭ������ �������������� �������� �ʴ� ��ΰ� ���ԵǾ��ִ��� �Ǵ��� �� �ִ�.
		//exist() : ����Ŭ������ path��η� ã�ư��� ��
		//���������� ������ ������ �����Ѵٸ� true�� ��ȯ
		if(!f.exists()) {
			System.out.println("���� ����");
			f.mkdirs();//������ ������ִ� �޼���
		}
		
		//���� Ŭ������ Ư�� ������ ����ų�, Ư�� ������ ����ִ� ������ �о���°���
		//�Ұ����ϴ�.
		
		
		
	}
}
