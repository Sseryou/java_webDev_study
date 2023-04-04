package ex2_function;

import java.util.function.Function;

public class Ex4_function {
	public static void main(String[] args) {
//		Function<String, Integer> f = s -> Integer.parseInt(s,16);
//		//parseInt(s,16)에서 16은 값(s)를 16진수로 바꿔준다는 의미이다.
//		Function<Integer, String> g = i -> Integer.toBinaryString(i);
//		//2진수로 바꿔주는 메서드이다.
		
//		Function<String, String> h = f.andThen(g);
//		System.out.println(h.apply("FF"));
//		
//		Function<Integer, String> g = i -> Integer.toBinaryString(i);
//		Function<String, Integer> f = s -> Integer.parseInt(s,16);
//		Function<Integer, Integer> h = f.compose(g);
//		System.out.println(h.apply(2)); //2 -> "10" -> 16
		
		Function<String, String> f = x -> x; //항등함수
		//Function<String, String> f = Function.identity();
		//위 둘 식의 결과는 같다.
		
		System.out.println(f.apply("hello"));
		
		
		
	}

}
