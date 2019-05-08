package org.garage.java.corejava.collection;

import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

public class TreeSetGarageTest {

	@Before
	public void setUp() throws Exception {
	}

	/*
	 * 1. The underlying data structure is balanced tree. 2. Duplicate objects are
	 * not allowed. 3. Insertion order is not preserved and it is based on some
	 * sorting order of objects. 4. Heterogeneous objects are not allowed if we are
	 * trying to insert heterogeneous objects then we will get ClassCastException.
	 * 5. Null insertion is possible(only once).
	 */

	@Test
	public void testTreeSet() {

		/*
		 * Creates an empty TreeSet object where all elements will be inserted according
		 * to default natural sorting order.
		 */
		TreeSet ts = new TreeSet();
		ts.add("B");
		// ts.add(null); NullPointerExeception
		ts.add("A");
		ts.add("a");
		ts.add("Z");

		// ts.add(10); // ClassCastExeption
		assertEquals("[A, B, Z, a]", ts.toString());

	}

	/*
	 * String class and all wrapper classes implements Comparable interface but
	 * StringBuffer class doesn't implement Comparable interface hence in the above
	 * program we are getting ClassCastException.
	 */

	@Test
	public void testTreeSetStringBuffer() {

		TreeSet ts = new TreeSet();
		try {
			ts.add(new StringBuffer("B"));
			ts.add(new StringBuffer("A"));
			ts.add(new StringBuffer("a"));
			ts.add(new StringBuffer("Z"));
		} catch (ClassCastException e) {
			assertEquals("java.lang.StringBuffer cannot be cast to java.lang.Comparable", e.getMessage());
		}

	}

	/*
	 * Comparable interface present in java.lang package and contains only one
	 * method compareTo() method.
	 */
	/*
	 * obj1.compareTo(obj2); -ve if obj1 has to come before obj2. +ve if obj1 has to
	 * come after obj2, 0 if obj1 is equal to obj2
	 */
	@Test
	public void testComparable() {
		assertTrue("Z".compareTo("A") > 0);
		assertTrue("C".compareTo("P") < 0);
		assertTrue("A".compareTo("A") == 0);

		TreeSet ts = new TreeSet();
		MyComparableObj o1 = new MyComparableObj("evyaan", 20);
		MyComparableObj o2 = new MyComparableObj("varun", 10);
		MyComparableObj o3 = new MyComparableObj("dolly", 25);
		MyComparableObj o4 = new MyComparableObj("vaishu", 15);

		ts.add(o1);
		ts.add(o2);
		ts.add(o3);
		ts.add(o4);
	//	System.out.println(ts.toString());
		TreeSet ts2 = new TreeSet(new MyComparator2());
		ts2.add(o1);
		ts2.add(o2);
		ts2.add(o3);
		ts2.add(o4);
	//	System.out.println(ts2.toString());
	}

	/*
	 * Comparator interface present in java.util package this interface defines the
	 * following 2 methods. public int compare(Object obj1,Object Obj2);; -ve if
	 * obj1 has to come before obj2. +ve if obj1 has to come after obj2, 0 if obj1
	 * is equal to obj2 Comparator meant for customized sorting order
	 */
	@Test
	public void testCompartor() {

		TreeSet ts = new TreeSet(new MyComparator());

		ts.add(10);
		ts.add(0);
		ts.add(50);
		ts.add(20);

		assertEquals("[50, 20, 10, 0]", ts.toString());
	}

}
