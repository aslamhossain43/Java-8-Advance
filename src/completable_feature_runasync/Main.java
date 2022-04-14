package completable_feature_runasync;

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

	public Void doSomething() throws InterruptedException, ExecutionException {
		Executor executor = Executors.newFixedThreadPool(5);
		CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> {
			List<Integer> list = Stream.of(1, 2, 3, 4, 5).collect(Collectors.toList());
			System.out.println("Thread Name: " + Thread.currentThread().getName());
			list.stream().forEach(t -> System.out.println(t));
		}, executor);
		return completableFuture.get();
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Main main = new Main();
		main.doSomething();
	}

}
