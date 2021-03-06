package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {

	private String name;

	public CallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "\nHello" + name;
	}

}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService ex = Executors.newFixedThreadPool(1);
		Future<String> welcomeFuture = ex.submit(new CallableTask(",in28Minutes"));
		System.out.print("new CallableTask(\"in28Minutes\")");

		String welcomeMessage = welcomeFuture.get();
		System.out.print(welcomeMessage);
		System.out.print("\nmain completed");
		ex.shutdown();
	}

}
