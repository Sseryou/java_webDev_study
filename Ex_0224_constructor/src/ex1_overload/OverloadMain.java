package ex1_overload;

public class OverloadMain {
	public static void main(String[] args) {
		Ex1_overload ol = new Ex1_overload();
		ol.result();
		ol.result(1);
		ol.result('a');
		ol.result("����", 100);
		ol.result(100, "����");
		
		//�����ε��� ���� : �޼��带 ��Ȳ�� ���� ������ �ʿ䰡 ����.
		//ex) : println
		
		System.out.println();
	}

}
