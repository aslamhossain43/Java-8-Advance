package reduce;

import java.util.stream.Stream;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Apr 10, 2022
 *
 */
public class Main {

	public static void main(String[] args) {
		Stream<Integer> values = Stream.of(1, 2, 3, 4, 5);
		Integer result = values.reduce(0, (a, b) -> a + b);
		System.out.println(result);
	}
}
