package org.garage.java.corejava.multithreading.enhancements;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* trylock()
To Acquire the Lock if it is Available.
 If the Lock is Unavailable then Thread can Wait until specified Amount of Time.
 Still if the Lock is Unavailable then Thread can Continue its Execution.*/
public class ReEntrantTryLockGarage {

	public static void main(String[] args) {
		Display2 d = new Display2();
		
		ThreadSync2 t1 = new ThreadSync2(d, "evyaan");
		ThreadSync2 t2 = new ThreadSync2(d, "varun");
		ThreadSync2 t3 = new ThreadSync2(d, "dolly");
		
		t1.start();
		t2.start();
		t3.start();

	}

}

class Display2 {
	ReentrantLock lock = new ReentrantLock(false);

	public void wish(String name) throws InterruptedException {
	//	lock.lock();
	//	if(lock.tryLock()) { //  To Acquire the Lock if it is Available.
		if(lock.tryLock(5000, TimeUnit.MILLISECONDS)) { // To Acquire the Lock if it is Available or wait till the waiting time specified
			System.out.println("Got lock"+name);
		for (int i = 0; i < 5; i++) {
			System.out.print("Good morning");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(name);
		}
		lock.unlock();
	}
		System.out.println("Did not got the lock"+name);
	}
}

class ThreadSync2 extends Thread {
	Display2 display;
	String name;

	public ThreadSync2(Display2 d, String name) {
		this.display = d;
		this.name = name;
	}

	public void run() {
		try {
			display.wish(name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
