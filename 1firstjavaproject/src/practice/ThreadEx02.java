package practice;

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
		Thread.sleep(5000);
		return "GOGO\t" + name;
	}

}

public class ThreadEx02 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService ex = Executors.newFixedThreadPool(3);
		Future<String> WelcomeFuture = ex.submit(new CallableTask("sirosiro"));
		String welcomeMassage = WelcomeFuture.get();
		System.out.println(welcomeMassage);
		ex.shutdown();
	}

}
