package Thread;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService ex = Executors.newFixedThreadPool(1);
		List<CallableTask> tasks = List.of(new CallableTask(",in28Minutes"), new CallableTask("Ranga"),
				new CallableTask("Adam"));
		List<Future<String>> results = ex.invokeAll(tasks);
		for (Future<String> future : results) {
			System.out.println(future.get());
		}

		ex.shutdown();
	}

}
