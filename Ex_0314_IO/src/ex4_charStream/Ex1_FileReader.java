package ex4_charStream;


import java.io.FileReader;
import java.io.IOException;

public class Ex1_FileReader {
	public static void main(String[] args) {
		
		//char����� ��Ʈ���� ...Reader, Writer�� �ڽ�Ŭ������ ����Ѵ�.
		//�⺻������ 2byte�� �����ϱ� ������ 2byte���� ������ ���ϵ�
		//���� ������� ����
		
		try {
			FileReader fr = new FileReader("D:\\web1500_sms\\java/test.txt");
			
			int code = 0;
			while((code = fr.read()) != -1) {
				System.out.println((char)code);
			}
			//1byte¥���� �ƽ�Ű�ڵ�� �о���� 2byte¥���� �����ڵ�� �˾Ƽ�
			//�о���� ������ ���ڰ� ������ ���� ����.
			
			//����, ������, �̹�����  ���� ������ ������ �� 2byte�� �����ϴ°�
			//���� ������ �ֽ��ϴ�.
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
