package ex2_operator;

public class Ex2_operator {

	public static void main(String[] args) {
		//���Կ�����
		//�캯���� �º��� �����Ѵ� ������� ��������
		
		int n1 = 10;
		int n2 = 7;
		System.out.println("=������ : n1 : " + n1 + " n2 : " + n2);
		
		//���մ��Կ����� : ��������ڿ� ���Կ����ڰ� ������ ���� (+=, -=, *=, /=, %=)
		//+=������						n1 = n1 + n2;
		System.out.println("+=������ : n1 += n2 " + (n1+=n2)); //17
		//������
		
		//-=������						n1 = n1 - n2;
		System.out.println("-=������ : n1 -= n2 " + (n1-=n2)); //10
		
		//*=������						n1 = n1 * n2;
		System.out.println("*=������ : n1 *= n2 " + (n1*=n2)); //70
		
		///=������						n1 = n1 / n2;
		System.out.println("/=������ : n1 /= n2 " + (n1/=n2)); //10
		
		//%=������						n1 = n1 % n2;
		System.out.println("%=������ : n1 %= n2 " + (n1%=n2)); //3
		
		//�񱳿�����
		//�� ���� ���� ���� �� ����ϴ� ������
		//���� ����� ���� �����ͷ� ��ȯ (true, false)�� ��ȯ�Ѵ�.
		
		 n1 = 10;
		 n2 = 7;
		 boolean result;
		 result = n1 < n2;
		 System.out.println(result); //false;
		
		 result = n1 == n2;
		 System.out.println("==������ : " + result);
		 
		 result = n1 != n2;
		 System.out.println("!=������ : " + result);
		 
		 //��������
		 //�񱳿����ڸ� ���� ������ 2�� �̻� �ʿ��Ҷ� ���ȴ�.
		 // &&, ||, !
		 // && : �յڿ����� ��� true���� true (�׸���)
		 	// && : ���� ������ �����̸� ���� ������ �������� �ʴ´�.
		 // || : �� �� �ϳ��� ������ true���� true (�Ǵ�)
		 	// || : ���� ������ ���̸� ���� ������ �������� �ʴ´�.
		 // ! : not true�� false�� false��  true�� �ٲ۴�.
		 
		 //�������� ���� �����ͷ� ��ȯ�Ѵ�.
		 
		 result = n1 > n2 && n1 != n2;
		 System.out.println("&&�������� �� : " + result);
		 
		 result = n1 < n2 || n1 != n2;
		 System.out.println("||�������� �� : " + result);
		 
		 System.out.println("!������ : " + !result);
		 
		 
		 
	}

}
