package raunak;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableDemo implements Callable<Long> {

	int num;

	CallableDemo(int num) {
		this.num = num;
	}

	public Long call() throws Exception {
		long fact = 1;

		for (int count = num; count > 1; count--) {
			fact *= count; // fact = fact * count;
		}
		return fact;
	}
}

public class CallableMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		CallableDemo c = new CallableDemo(5);
		ExecutorService es = Executors.newFixedThreadPool(2);
		Future<Long> f = es.submit(c);

		System.out.println(f.get());
		
		es.shutdown();
	}
}
