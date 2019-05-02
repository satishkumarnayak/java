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