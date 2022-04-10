package list_sort_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Apr 10, 2022
 *
 */
public class Main {

	public static void main(String[] args) {
		List<BookModel> bookModels = new ArrayList<BookModel>();
		bookModels.add(new BookModel(2, "Java"));
		bookModels.add(new BookModel(3, "JavaScript"));
		bookModels.add(new BookModel(1, "Python"));
		bookModels.add(new BookModel(4, "C"));
		
		
//		Collections.sort(bookModels, (o1,o2)->o2.getId()-o1.getId());
		
//		bookModels.stream().sorted((o1,o2)->o1.getId()-o2.getId()).forEach(System.out::println);
		bookModels.stream().sorted(Comparator.comparing(BookModel::getId)).forEach(System.out::println);

	}

}
