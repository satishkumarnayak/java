package org.garage.java.corejava.collection.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/*
 * CopyOnWriteArraySet is a Thread Safe Version of Set.
 Internally Implement by CopyOnWriteArrayList.
 Insertion Order is Preserved.
 Duplicate Objects are Notallowed.
 Multiple Threads can Able to Perform Read Operation simultaneously but for Every
Update Operation a Separate cloned Copy will be Created.
 As for Every Update Operation a Separate cloned Copy will be Created which is Costly
Hence if Multiple Update Operation are required then it is Not recommended to Use
CopyOnWriteArraySet.
 While One Thread iterating Set the Other Threads are allowed to Modify Set and we won’t
get ConcurrentModificationException.
 Iterator of CopyOnWriteArraySet can PerformOnly Read Operation and won’t Perform
Remove Operation. Otherwise we will get RuntimeException:
UnsupportedOperatonException.
*/
public class CopyOnWriteArraySetGarage  extends Thread  {
	
	/* Fail Fast Iterator:
	 * Fail Fast Iterator:While One Thread iterating Collection if Other Thread
	 * trying to Perform any Structural Modification to the underlying Collection
	 * then immediately Iterator Fails by raising ConcurrentModificationExcepion.
	 * Such Type of Iterators are Called Fail Fast Iterators.
	 */
	
	/* Fail Safe Iterator:
	 *  While One Thread iterating if the Other Threads are allowed to Perform any
	 * Structural Changes to the underlying Collection, Such Type of Iterators are
	 * Called Fail Safe Iterators.  Fail Safe Iterators won’t raise
	 * ConcurrentModificationException because Every Update Operation will be
	 * performed on Separate cloned Copy.
	 */
	
//	static ArrayList list = new ArrayList();
	static CopyOnWriteArraySet list = new CopyOnWriteArraySet();
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
	//	list.set(2, "G"); Not Defined on copyonarraylist
		
		while (iterator.hasNext()) {
			System.out.println("Iterating.." + Thread.currentThread().getName() + iterator.next());
			Thread.sleep(1000);
		}

		System.out.println("Final.." + list.toString());

	}

}
