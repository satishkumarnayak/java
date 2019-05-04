package org.garage.java.corejava.multithreading;

public class DeadLock {

	Object obj1 = new Object();
	Object obj2 = new Object();

	public static void main(String[] args) {
		DeadLock deadlock = new DeadLock();
		deadlock.deadLock();
	}

	public void deadLock() {
		A a = new A(obj1, obj2);
		B b = new B(obj1, obj2);
		a.start();
		b.start();
	}
}

class A extends Thread {

	Object obj1, obj2;

	public A(Object obj1, Object obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public void run() {

		synchronized (obj1) {
			System.out.println(Thread.currentThread().getName() + "acquired lock for+" + obj1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "waiting for acquiring lock for+" + obj2);
			synchronized (obj2) {
				System.out.println(Thread.currentThread().getName() + "acquired lock for+" + obj2);
			}

		}

	}

}

class B extends Thread {

	Object obj1, obj2;

	public B(Object obj1, Object obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public void run() {

		synchronized (obj2) {
			System.out.println(Thread.currentThread().getName() + "acquired lock for+" + obj2);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "waiting for acquiring lock for+" + obj1);
			synchronized (obj1) {
				System.out.println(Thread.currentThread().getName() + "acquired lock for+" + obj1);
			}

		}

	}

}