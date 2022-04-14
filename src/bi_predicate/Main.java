package bi_predicate;

import java.util.function.BiPredicate;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Apr 14, 2022
 *
 */
public class Main {

	public static void main(String[] args) {
		BiPredicate<String, String> equals = (s1, s2) -> s1.equals(s2);
		BiPredicate<String, String> length = (s1, s2) -> s1.length() == s2.length();
		boolean result = equals.or(length).test("ab", "ac");
		System.out.println(result);

	}

}
