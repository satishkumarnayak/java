package org.garage.java.corejava.multithreading.enhancements;

/* ThreadLocalProvides ThreadLocal Variables.
 ThreadLocal Class Maintains Values for Thread Basis.
 Each ThreadLocal Object Maintains a Separate Value Like userID,
transactionIDEtc for Each Thread that Accesses that Object.
 Thread can Access its Local Value, can Manipulates its Value and Even can Remove
its Value.
 In Every Part of the Code which is executed by the Thread we can Access its Local
Variables.
ThreadLocal can be associated with Thread Scope.
☀ All the Code which is executed by the Thread has Access to Corresponding
ThreadLocal Variables.
A Thread can Access its Own Local Variables and can’t Access Other Threads
Local Variables.
☀ Once Thread Entered into Dead State All Local Variables are by Default Eligible for
Garbage Collection.*/

public class ThreadLocalGarage {

	public static void main(String args[]) {
		// ThreadLocalDemo demo = new ThreadLocalDemo();
		// demo.threadLocal();
		CustomerThread c1 = new CustomerThread("CustomerThread 1-");
		CustomerThread c2 = new CustomerThread("CustomerThread 2-");
		CustomerThread c3 = new CustomerThread("CustomerThread 3-");
		CustomerThread c4 = new CustomerThread("CustomerThread 4-");
		CustomerThread c5 = new CustomerThread("CustomerThread 5-");
		CustomerThread c6 = new CustomerThread("CustomerThread 6-");
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();
		c6.start();
	}

}

class ThreadLocalDemo {

	public void threadLocal() {
		ThreadLocal tl = new ThreadLocal();
		System.out.println(tl.get()); // returns default null value

		ThreadLocal t2 = new ThreadLocal() {
			protected Object initialValue() {
				return "abc";
			}
		};

		System.out.println(t2.get()); // returns abc value

	}
}

class CustomerThread extends Thread {

	static Integer custId = 0;

	static InheritableThreadLocal tl = new InheritableThreadLocal() {
		@Override
		protected Object initialValue() {
			// TODO Auto-generated method stub
			return custId++;
		}
	};

	public CustomerThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		try {

			Thread.sleep(1000);
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + tl.get());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}