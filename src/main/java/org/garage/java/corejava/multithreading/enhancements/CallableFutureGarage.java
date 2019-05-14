package org.garage.java.corejava.multithreading.enhancements;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* In the Case of Runnable Job Thread won’t Return anything.
 If a Thread is required to Return Some Result after Execution then we should go for
Callable.
 Callable Interface contains Only One Method public Object call() throws Exception.
 If we Submit a Callable Object to Executor then the Framework Returns an Object
of Type java.util.concurrent.Future
 The Future Object can be Used to Retrieve the Result from Callable Job.*/

public class CallableFutureGarage {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		MyCallable[] jobs = { new MyCallable(10), new MyCallable(20), new MyCallable(30), new MyCallable(40),
				new MyCallable(50),new MyCallable(10),new MyCallable(20),new MyCallable(10) };

		ExecutorService service = Executors.newFixedThreadPool(3);
		List<Future> futures = new ArrayList();
		for (MyCallable job : jobs) {
			Future future = service.submit(job);
			futures.add(future);
		}

		for (Future future : futures) {
			int sum = ((Integer) future.get()).intValue();
			System.out.println(new Date() + "--->" + sum);
		}

		service.shutdown();

	}

}

class MyCallable implements Callable {

	int num;

	public MyCallable(int num) {
		this.num = num;
	}

	public Object call() throws Exception {
		int sum = 0;
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < num; i++) {
			Thread.sleep(1000);
			sum += i;
		}
		return sum;
	}
}