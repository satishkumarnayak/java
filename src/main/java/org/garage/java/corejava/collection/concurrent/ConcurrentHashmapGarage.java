package org.garage.java.corejava.collection.concurrent;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/*ConcurrentHashMap
 Underlying Data Structure is Hashtable.
 ConcurrentHashMap allows Concurrent Read and Thread Safe Update Operations.
 To Perform Read Operation Thread won’t require any Lock. But to Perform Update
Operation Thread requires Lock but it is the Lock of Only a Particular Part of Map (Bucket
Level Lock).
 Instead of Whole Map Concurrent Update achieved by Internally dividing Map into
Smaller Portion which is defined by Concurrency Level.
 The Default Concurrency Level is 16.
 That is ConcurrentHashMap Allows simultaneous Read Operation and simultaneously 16
Write (Update) Operations.
 null is Not Allowed for Both Keys and Values.
 While One Thread iterating the Other Thread can Perform Update Operation and
ConcurrentHashMap Never throw ConcurrentModificationException.

*/
public class ConcurrentHashmapGarage extends Thread {

	// static HashMap map = new HashMap(); // ConcurrentModificationException
	static ConcurrentHashMap map = new ConcurrentHashMap();

	public void run() {

		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		map.put("three", 30);

	}

	public static void main(String[] args) throws InterruptedException {

		// map.put("dsd",null); //NullPointerException
		// map.put(null,"wwd"); //NullPointerException
		map.put("one", 10);
		map.put("two", 20);
		ConcurrentHashmapGarage t = new ConcurrentHashmapGarage();
		t.start();
		Iterator iterator = map.keySet().iterator();
		map.put("four", 400);
		/*
		 * In the Case of ConcurrentHashMap iterator creates a Read Only Copy of Map
		 * Object and iterates over that Copy if any Changes to the Map after getting
		 * iterator it won’t be affected/reflected.
		 */
		while (iterator.hasNext()) {
			System.out.println("Iterating" + Thread.currentThread().getName() + ((String) iterator.next()));
			Thread.sleep(3000);
		}

		System.out.println("Final Map:" + map.toString());
	}

}
