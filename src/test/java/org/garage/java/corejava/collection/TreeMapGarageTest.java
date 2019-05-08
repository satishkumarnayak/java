package org.garage.java.corejava.collection;

import static org.junit.Assert.*;

import java.util.TreeMap;

import org.junit.Before;
import org.junit.Test;

public class TreeMapGarageTest {

	@Before
	public void setUp() throws Exception {
	}

	/*
	 *  SortedMap is the child interface of Map.  If we want to represent a group
	 * of key-value pairs according to some sorting order of keys then we should go
	 * for SortedMap.  Sorting is possible only based on the keys but not based on
	 * values.
	 */

	/*
	 * TreeMap: 1. The underlying data structure is RED-BLACK Tree. 2. Duplicate
	 * keys are not allowed but values can be duplicated. 3. Insertion order is not
	 * preserved and all entries will be inserted according to some sorting order of
	 * keys. 4. If we are depending on default natural sorting order keys should be
	 * homogeneous and Comparable otherwise we will get ClassCastException. 5. If we
	 * are defining our own sorting order by Comparator then keys can be
	 * heterogeneous and non Comparable. 6. There are no restrictions on values they
	 * can be heterogeneous and non Comparable. 7. For the empty TreeMap as first
	 * entry null key is allowed but after inserting that entry if we are trying to
	 * insert any other entry we will get NullPointerException. 8. For the non empty
	 * TreeMap if we are trying to insert an entry with null key we will get
	 * NullPointerException. 9. There are no restrictions for null values.
	 */

	@Test
	public void testTreeMap() {
		TreeMap t = new TreeMap();

		t.put(200, "evyaan");
		t.put(100, "varun");
		t.put(600, "dolly");
		t.put(600, "varun");
		assertEquals("{100=varun, 200=evyaan, 600=varun}", t.toString());
		
		TreeMap t1 = new TreeMap(new MyComparator());
		t1.put(200, "evyaan");
		t1.put(100, "varun");
		t1.put(600, "dolly");
		t1.put(600, "varun");
		System.out.println(t1);
		assertEquals("{600=varun, 600=dolly, 200=evyaan, 100=varun}", t.toString());
		

	}

}
