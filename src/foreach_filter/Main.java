package foreach_filter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Apr 10, 2022
 *
 */
public class Main {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Aslam");
		names.add("Zoti");
		names.add("Asha");
		names.add("Shobuj");

		Map<Integer, String> nameMap = new HashMap<Integer, String>();
		nameMap.put(1, "Aslam");
		nameMap.put(2, "Zoti");
		nameMap.put(3, "Asha");
		nameMap.put(4, "Shobuj");

//		names.stream().filter(t -> t.startsWith("A")).forEach(t -> System.out.println(t));
		nameMap.entrySet().stream().filter(t -> t.getKey() % 2 == 0).forEach(obj -> System.out.println(obj));
	}

}
