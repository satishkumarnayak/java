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

//	@Test
	public void threadByRunnable() {

		MyThread t1 = new MyThread();
		Thread t = new Thread(new MyRunnable());
		// Thread t = new Thread(t1);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("test main thread");
		}
	}

	// to pause current executing Thread for giving the chance of remaining waiting
	// Threads of same priority
//	@Test
	public void threadByThreadYield() {

		MyThreadYield t = new MyThreadYield();
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("test main thread");
		}
	}

	// @Test
	public void threadByThreadJoin() throws InterruptedException {

		MyThread t = new MyThread();
		t.start();
		t.join();
		for (int i = 0; i < 10; i++) {
			System.out.println("test main thread");
		}
	}

	/*
	 * If a Thread wants to wait until completing some other Thread then we should
	 * go for join() method. Example: If a Thread t1 executes t2.join() then t1
	 * should go for waiting state until completing t2.
	 */
	// @Test
	public void threadByThreadJoinTime() throws InterruptedException {

		MyThread t = new MyThread();
		t.start();
		t.join(1);
		for (int i = 0; i < 10; i++) {
			System.out.println("test main thread");
		}
	}

	/*
	 * If a Thread don't want to perform any operation for a particular amount of
	 * time then we should go for sleep() method.
	 */
//	@Test
	public void threadByThreadSleep() {

		MyThreadSleep t = new MyThreadSleep();
		t.start();

		System.out.println("test main thread");

	}

	/*
	 * If a Thread can interrupt a sleeping or waiting Thread by using
	 * interrupt()(break off) method of Thread class.
	 */
//	@Test
	public void threadByThreadInterrupt() {

		MyThreadSleep t = new MyThreadSleep();
		t.start();
		t.interrupt();

		System.out.println("test main thread");
	}
	/*
	 * @Test public void threadSynchronized() {
	 * 
	 * Display d = new Display(); ThreadSync t1 = new ThreadSync(d, "evyaan");
	 * ThreadSync t2 = new ThreadSync(d, "varun"); t1.start(); t2.start();
	 * 
	 * System.out.println("test main thread"); }
	 * 
	 */}
