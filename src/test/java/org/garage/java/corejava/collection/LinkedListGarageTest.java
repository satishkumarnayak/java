package org.garage.java.corejava.collection;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class LinkedListGarageTest {

	LinkedListGarage ll;

	@Before
	public void setUp() throws Exception {
		ll = new LinkedListGarage();
	}

	
	/*
	 * 1. The underlying data structure is double LinkedList 2. If our frequent
	 * operation is insertion (or) deletion in the middle then LinkedList is the
	 * best choice. 3. If our frequent operation is retrieval operation the
	 * LinkedList is worst choice. 4. Duplicate objects are allowed. 5. Insertion
	 * order is preserved. 6. Heterogeneous objects are allowed. 7. Null insertion
	 * is possible. 8. Implements Serializable and Cloneable interfaces but not
	 * RandomAccess. Usually we can use LinkedList to implement Stacks and Queues.
	 */
	 
	@Test
	public void testLinkedList() {

		LinkedList ll = new LinkedList();
		ll.add("evyaan");
		ll.add(null);
		ll.add("evyaan");
		ll.add(null);
		assertEquals("[evyaan, null, evyaan, null]", ll.toString());
		
		ll.set(2, "varun");
		assertEquals("[evyaan, null, varun, null]", ll.toString());
		
		ll.addFirst("nayak");
		ll.addLast("satish");
		assertEquals("[nayak, evyaan, null, varun, null, satish]", ll.toString());

		ll.remove(2);
		assertEquals("[nayak, evyaan, varun, null, satish]", ll.toString());
	}

}
