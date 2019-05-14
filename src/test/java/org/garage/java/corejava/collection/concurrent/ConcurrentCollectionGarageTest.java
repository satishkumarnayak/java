package org.garage.java.corejava.collection.concurrent;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

/*Need fo Concurrent Collections
 Tradition Collection Object (Like ArrayList, HashMapEtc) can be accessed by Multiple
Threads simultaneously and there May be a Chance of Data Inconsistency Problems and
Hence these are Not Thread Safe.
 Already existing Thread Safe Collections (Vector, Hashtable, synchronizedList(),
synchronizedSet(), synchronizedMap() ) Performance wise Not Upto the Mark.
 Because for Every Operation Even for Read Operation Also Total Collection will be loaded
by Only One Thread at a Time and it Increases waiting Time of Threads.
 Another Big Problem with Traditional Collections is while One Thread iterating Collection,
the Other Threads are Not allowed to Modify Collection Object simultaneously if we are
trying to Modify then we will get ConcurrentModificationException.
 Hence these Traditional Collection Objects are Not Suitable for Scalable Multi Threaded
Applications.
*/

/*
 To Overcome these Problems SUN People introduced Concurrent Collections in 1.5 Version.
1) Concurrent Collections are Always Thread Safe.
2) When compared with Traditional Thread Safe Collections Performance is More because of
different Locking Mechanism.
3) While One Thread interacting Collection the Other Threads are allowed to Modify
Collection in Safe Manner.
Hence Concurrent Collections Never threw ConcurrentModificationException.*/

public class ConcurrentCollectionGarageTest {

	ConcurrentCollectionGarage garage;

	@Before
	public void setUp() throws Exception {
		garage = new ConcurrentCollectionGarage();
	}

	@Test(expected=ConcurrentModificationException.class)
	public void testConcurrentModificationException() {
		ArrayList al = new ArrayList();
		al.add("A");
		al.add("B");
		al.add("C");
		Iterator iterator = al.iterator();

		while (iterator.hasNext()) {
			String next = (String) iterator.next();
			al.add("D"); // ConcurrentModificationException
		}

	}

}
