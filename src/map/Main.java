package map;

import java.util.Arrays;
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

	List<Employee> getEmployees() {
		return Stream.of(new Employee(1, "Aslam", Arrays.asList("1234", "5678")),
				new Employee(2, "Asha", Arrays.asList("98243", "22178")),
				new Employee(4, "Zoti", Arrays.asList("4724", "0368")),
				new Employee(3, "Shobuj", Arrays.asList("40626", "43368"))).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		Main main = new Main();
		List<Employee> employees = main.getEmployees();

		// map
		// one-to-one -- one employee has one id
		// transformation from object to string list
//		List<Integer> ids = employees.stream().map(em -> em.getId()).collect(Collectors.toList());
//		System.out.println(ids);

		// flat mapp
		// one-to-many
		List<List<String>> phones = employees.stream().map(em -> em.getPhones()).collect(Collectors.toList());
		System.out.println(phones);

		List<String> flaListPhones = employees.stream().flatMap(em -> em.getPhones().stream())
				.collect(Collectors.toList());
		System.out.println(flaListPhones);

	}

}
