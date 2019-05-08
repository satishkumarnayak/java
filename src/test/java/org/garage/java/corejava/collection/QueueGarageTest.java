package org.garage.java.corejava.collection;

import static org.junit.Assert.*;

import java.util.PriorityQueue;

import org.junit.Before;
import org.junit.Test;

public class QueueGarageTest {

	@Before
	public void setUp() throws Exception {
	}

	/*
	 * Queue is child interface of Collections. 2. If we want to represent a group
	 * of individual objects prior (happening before something else) to processing
	 * then we should go for Queue interface. 3. Usually Queue follows first in
	 * first out(FIFO) order but based on our requirement we can implement our own
	 * order also. 4. From 1.5v onwards LinkedList also implements Queue interface.
	 * 5. LinkedList based implementation of Queue always follows first in first out
	 * order.
	 */

	/*
	 * 1. PriorityQueue is a data structure to represent a group of individual
	 * objects prior to processing according to some priority. 2. The priority order
	 * can be either default natural sorting order (or) customized sorting order
	 * specified by Comparator object. 3. If we are depending on default natural
	 * sorting order then the objects must be homogeneous and Comparable otherwise
	 * we will get ClassCastException. 4. If we are defining our own customized
	 * sorting order by Comparator then the objects need not be homogeneous and
	 * Comparable. 5. Duplicate objects are not allowed. 6. Insertion order is not
	 * preserved but all objects will be inserted according to some priority. 7.
	 * Null is not allowed even as the 1st element for empty PriorityQueue.Otherwise
	 * we will get the "NullPointerException".
	 */
	@Test
	public void testPriorityQueue() {

		/*
		 * Creates an empty PriorityQueue with default initial capacity 11 and default
		 * natural sorting order.
		 */
		PriorityQueue pq = new PriorityQueue();
		assertNull(pq.peek());
		for (int i = 0; i < 10; i++) {
			pq.offer(i);
		}
		assertEquals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]", pq.toString());
		assertEquals(0,pq.peek());
		assertEquals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]", pq.toString());
		pq.poll();
		System.out.println(pq);
	//	assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9]", pq.toString());
		
	}

}
