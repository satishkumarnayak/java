package org.garage.java.corejava.multithreading;

import org.junit.Test;

public class MultiThreadingTest {

//	@Test
	public void threadByThread() {

		MyThread t = new MyThread();
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("test main thread");
		}
	}
	
	@Test
	public void threadByRunnable() {

		MyThread t1 = new MyThread();
		Thread t = new Thread(new MyRunnable());
	//	Thread t = new Thread(t1);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("test main thread");
		}
	}
}
