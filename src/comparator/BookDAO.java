package comparator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Apr 10, 2022
 *
 */
public class BookDAO {
	public List<BookModel> getBookModels() {
		List<BookModel> bookModels = new ArrayList<BookModel>();
		bookModels.add(new BookModel(2, "Java"));
		bookModels.add(new BookModel(3, "JavaScript"));
		bookModels.add(new BookModel(1, "Python"));
		bookModels.add(new BookModel(4, "C"));
		return bookModels;
	}
}
