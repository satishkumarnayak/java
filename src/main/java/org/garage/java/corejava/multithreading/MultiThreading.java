package org.garage.java.corejava.multithreading;

public class MultiThreading {
	
	public static void main(String[] args) {
		Display d = new Display();
	//	Display d1 = new Display();
		ThreadSync t1 = new ThreadSync(d, "evyaan");
		ThreadSync t2 = new ThreadSync(d, "varun");
		t1.start();
		t2.start();

		System.out.println("test main thread");
	}

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

class Display {
	
	public  synchronized void wish(String name) {
		for(int i=0; i<5; i++) {
			System.out.print("Good morning");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
}

class ThreadSync extends Thread {
	Display display;
	String name;
	public ThreadSync(Display d, String name) {
		this.display = d;
		this.name = name;
	}
	 public  void  run() {
		 display.wish(name);
	 }
}