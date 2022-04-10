package predicate;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Apr 10, 2022
 *
 */
public class Main {

	public static void main(String[] args) {

//		Predicate<Integer> predicate = t -> t % 2 == 0;
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		list.stream().filter(t -> t % 2 == 0).forEach(l -> System.out.println("Even value: " + l));
	}

}
