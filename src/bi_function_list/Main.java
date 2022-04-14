package bi_function_list;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Apr 14, 2022
 *
 */
public class Main {

	public static void main(String[] args) {
		List<Integer> list1 = Stream.of(1, 2, 6, 7, 8).collect(Collectors.toList());
		List<Integer> list2 = Stream.of(4, 5, 3, 4, 5).collect(Collectors.toList());

		BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction = (l1, l2) -> {
			return Stream.of(l1, l2).flatMap(List::stream).sorted().distinct().collect(Collectors.toList());
		};

		System.out.println(biFunction.apply(list1, list2));

	}

}
