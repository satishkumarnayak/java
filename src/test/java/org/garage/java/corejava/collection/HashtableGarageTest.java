package org.garage.java.corejava.collection;

import static org.junit.Assert.*;

import java.util.Hashtable;

import org.junit.Before;
import org.junit.Test;

public class HashtableGarageTest {

	@Before
	public void setUp() throws Exception {
	}

	/*
	 * 1. The underlying data structure is Hashtable. 2. Insertion order is not
	 * preserved and it is based on hash code of the keys. 3. Heterogeneous objects
	 * are allowed for both keys and values. 4. Null key (or) null value is not
	 * allowed otherwise we will get NullPointerException. 5. Duplicate keys are
	 * allowed but values can be duplicated. 6. Every method present inside
	 * Hashtable is syncronized and hence Hashtable objet is Thread-safe.
	 */

	@Test
	public void testHashtable() {

		/*
		 * Creates an empty Hashtable object with default initialcapacity 11 and default
		 * fill ratio 0.75.
		 */
		Hashtable h = new Hashtable();
		h.put(new TempKey(10), "V");
		h.put(new TempKey(20), "B");
		h.put(new TempKey(30), "J");
		h.put(new TempKey(16), "O");
		h.put(new TempKey(16), "P");
		System.out.println(h);
		

	}

	class TempKey {

		TempKey(int i) {
			this.i = i;
		}

		int i;

		@Override
		public int hashCode() {
			return i;
		}

		public String toString() {
			return i + "";
		}
		
		public boolean equals(Object o) {
			TempKey i = (TempKey) o;
			if(i.i == this.i) {
				return true;
			} else
			return false;
		}
	}

}
