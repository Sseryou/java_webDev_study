package ex5_super;

public class Child extends Parent{
	
	public Child(int n) {
		//super : �θ�Ŭ����
		super(n); //�θ�Ŭ������ �����ڰ� ������ �Ǿ��ִ�.
		//�θ�����ڿ� �Ķ���Ͱ� �ִٸ� �θ�����ڸ� ������ �� ����.
		System.out.println("�ڽ�(Child)Ŭ����");
	}
	
	@Override
	public int result() {
		return super.result();
	}

}
