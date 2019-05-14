package org.garage.java.corejava.multithreading.enhancements;

import java.util.concurrent.locks.ReentrantLock;

/*
ReentrantLock
 It implements Lock Interface and it is the Direct Child Class of an Object.
 Reentrant Means a Thread can acquires Same Lock Multiple Times without any
Issue.
 Internally ReentrantLock Increments Threads Personal Count whenever we Call
lock() and Decrements Counter whenever we Call unlock() and Lock will be
Released whenever Count Reaches ‘0’.*/
public class ReEntrantLockGarage {

	public static void main(String[] args) {
		Display d = new Display();
		
		ThreadSync t1 = new ThreadSync(d, "evyaan");
		ThreadSync t2 = new ThreadSync(d, "varun");
		ThreadSync t3 = new ThreadSync(d, "dolly");
		
		t1.start();
		t2.start();
		t3.start();

	}

}

class Display {
	ReentrantLock lock = new ReentrantLock(false);

	public void wish(String name) {
		lock.lock();
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Good morning");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}
		lock.unlock();
	}
}

class ThreadSync extends Thread {
	Display display;
	String name;

	public ThreadSync(Display d, String name) {
		this.display = d;
		this.name = name;
	}

	public void run() {
		display.wish(name);
	}
}
