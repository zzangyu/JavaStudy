package practice;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadEx03 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService ex = Executors.newFixedThreadPool(3);
		List<CallableTask> list = List.of(new CallableTask("one"), new CallableTask("two"), new CallableTask("three"));
		List<Future<String>> results = ex.invokeAll(list);
		for (Future<String> future : results) {
			System.out.println(future.get());
		}
		ex.shutdown();
	}

}
