package org.garage.java.corejava.multithreading.enhancements;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*  Thread Pools/ Executor Framework
 *  Creating a New Thread for Every Job May Create Performance and Memory
Problems.
 To Overcome this we should go for Thread Pool Concept.
 Thread Pool is a Pool of Already Created Threads Ready to do Our Job.
 Java 1.5 Version Introduces Thread Pool Framework to Implement Thread Pools.
 Thread Pool Framework is Also Known as Executor Framework.
 We can Create a Thread Pool as follows
ExecutorService service = Executors.newFixedThreadPool(3);//Our Choice
 We can Submit a Runnable Job by using submit().
service.submit(job);
 We can ShutdownExecutiorService by using shutdown().
service.shutdown();
*/
public class ExecutorServiceGarage {

	public static void main(String[] args) {

		PrintJob[] printJobs = { new PrintJob("job1"), new PrintJob("job2"), new PrintJob("job3"), new PrintJob("job4"),
				new PrintJob("job5") };

		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(PrintJob job : printJobs ) {
			service.submit(job);
		}
		
		service.shutdown();

	}

}

class PrintJob implements Runnable {

	String name;

	public PrintJob(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("Job Started by" + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Job Ended by" + Thread.currentThread().getName());

	}

}