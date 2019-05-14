package org.garage.java.corejava.collection.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 
 *  It is a Thread Safe Version of ArrayList as the Name indicates CopyOnWriteArrayList
Creates a Cloned Copy of Underlying ArrayList for Every Update Operation at Certain
Point Both will Synchronized Automatically Which is taken Care by JVM Internally.
 As Update Operation will be performed on cloned Copy there is No Effect for the Threads
which performs Read Operation.
 It is Costly to Use because for every Update Operation a cloned Copy will be Created.
Hence CopyOnWriteArrayList is the Best Choice if Several Read Operations and Less
Number of Write Operations are required to Perform.
 Insertion Order is Preserved.
 Duplicate Objects are allowed.
 Heterogeneous Objects are allowed.
 null Insertion is Possible.
 It implements Serializable, Clonable and RandomAccess Interfaces.
 While One Thread iterating CopyOnWriteArrayList, the Other Threads are allowed to
Modify and we won’t get ConcurrentModificationException. That is iterator is Fail Safe.
 Iterator of ArrayList can Perform Remove Operation but Iterator of
CopyOnWriteArrayList can’t Perform Remove Operation. Otherwise we will get
RuntimeException Saying UnsupportedOperationException.
 *
 */
public class CopyOnWriteArrayListGarage extends Thread {

//	static ArrayList list = new ArrayList();
	 static CopyOnWriteArrayList list = new CopyOnWriteArrayList();

	public void run() {

		System.out.println("Updating");
		/*
		 * try { Thread.sleep(000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		list.add("D");

	}

	public static void main(String[] args) throws InterruptedException {

		list.add("A");
		list.add("B");
		list.add("C");

		CopyOnWriteArrayListGarage t = new CopyOnWriteArrayListGarage();
		t.start();

		Iterator iterator = list.iterator();
		list.add("F");
		while (iterator.hasNext()) {
			System.out.println("Iterating.." + Thread.currentThread().getName() + iterator.next());
			Thread.sleep(1000);
		}

		System.out.println("Final.." + list.toString());

	}

}

