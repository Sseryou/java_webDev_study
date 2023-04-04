package ex4_charStream;


import java.io.FileReader;
import java.io.IOException;

public class Ex2_FileReader {
	
	//test.txt���Ͽ� �ѱ�, ���� (�ҹ���, �빮�� ����) �� ��� �ۼ�
	//text.txt�� ������ �о�ͼ�
	//���뿡 ������ �빮�ڰ� �����, �ҹ��ڰ� �����
	//������ ���� ����ϼ���
	
	//���
	//�빮�� : X��
	//�ҹ��� : X��
	
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("D:\\web1500_sms\\java/test.txt");
			
			int code = 0;
			int up = 0;
			int down = 0;
			while((code = fr.read()) != -1) {
				System.out.println((char)code);
				
				if(code >= 'A' && code <= 'Z') {
					up++;
				}
				if(code >= 'a' && code <= 'z') {
					down++;
				}
			}
			
			fr.close();
			System.out.println("�빮�� ���� : " + up);
			System.out.println("�ҹ��� ���� : " + down);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
