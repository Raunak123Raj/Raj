package raunak;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableInterface implements Callable{
	
	public Object call() {
		System.out.println("call () - method Executed...");
		return "success";
	}
	
	
	public static void main(String[] args) throws Exception{
		CallableInterface c=new CallableInterface();
		
		ExecutorService es = Executors.newFixedThreadPool(10);
		
		for(int i=1;i<=15;i++) {
			Future submit = es.submit(c);
			System.out.println(submit.get().toString());
		}
		es.shutdown();
		
	}
}
