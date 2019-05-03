package org.garage.java.corejava.multithreading;

public class InterProcessCommunication extends Thread {

	public static void main(String[] args) {
           ThreadB b = new ThreadB();
           b.start();
           synchronized (b) {
        	   System.out.println("calling wait ");
        	   try {
				b.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("calculated value"+b.total);
		}
	}

}

class ThreadB extends Thread {

	int total = 0;

	public void run() {
		synchronized (this) {

			System.out.println("calculating");
			for (int i = 0; i < 5; i++) {
				total += i;
			}
			System.out.println("Calling notify");
			this.notify();
		}
	}
}
