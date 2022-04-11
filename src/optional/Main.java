package optional;

import java.util.Arrays;
import java.util.Optional;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Apr 10, 2022
 *
 */
public class Main {

	Employee getEmployee() {
		return new Employee(1, null, Arrays.asList("1234", "5678"));
	}

	public static void main(String[] args) {
		Main main = new Main();
		Employee employee = main.getEmployee();

//empty()
//		Optional<Object> empty = Optional.empty();
//		System.out.println(empty);
// of()
//		Optional<String> ofEmploye = Optional.of(employee.getName());
//		System.out.println(ofEmploye.get());
// ofNullable()
		Optional<String> nullAbleEmployee = Optional.ofNullable(employee.getName());
		System.out.println(nullAbleEmployee.orElse("Aslam"));
	}

}
