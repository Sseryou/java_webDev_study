package ex1_file;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		String path = "D:\\web1500_sms\\java";
		
		File f = new File(path);
		//����Ŭ������ �ι�° ���
		//���� �������� �����϶� �ش� ������ ���� ��������� �̸��� ������ �� �ֽ��ϴ�.
		
		//���� == ���丮
		if(f.isDirectory()) {
			String[] names = f.list();
			//���ĺ� ������ �����Ѵ�.
			
			for(String s : names) {
				System.out.println(s);
			}
		}
		
		
		
	}

}
