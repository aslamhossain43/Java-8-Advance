package completable_feature_supplyasync;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import map.Employee;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Apr 14, 2022
 *
 */
public class Main {

	List<Employee> getData() {
		return Stream.of(new Employee(1, "Aslam", Arrays.asList("1234", "5678")),
				new Employee(2, "Asha", Arrays.asList("98243", "22178")),
				new Employee(4, "Zoti", Arrays.asList("4724", "0368")),
				new Employee(3, "Shobuj", Arrays.asList("40626", "43368"))).collect(Collectors.toList());
	}

	public List<Employee> getEmployees() throws InterruptedException, ExecutionException {
		Executor executor = Executors.newCachedThreadPool();
		CompletableFuture<List<Employee>> completableFuture = CompletableFuture.supplyAsync(() -> {
			System.out.println("Thread Name: " + Thread.currentThread().getName());
			return getData();
		}, executor);
		return completableFuture.get();
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Main main = new Main();
		List<Employee> employees = main.getEmployees();
		employees.stream().forEach(System.out::println);
	}

}
