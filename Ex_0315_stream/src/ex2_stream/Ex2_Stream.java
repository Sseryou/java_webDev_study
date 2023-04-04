package ex2_stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex2_Stream {
	public static void main(String[] args) {
		//�⺻Ÿ���� ��Ʈ��
		//���׸��� ������� �ʰ� ���������� �ش� Ÿ���� ��Ʈ���� �ٷ� �� �ִ�.
		//����� Ÿ���� T�� ��Ʈ���� �⺻������ Stream�ε�,
		//�⺻�ڷ����� �ٷ���� ����ڽ� & ��ڽ��� �߻��Ͽ� ��ȿ������ �����Ѵ�.
		//(Integer <-> int)
		//��ȿ������ ���̱� ���� ������ �ҽ��� ��Ҹ� �⺻������ �ٷ�� ��Ʈ���� �����ȴ�.
		//IntStream, LongStream, DoubleStream...
		//�⺻�ڷ����� �����ϰ� ����� �� �ִ� �޼��带 �����Ѵ�.
		
		//1~10������ ������ ���ϴ� �ڵ� �ۼ��غ���
		
		//range(���۰�, ����) : ���۰��� ����, ������ �̸�
		//rangeClosed(���۰�, ����) : ���۰� ����, ���� ����
		int result = IntStream.rangeClosed(1,10).sum();
		System.out.println("1~10 ���� : " + result);
		
		//IntStream ints(���۰�, ���ᰪ)���۰� ����, ������ �̸�
		//LongStream longs(���۰�, ���ᰪ)
		//DoubleStream doubles(���۰�, ���ᰪ)
		
		Random rnd = new Random();
		IntStream stream = rnd.ints(1,46);//�������ϱ�
		stream.limit(6).distinct().forEach(System.out::println);
		
		System.out.println();
		
		//�� ��Ʈ���� ���� - concat();
		String[] str1 = {"123","456","789"};
		String[] str2 = {"abc","def","ghi"};
		
		Stream<String> stream1 = Stream.of(str1);
		Stream<String> stream2 = Stream.of(str2);
		Stream<String> stream3 = Stream.concat(stream1, stream2);
		stream3.forEach(System.out::print);
		
		
		
		
		
		
	}
	
}
