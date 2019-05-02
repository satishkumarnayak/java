package org.garage.java.corejava.multithreading;

public class MultiThreading {

}

class MyThread extends Thread {

	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}

}

class MyRunnable implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}

}

class MyThreadYield extends Thread {

	public void run() {

		for (int i = 0; i < 10; i++) {
			Thread.yield(); 
			System.out.println("Child Thread");
		}
	}

}

class MyThreadSleep extends Thread {

	public void run() {
		System.out.println("Child Thread");
	//	for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);
				System.out.println("Child Thread");
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Child Thread");
	//	}
	}

}