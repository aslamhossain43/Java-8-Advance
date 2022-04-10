package supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Apr 10, 2022
 *
 */
public class Main {

	public static void main(String[] args) {
		Supplier<String> supplier = () -> "Array is empty";
		List<String> list = Arrays.asList();
		System.out.println(list.stream().findAny().orElseGet(supplier));

	}

}
