package org.garage.java.corejava.multithreading;

import java.util.LinkedList;
import java.util.Queue;

import javax.sql.rowset.spi.SyncResolver;

public class ProducerConsumerProblem {

	public static void main(String[] args) {
		Producer producer = new Producer();
		Consumer consumer1 = new Consumer(producer);
		Consumer consumer2 = new Consumer(producer);
		Consumer consumer3 = new Consumer(producer);
		Consumer consumer4 = new Consumer(producer);
		consumer1.start();
		consumer2.start();
		consumer3.start();
		consumer4.start();
		producer.start();

	}

}

class Producer extends Thread {
	
	LinkedList<String> ll = new LinkedList<String>();
	public void run() {
		
		synchronized (this) {
			System.out.println("Producing...");
			
			for(int i=0; i<10; i++) {
				ll.add("Value-"+i);
			}
			System.out.println("Calling notifictaion");
			this.notify();
		//	this.notifyAll();
		}
		
	}
	
}

class Consumer extends Thread {
	
	Producer producer;
	
	public Consumer(Producer producer) {
		this.producer=producer;
	}
	public void run() {
		
		synchronized (producer) {
			System.out.println("Consumer waiting...");
			try {
				producer.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Consumer notified"+Thread.currentThread().getName());
			for(String s : producer.ll) {
				System.out.println(s);
			}
		}
	}
	
}
