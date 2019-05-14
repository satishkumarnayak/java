package org.garage.java.corejava.collection.concurrent;

import static org.junit.Assert.*;

import java.util.concurrent.ConcurrentHashMap;

import org.junit.Before;
import org.junit.Test;

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

public class ConcurrentHashMapGarageTest {

	/*
	 * put() If the Key is Already Available, Old Value will be replaced with New
	 * Value and Returns Old Value. putIfAbsent() If the Key is Already Present then
	 * Entry won’t be added and Returns Old associated Value. If the Key is Not
	 * Available then Only Entry will be added.
	 */

	@Test
	public void testPutIfAbsent() {
		ConcurrentHashMap map = new ConcurrentHashMap();
		map.put("evyaan", 200);
		map.put("varun", 300);
		map.put("dolly", 400);
		map.putIfAbsent("dolly", 500);
		map.putIfAbsent("kruthi", 600);

		assertEquals("{kruthi=600, evyaan=200, dolly=400, varun=300}", map.toString());

	}

	/*
	 * Removes the Entry if the Key associated with specified Value Only.
	 */
	@Test
	public void testRemove() {
		ConcurrentHashMap map = new ConcurrentHashMap();
		map.put("evyaan", 200);
		map.put("varun", 300);
		map.put("dolly", 400);

		map.remove("evyaan", 300);
		map.remove("dolly", 400);

		assertEquals("{evyaan=200, varun=300}", map.toString());

	}

	/*
	 * boolean replace(Object key, Object oldValue, Object newValue) If the Key
	 * Value Matched with oldValue then Replace with newValue
	 */
	@Test
	public void testReplace() {
		ConcurrentHashMap map = new ConcurrentHashMap();
		map.put("evyaan", 200);
		map.put("varun", 300);
		map.put("dolly", 400);

		map.replace("evyaan", 200, 800);
		map.replace("dolly", 300, 500);
		assertEquals("{evyaan=800, dolly=400, varun=300}", map.toString());

	}

}
