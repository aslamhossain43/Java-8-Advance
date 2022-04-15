package completable_feature_then_apply_accept_run;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Apr 14, 2022
 *
 */
public class Main {

	List<Employee> getData() {
		return Stream.of(new Employee("Aslam", "aslam@net.com", false, true),
				new Employee("Asha", "asha@net.com", true, false), new Employee("Zoti", "zoti@net.com", true, false),
				new Employee("Shobuj", "sobuj@net.com", true, false)).collect(Collectors.toList());
	}

	public CompletableFuture<Void> mailSendingService() throws InterruptedException, ExecutionException {
		Executor executor = Executors.newFixedThreadPool(5);
		CompletableFuture<Void> completableFuture = CompletableFuture.supplyAsync(() -> {
			System.out.println("Get Employees: " + Thread.currentThread().getName());
			return getData();
		}, executor).thenApplyAsync((employees) -> {
			System.out.println("Filter new joiner: " + Thread.currentThread().getName());
			return employees.stream().filter(employee -> employee.isNewJoiner() == true).collect(Collectors.toList());
		}, executor).thenApplyAsync((employees) -> {
			System.out.println("Filter learning pending: " + Thread.currentThread().getName());
			return employees.stream().filter(employee -> employee.isLearningPending() == false)
					.collect(Collectors.toList());
		}, executor).thenApplyAsync((employees) -> {
			System.out.println("Getting emails: " + Thread.currentThread().getName());
			return employees.stream().map(Employee::getEmail).collect(Collectors.toList());
		}, executor).thenAcceptAsync((emails) -> {
			System.out.println("Sending emails: " + Thread.currentThread().getName());
			emails.stream().forEach(Main::sendMail);
		},executor);
		return completableFuture;
	}

	public static void sendMail(String email) {
		System.out.println(email);
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Main main = new Main();
		main.mailSendingService().get();
	}

}
