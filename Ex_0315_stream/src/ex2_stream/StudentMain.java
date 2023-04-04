package ex2_stream;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StudentMain {
	public static void main(String[] args) {
		
		Student[] student = {
				new Student("�л�1",3,300),
				new Student("�л�2",1,200),
				new Student("�л�3",2,100),
				new Student("�л�4",2,150),
				new Student("�л�5",1,200),
				new Student("�л�6",1,290),
				new Student("�л�7",2,180),
				new Student("�л�8",3,100),
				new Student("�л�9",3,300)
				
		};
		
		Stream.of(student)
		.sorted(Comparator
				.comparing(Student::getBan) //�ݺ��� ����
				.thenComparing(Student::getTotalScore)) //������ ����
		.forEach(System.out::println);
		
		
		System.out.println();
		//map()
		//��Ʈ���� ��ҿ��� ����� �� �߿��� ���ϴ� �ʵ常 �̾Ƴ��ų� Ư�� ���·� ��ȯ�ؾ��ϴ� ���
		//mapToDouble()
		//mapToInt()
		//mapToLong()
		
		//Student��Ʈ���� score��Ʈ������ ��ȯ�ϰ� ������ �ֿܼ� ����ϱ�
		Stream.of(student).mapToInt(x -> x.getTotalScore()).forEach(System.out::println);
		
		System.out.println();
//		//�л����� ������ ������ ���ϴ� ��Ʈ�� �����ϰ� ����ϱ�
//		int total = Stream.of(student).mapToInt(x -> x.getTotalScore()).reduce(0, (x,y) -> x+y);
//		System.out.println("�� ���� : " + total);
//		
//		System.out.println();
//		//�л����� ������ ��� ���ϱ�
//		double avg = Stream.of(student).mapToInt(x -> x.getTotalScore()).average().getAsDouble();
//		System.out.println("���� ��� : " + avg);
		
		IntStream stream = Stream.of(student).mapToInt(Student::getTotalScore);
		IntSummaryStatistics stat = stream.summaryStatistics();
		System.out.println(stat);
		
	}

}
