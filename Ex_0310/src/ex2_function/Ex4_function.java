package ex2_function;

import java.util.function.Function;

public class Ex4_function {
	public static void main(String[] args) {
//		Function<String, Integer> f = s -> Integer.parseInt(s,16);
//		//parseInt(s,16)���� 16�� ��(s)�� 16������ �ٲ��شٴ� �ǹ��̴�.
//		Function<Integer, String> g = i -> Integer.toBinaryString(i);
//		//2������ �ٲ��ִ� �޼����̴�.
		
//		Function<String, String> h = f.andThen(g);
//		System.out.println(h.apply("FF"));
//		
//		Function<Integer, String> g = i -> Integer.toBinaryString(i);
//		Function<String, Integer> f = s -> Integer.parseInt(s,16);
//		Function<Integer, Integer> h = f.compose(g);
//		System.out.println(h.apply(2)); //2 -> "10" -> 16
		
		Function<String, String> f = x -> x; //�׵��Լ�
		//Function<String, String> f = Function.identity();
		//�� �� ���� ����� ����.
		
		System.out.println(f.apply("hello"));
		
		
		
	}

}
