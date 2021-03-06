package practice;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadEx04 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService ex = Executors.newFixedThreadPool(3);
		List<CallableTask> tasks = List.of(new CallableTask("gogo"), new CallableTask("nono"),
				new CallableTask("gogo!"));
		String results = ex.invokeAny(tasks);
		System.out.println(results);

		ex.shutdown();
	}

}
