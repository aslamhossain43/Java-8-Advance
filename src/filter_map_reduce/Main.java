package filter_map_reduce;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Apr 10, 2022
 *
 */
public class Main {

	List<Employee> getEmployee() {
		return Stream.of(new Employee("C", 100),new Employee("A", 400), new Employee("B", 200), new Employee("A", 300))
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		Main main = new Main();
		List<Employee> employees = main.getEmployee();

		double average = employees.stream()
				.filter(t -> t.getGrade().equalsIgnoreCase("a"))
				.map(r -> r.getSalary())
				.mapToDouble(i -> i)
				.average()
				.getAsDouble();
		System.out.println(average);

	}
}
