package org.garage.java.corejava.collection;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

import org.junit.Before;
import org.junit.Test;

public class HashMapGarageTest {

	@Before
	public void setUp() throws Exception {
	}

	/*
	 * 1. If we want to represent a group of objects as "key-value" pair then we
	 * should go for Map interface. 2. Both key and value are objects only. 3.
	 * Duplicate keys are not allowed but values can be duplicated 4. Each key-value
	 * pair is called "one entry".
	 */

	/*
	 * Entry Interface Each key-value pair is called one entry. Hence Map is
	 * considered as a group of entry Objects, without existing Map object there is
	 * no chance of existing entry object hence interface entry is define inside Map
	 * interface(inner interface).
	 */

	/*
	 * 1. The underlying data structure is Hashtable. 2. Duplicate keys are not
	 * allowed but values can be duplicated. 3. Insertion order is not preserved and
	 * it is based on hash code of the keys. 4. Heterogeneous objects are allowed
	 * for both key and value. 5. Null is allowed for keys(only once) and for
	 * values(any number of times). 6. It is best suitable for Search operations.
	 */
	@Test
	public void testHashMap() {

		/*
		 * Creates an empty HashMap object with default initial capacity 16 and default
		 * fill ratio "0.75".
		 */
		HashMap hm = new HashMap();
		hm.put("evyaan", 700);
		hm.put("varun", 100);
		hm.put("dolly", 300);
		hm.put("vaishu", 400);
		hm.put("vaishu", 300);
		hm.put(null, 500);
		hm.put(null, 600);
		// System.out.println(hm);

		Collection values = hm.values();
//		System.out.println(values);

		Set entrySet = hm.entrySet();
		// System.out.println(entrySet);

		Iterator iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			// System.out.println(entry.getKey()+":"+entry.getValue());
		}

	}

	/*
	 * LinkedHashMap, The underlying data structure is a combination of Hashtable+
	 * LinkedList. Insertion order is preserved.
	 */
	@Test
	public void testLinkedHashMap() {
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put("evyaan", 700);
		lhm.put("varun", 100);
		lhm.put("dolly", 300);
		lhm.put("vaishu", 400);
		lhm.put("vaishu", 300);
		lhm.put(null, 500);
		lhm.put(null, 600);

		assertEquals("{evyaan=700, varun=100, dolly=300, vaishu=300, null=600}", lhm.toString());
	}

	/*
	 * IdentityHashMap is exactly same as HashMap except the following differences:
	 * 1. In the case of HashMap JVM will always use ".equals()"method to identify
	 * duplicate keys, which is meant for content comparision. 2. But in the case of
	 * IdentityHashMap JVM will use== (double equal operator) to identify duplicate
	 * keys, which is meant for reference comparision.
	 */
	@Test
	public void testIdentityHashMap() {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);

		HashMap m = new HashMap();
		m.put(i1, "evyaan");
		m.put(i2, "varun");

		assertEquals("{10=varun}", m.toString());

		IdentityHashMap im = new IdentityHashMap();
		im.put(i1, "evyaan");
		im.put(i2, "varun");

		// System.out.println(im);

	}
	
	/*
	 * WeakHashMap is exactly same as HashMap except the following differences:  In the case
	 * of normal HashMap, an object is not eligible for GC even though it doesn't
	 * have any references if it is associated with HashMap. That is HashMap
	 * dominates garbage collector.  But in the case of WeakHashMap if an object
	 * does not have any references then it's always eligible for GC even though it
	 * is associated with WeakHashMap that is garbage collector dominates
	 * WeakHashMap.
	 */
	
	@Test
	public void testWeakHashMap() throws InterruptedException {
		TempKey key = new TempKey();
	//	HashMap m = new HashMap();
		WeakHashMap m = new WeakHashMap();
		m.put(key,"value");
	//	System.out.println(m);
		key = null;
		System.gc();
		Thread.sleep(5000);
	//	System.out.println(m);
	}

}
