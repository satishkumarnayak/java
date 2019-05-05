package org.garage.java.corejava.collection;

import static org.junit.Assert.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;
import java.util.Vector;

import org.junit.Before;
import org.junit.Test;

public class ArrayListGarageTest {

	ArrayListGarage alist;

	@Before
	public void setUp() throws Exception {
		alist = new ArrayListGarage();
	}

	/*
	 * 1. The underlying data structure is resizable array (or) growable array. 
	 * 2.Duplicate objects are allowed. 
	 * 3. Insertion order preserved.
	 * 4. Heterogeneous objects are allowed.(except TreeSet , TreeMap every where heterogenious
	 * objects are allowed)
	 *  5. Null insertion is possible.
	 */
	
	/*
	 * Collections class defines the following method to return synchronized version
	 * of List. Public static List synchronizedList(list l);
	 */
	/*
	 *  ArrayList is the best choice if our frequent operation is retrieval. 
	 * ArrayList is the worst choice if our frequent operation is insertion (or)
	 * deletion in the middle because it requires several internal shift operations.
	 */

	@Test
	public void arrayListTest() {

		/*
		 * Creates an empty ArrayList object with default initial capacity "10" if
		 * ArrayList reaches its max capacity then a new ArrayList object will be
		 * created with New capacity=(current capacity*3/2)+1
		 */
		ArrayList list = new ArrayList();
	//	ArrayList list = new ArrayList(initialCapacity);
		list.add("A");
		list.add(10);
		list.add("A");
		list.add(null);
		list.add(false);
		list.add(null);

		assertEquals("[A, 10, A, null, false, null]", list.toString());
		
		/*
		 * Usually we can use collection to hold and transfer objects from one tier to
		 * another tier. To provide support for this requirement every Collection class
		 * already implements Serializable and Cloneable interfaces.
		 */
		assertTrue(list instanceof Serializable);
		assertTrue(list instanceof Cloneable);
		
		
		/*
		 * ArrayList and Vector classes implements RandomAccess interface so that any
		 * random element we can access with the same speed. Hence ArrayList is the best
		 * choice of "retrival operation".
		 */
		LinkedList llist = new LinkedList();
		Vector v = new Vector();
		assertTrue(list instanceof RandomAccess);
		assertFalse(llist instanceof RandomAccess);
		assertTrue(v instanceof RandomAccess);
	}

}
