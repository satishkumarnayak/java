package org.garage.java.corejava.collection;

import static org.junit.Assert.*;

import java.util.Stack;
import java.util.Vector;

import org.junit.Before;
import org.junit.Test;

public class VectorGarageTest {

	VectorGarage v;

	@Before
	public void setUp() throws Exception {
		v = new VectorGarage();
	}

	/*
	 * 1. The underlying data structure is resizable array (or) growable array. 2.
	 * Duplicate objects are allowed. 3. Insertion order is preserved. 4.
	 * Heterogeneous objects are allowed. 5. Null insertion is possible. 6.
	 * Implements Serializable, Cloneable and RandomAccess interfaces. Every method
	 * present in Vector is synchronized and hence Vector is Thread safe.
	 */
	@Test
	public void testVector() {

		/*
		 * Creates an empty Vector object with default initial capacity 10. o Once
		 * Vector reaches its maximum capacity then a new Vector object will be created
		 * with double capacity. That is "newcapacity=currentcapacity*2".
		 */
		Vector v = new Vector();
		v.add("evyaan");
		v.add(null);
		v.addElement("evyaan");
		v.addElement(null);

		assertEquals("evyaan", v.get(0));
		assertEquals(null, v.get(1));
		assertEquals("evyaan", v.get(2));
		assertEquals(null, v.get(3));

	}

	/*
	 * 1. It is the child class of Vector. 2. Whenever last in first out(LIFO) order
	 * required then we should go for Stack.
	 */
	
	
	/*
	 * 1. Object push(Object o); To insert an object into the stack. 2. Object
	 * pop(); To remove and return top of the stack. 3. Object peek(); To return top
	 * of the stack without removal. 4. boolean empty(); Returns true if Stack is
	 * empty. 5. Int search(Object o); Returns offset if the element is available
	 * otherwise returns "-1"
	 */

	@Test
	public void testStack() {
		Stack stack = new Stack();

		stack.add("evyaan");
		stack.add("evyaan");
		stack.add(null);
		stack.add(null);
		stack.add("varun");

		assertEquals("evyaan", stack.get(0));
		assertEquals("evyaan", stack.get(1));
		assertEquals(null, stack.get(2));
		assertEquals(null, stack.get(3));
		assertEquals("varun", stack.get(4));

		stack.clear();

		stack.push("evyaan");
		stack.push("evyaan");
		stack.push(null);
		stack.push(null);
		stack.push("varun");

		assertEquals("evyaan", stack.get(0));
		assertEquals("evyaan", stack.get(1));
		assertEquals(null, stack.get(2));
		assertEquals(null, stack.get(3));
		assertEquals("varun", stack.get(4));

		stack.push("evyaan");
		stack.push("evyaan");
		stack.pop();
		stack.pop();
		stack.push("varun");

		assertEquals("varun", stack.peek());
		assertEquals(-1, stack.search("dolly"));
		assertEquals(5, stack.search("evyaan"));
		assertEquals(1, stack.search("varun"));

	}

}
