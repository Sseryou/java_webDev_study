package ex2_function;

import java.util.function.Predicate;

public class Ex5_function {
	public static void main(String[] args) {
		//Consumer<T> 인터페이스 -> void accept(T t);
		//Function<T, R> 인터페이스 -> R apply (T t);
		//Predicate<T> 인터페이스 -> boolean Test(T t);
		
		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		
		Predicate<Integer> r = p.and(q); //논리곱
		System.out.println(r.test(90));
		
		Predicate<Integer> s = p.or(q);
		System.out.println(s.test(101)); //논리합
		
		Predicate<Integer> notP = p.negate(); //i >= 100
		System.out.println("p.test(100) : "  + p.test(100));
		System.out.println("notP.test(100) : " + notP.test(100));
		
	}

}
