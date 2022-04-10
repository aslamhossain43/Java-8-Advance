package comparator;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Apr 10, 2022
 *
 */
public class BookServiceImpl {
	public List<BookModel> getSortingBooks() {
		List<BookModel> bookModels = new BookDAO().getBookModels();
		Collections.sort(bookModels, (o1, o2) -> o1.getName().compareTo(o2.getName()));
		return bookModels;
	}
}
