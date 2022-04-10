package map_sort_lambda;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import comparator.BookModel;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Apr 10, 2022
 *
 */
public class Main {

	public static void main(String[] args) {
		Map<Integer, BookModel> bookMap = new HashMap<Integer, BookModel>();
		bookMap.put(2, new BookModel(2, "Java"));
		bookMap.put(3, new BookModel(3, "JavaScript"));
		bookMap.put(1, new BookModel(1, "Python"));
		bookMap.put(4, new BookModel(4, "C"));
		
		
//		bookMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
//		bookMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
//		bookMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(BookModel::getId))).forEach(System.out::println);
		bookMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(BookModel::getId).reversed())).forEach(System.out::println);

	}

}
