package ex2_function;

import java.util.function.BiPredicate;

public class Ex6_function {
	public static void main(String[] args) {
		
//		boolean result = isEqualString("abc","abc", (s1,s2)->s1.equals(s2));
//		System.out.println(result);
		
		boolean result = isEqualString("abc","abc", String::equals);
		System.out.println(result);
	}
	public static boolean isEqualString(String s1 , String s2, BiPredicate<String, String>predicate) {
		return predicate.test(s1, s2);
	}
	

}
