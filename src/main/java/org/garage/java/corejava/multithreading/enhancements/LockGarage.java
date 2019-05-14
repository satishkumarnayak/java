package org.garage.java.corejava.multithreading.enhancements;

import java.util.concurrent.locks.ReentrantLock;




/*Problems with Traditional synchronized Key Word
 If a Thread Releases the Lock then which waiting Thread will get that Lock we are
Not having any Control on this.
 We can’t Specify Maximum waiting Time for a Thread to get Lock so that it will
Wait until getting Lock, which May Effect Performance of the System and Causes
Dead Lock.
 We are Not having any Flexibility to Try for Lock without waiting.
 There is No API to List All Waiting Threads for a Lock.
 The synchronized Key Word Compulsory we have to Define within a Method and it
is Not Possible to Declare Over Multiple Methods.
 To Overcome Above Problems SUN People introduced java.util.concurrent.locks
Package in 1.5 Version.
 It Also Provides Several Enhancements to the Programmer to Provide More Control
on Concurrency.*/


/*Lock(I):
 A Lock Object is Similar to Implicit Lock acquired by a Thread to Execute
synchronized Method OR synchronized Block
 Lock Implementations Provide More Extensive Operations than Traditional
Implicit Locks.
Important*/
public class LockGarage {

	public static void main(String[] args) {
		
		
		/*
		 *  ReentrantLock implements Lock Interface and it is the Direct Child Class of an Object.
		 *  Reentrant Means a Thread can acquires Same Lock Multiple Times without any
		 * Issue.  Internally ReentrantLock Increments Threads Personal Count whenever
		 * we Call lock() and Decrements Counter whenever we Call unlock() and Lock will
		 * be Released whenever Count Reaches ‘0’.
		 */
		ReentrantLock lock = new ReentrantLock();
		
		System.out.println(lock.isLocked());
		
//		 It Locks the Lock Object.
//		 If Lock Object is Already Locked by Other Thread then it will wait until it is
//		Unlocked.
		lock.lock();
		
		//Returns true if the Lock acquired by any Thread.
		System.out.println(lock.isLocked());
		lock.lock();
		System.out.println(lock.isLocked());
		System.out.println(lock.isHeldByCurrentThread());
		System.out.println(lock.getQueueLength());
		
		System.out.println(lock.getHoldCount());
		
	//	To Release the Lock.
		lock.unlock();
		System.out.println(lock.getHoldCount());
		System.out.println(lock.isLocked());
		
		//Returns true if the Lock’s Fairness Set to true.
		System.out.println(lock.isFair());
		

	}

}
