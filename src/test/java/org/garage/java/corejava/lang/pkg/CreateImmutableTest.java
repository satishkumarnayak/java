package org.garage.java.corejava.lang.pkg;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class CreateImmutableTest {


	@Test
	public void testCreateImmutable() {
		Map m = new HashMap();
		m.put("key1", "value1");
		CreateImmutable ci1 = new CreateImmutable("evyaan", 121, m);
		String name = ci1.getName();
		Map m2 = ci1.getM();
		m2.put("key1", "value2");
		Map m1 = new HashMap();
		m1.put("key2", "value2");
		CreateImmutable ci2 = ci1.modify("varun", 124, m1);

		CreateImmutable ci3 = ci1.modify("evyaan", 121, m);
		assertTrue(ci1 == ci3);
		assertFalse(ci1 == ci2);

	//	System.out.println(ci1);
	//	System.out.println(ci2);

		assertEquals("CreateImmutable [name=evyaan, id=121, m={key1=value1}]", ci1.toString());
	}

}
