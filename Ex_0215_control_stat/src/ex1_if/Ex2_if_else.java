package ex1_if;

public class Ex2_if_else {

	public static void main(String[] args) {
		
		//if-else
		
		//�⺻��
		//if(���ǽ�){
		//	������ ���϶� ������ ���
		//} else {
		//	���ǽ��� ���� �ƴҶ� ������ ��� 
		//}
		
		int n = 49;
		String str = null;
		
		if(++n >= 50) {
			str = "n�� 50�̻��� ��";
		} else {
			str = "n�� 50�̸��� ��";
		}
		System.out.println(str);
		
		//���� age�� ���̸� �����ϰ�, 30�̻��̸�
		//"��Ǹ�ŭ ��̳׿�" ���, �׷��������� "�� ��ŵ� �ǰڳ׿�"
		//����ϴ� ���ǹ� �ۼ��ϱ�
		//���������δ� �����մϴ� ��� ���� ����ϱ�
		
		int age = 25;
		String message;
		
		if (age >= 30) {
			message = "��Ǹ�ŭ ��̳׿�";
		} else {
			message = "�� ��ŵ� �ǰڳ׿�";
		}
		
		System.out.println(message + " �����մϴ�.");
		// �� ���ǹ� �ڵ带 ���׿����ڷ� �ٲٱ�
		
		str = age >= 30 ? "��Ǹ�ŭ ��̳׿�" : "�� ��ŵ� �ǰڳ׿�" ;
		
	}

}
