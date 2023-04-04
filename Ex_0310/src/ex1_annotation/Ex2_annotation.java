package ex1_annotation;


@TestInfo(tester="홍길동", datetime=@DateTime(date="20230310",time="170408")) //value를 통해서 TestInfo의 value() 메서드에 정보가 저장된다.
//value에 여러개를 사용할 때는 {}를 사용해야 한다.
//value는 생략이 가능하다.
public class Ex2_annotation {
	
		//2.메타 애노테이션
		//애노테이션을 만들기 위한 애노테이션
		//스프링에서 애노테이션으로 많이 통제를 한다.
		//java.lang.annotation 패키지에 정의되어 있다.
	
		//@Target
		//애노테이션이 적용 가능한 대상(범위)를 지정하는데 사용된다.
		//말 그래도 애노테이션을 붙일 수 있는 대상을 지정하는 것.
		//@Target({TYPE, FIELD, TYPE_USE, METHOD})로 여러개 사용 가능...
	
		//@Documented
		//@Inherited
		//@Retention
		//애노테이션이 유지되는 기간을 지정하는데 사용된다.
	
		//@Retention(SOURCE) : 애노테이션이 소스코드에만 이용가능, 컴파일후 사라짐
		//@Retention(CLASS) : 애노테이션이 클래스파일엔 존재하지만 런타임에는 사라짐(실행시 사용불가)
		//@Retention(RUNTIME) : 애노테이션이 컴파일러와 런타임에 사용가능(실행시 정보 제공)
	
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
		
		
	
		
		 //애노테이션 타입 정의하기
		//@기호를 붙이는 것을 제외하면 인터페이스를 정의하는것과 동일하다.
		//"@Override"는 애노테이션이고 Override는 애노테이션의 타입이다.
		//@interface 애노테이션{
		//
		//}
	
	
}
