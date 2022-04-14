package bi_function_map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Apr 14, 2022
 *
 */
public class Main {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Aslam", 100);
		map.put("Asha", 200);
		map.put("Zoti", 300);
//		BiFunction<String, Integer, Integer> biFunction = (key, value) -> value + 100;
		map.replaceAll((key, value) -> value + 100);
		System.out.println(map);

	}

}
