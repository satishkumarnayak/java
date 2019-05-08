package org.garage.java.corejava.collection;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.LinkedHashSet;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HashSetGarageTest {

	/*
	 * 1. Set is the child interface of Collection. 2. If we want to represent a
	 * group of individual objects as a single entity where duplicates are not allow
	 * and insertion order is not preserved then we should go for Set interface.
	 */

	/*
	 * 1. HashSet's underlying data structure is Hashtable. 2. Insertion order is
	 * not preserved and it is based on hash code of the objects. 3. Duplicate
	 * objects are not allowed. 4. If we are trying to insert duplicate objects we
	 * won't get compile time error and runtime error add() method simply returns
	 * false. 5. Heterogeneous objects are allowed. 6. Null insertion is
	 * possible.(only once) 7. Implements Serializable and Cloneable interfaces but
	 * not RandomAccess. 8.HashSet is best suitable, if our frequent operation is
	 * "Search".
	 */
	@Test
	public void testHashSet() {

		/*
		 * Creates an empty HashSet object with default initial capacity 16 and default
		 * fill ratio 0.75(fill ratio is also known as load factor).
		 */
		HashSet hset = new HashSet();

		hset.add("A");
		assertTrue(hset.add("B"));
		assertFalse(hset.add("B"));
		assertTrue(hset.add(null));
		assertFalse(hset.add(null));
		hset.add("C");
		hset.add("D");
		hset.add(10);

	}
	
	
	/*
	 * The LinkedHashSet ,child class of HashSet, underlying data structure is a combination of LinkedList and Hashtable.
	 * Insertion order is preserved.
	 */
	@Test
	public void testLinkedHashSet() {

		
		LinkedHashSet lhset = new LinkedHashSet();

		lhset.add("A");
		assertTrue(lhset.add("B"));
		assertFalse(lhset.add("B"));
		assertTrue(lhset.add(null));
		assertFalse(lhset.add(null));
		lhset.add("C");
		lhset.add("D");
		lhset.add(10);
		assertEquals("[A, B, null, C, D, 10]", lhset.toString());
		
		System.out.println(lhset.toString());

	}

}
