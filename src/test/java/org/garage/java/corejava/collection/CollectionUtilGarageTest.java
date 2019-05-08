package org.garage.java.corejava.collection;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class CollectionUtilGarageTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCollections() {
		List list = new ArrayList();
		list.add("A");
		list.add("J");
		list.add("a");
		list.add("P");
		list.add("C");

		Collections.sort(list);
		assertEquals("[A, C, J, P, a]", list.toString());

		int binarySearch = Collections.binarySearch(list, "J");
		assertEquals(2, binarySearch);

		Collections.reverse(list);
		assertEquals("[a, P, J, C, A]", list.toString());
		
		List synchronizedList = Collections.synchronizedList(list);
		
		int[] arr = {12,12,32,43};
		list = Arrays.asList(arr);
	//	list.add(65); UnsupportedOperationException

	}

}
