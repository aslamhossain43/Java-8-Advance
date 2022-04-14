package bi_consumer_map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

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
		BiConsumer<String, Integer> biConsumer = (key, value) -> System.out.println(key + ", " + value);
		map.forEach(biConsumer);

	}

}
