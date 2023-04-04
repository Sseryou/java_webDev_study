package ex1_annotation;


@TestInfo(tester="ȫ�浿", datetime=@DateTime(date="20230310",time="170408")) //value�� ���ؼ� TestInfo�� value() �޼��忡 ������ ����ȴ�.
//value�� �������� ����� ���� {}�� ����ؾ� �Ѵ�.
//value�� ������ �����ϴ�.
public class Ex2_annotation {
	
		//2.��Ÿ �ֳ����̼�
		//�ֳ����̼��� ����� ���� �ֳ����̼�
		//���������� �ֳ����̼����� ���� ������ �Ѵ�.
		//java.lang.annotation ��Ű���� ���ǵǾ� �ִ�.
	
		//@Target
		//�ֳ����̼��� ���� ������ ���(����)�� �����ϴµ� ���ȴ�.
		//�� �׷��� �ֳ����̼��� ���� �� �ִ� ����� �����ϴ� ��.
		//@Target({TYPE, FIELD, TYPE_USE, METHOD})�� ������ ��� ����...
	
		//@Documented
		//@Inherited
		//@Retention
		//�ֳ����̼��� �����Ǵ� �Ⱓ�� �����ϴµ� ���ȴ�.
	
		//@Retention(SOURCE) : �ֳ����̼��� �ҽ��ڵ忡�� �̿밡��, �������� �����
		//@Retention(CLASS) : �ֳ����̼��� Ŭ�������Ͽ� ���������� ��Ÿ�ӿ��� �����(����� ���Ұ�)
		//@Retention(RUNTIME) : �ֳ����̼��� �����Ϸ��� ��Ÿ�ӿ� ��밡��(����� ���� ����)
	
		//@Repeatable
	
		public static void main(String[] args) {
			TestInfo testinfo = Ex2_annotation.class.getAnnotation(TestInfo.class);
			String[] value = testinfo.value();
			System.out.println(testinfo.value());
			for(String val : value) {
				System.out.print(val + " ");
			}
			String[] tools = testinfo.testTool();
			for(String tool : tools) {
				System.out.print(tool + " ");
			}
			System.out.println();
			String tester = testinfo.tester();
			System.out.println(tester);
			
			String date = testinfo.datetime().date();
			String time = testinfo.datetime().time();
			System.out.printf("date = %s, time = %s", date, time);
			
		}
		
		
	
		
		 //�ֳ����̼� Ÿ�� �����ϱ�
		//@��ȣ�� ���̴� ���� �����ϸ� �������̽��� �����ϴ°Ͱ� �����ϴ�.
		//"@Override"�� �ֳ����̼��̰� Override�� �ֳ����̼��� Ÿ���̴�.
		//@interface �ֳ����̼�{
		//
		//}
	
	
}
