package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Apr 10, 2022
 *
 */
public class Main {

	public static void main(String[] args) {
//		Consumer<Integer> consumer = (l) -> System.out.println("Value: " + l);
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		list.stream().forEach(l -> System.out.println("value: " + l));
	}

}
