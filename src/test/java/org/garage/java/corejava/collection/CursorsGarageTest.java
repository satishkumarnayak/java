package org.garage.java.corejava.collection;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

import org.junit.Before;
import org.junit.Test;

/*If we want to get objects one by one from the collection then we should go for cursor.
There are 3 types of cursors available in java. They are:
1. Enumeration
2. Iterator
3. ListIterator*/
public class CursorsGarageTest {

	CursorsGarage cur;

	@Before
	public void setUp() throws Exception {

		cur = new CursorsGarage();
	}

	/*
	 * We can use Enumeration to get objects one by one from the legacy collection
	 * objects.
	 */

	/*
	 * Limitations of Enumeration: 1. We can apply Enumeration concept only for
	 * legacy classes and it is not a universal cursor. 2. By using Enumeration we
	 * can get only read access and we can't perform remove operations. 3. To
	 * overcome these limitations sun people introduced Iterator concept in 1.2v.
	 */
	@Test
	public void testEnumeration() {
		Vector<String> v = new Vector();
		v.add("evyaan");
		v.add("varun");
		v.add(null);
		v.add("varun");
		v.add(null);

		Enumeration<String> elements = v.elements();
		while (elements.hasMoreElements()) {
			// System.out.println(elements.nextElement());
			elements.nextElement();
		}
	}

	/*
	 * 1. We can use Iterator to get objects one by one from any collection object.
	 * 2. We can apply Iterator concept for any collection object and it is a
	 * universal cursor. 3. While iterating the objects by Iterator we can perform
	 * both read and remove operations.
	 */

	/*
	 * Limitations of Iterator: 1. Both enumeration and Iterator are single
	 * direction cursors only. That is we can always move only forward direction and
	 * we can't move to the backward direction. 2. While iterating by Iterator we
	 * can perform only read and remove operations and we can't perform replacement
	 * and addition of new objects. 3. To overcome these limitations sun people
	 * introduced listIterator concept.
	 */

	
	@Test
	public void testIterator() {
		ArrayList list = new ArrayList();
		list.add("varun");
		list.add("evyaan");
		list.add("dolly");
		list.add("vaishu");

		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			String next = (String) iterator.next();
			if (next.equals("dolly")) {
				iterator.remove();
			}
		}
		assertEquals("[varun, evyaan, vaishu]", list.toString());

	}

	/*
	 * 1. ListIterator is the child interface of Iterator. 2. By using listIterator
	 * we can move either to the forward direction (or) to the backward direction
	 * that is it is a bi-directional cursor. 3. While iterating by listIterator we
	 * can perform replacement and addition of new objects in addition to read and
	 * remove operations
	 */
	
	/*
	 * The most powerful cursor is listIterator but its limitation is it is
	 * applicable only for "List objects".
	 */
	
	@Test
	public void testListIterator() {
		LinkedList ll = new LinkedList();
		ll.add("varun");
		ll.add("evyaan");
		ll.add("dolly");
		ll.add("vaishu");

		ListIterator listIterator = ll.listIterator();
		while (listIterator.hasNext()) {
			String str = (String) listIterator.next();
			if (str.equals("dolly")) {
				listIterator.set("tolly");
			}
			if (str.equals("vaishu")) {
				listIterator.remove();
			}
		}
		assertEquals("varun", ll.get(0));
		assertEquals("evyaan", ll.get(1));
		assertEquals("tolly", ll.get(2));

	}

}
