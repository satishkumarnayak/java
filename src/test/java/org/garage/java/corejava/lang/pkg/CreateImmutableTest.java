package org.garage.java.corejava.lang.pkg;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CreateImmutableTest {


	@Test
	public void testCreateImmutable() {
		CreateImmutable ci1 = new CreateImmutable("evyaan", 121);
		CreateImmutable ci2 = ci1.modify("varun", 124);
		CreateImmutable ci3 = ci1.modify("evyaan", 121);
		assertTrue(ci1 == ci3);
		assertFalse(ci1 == ci2);
	}

}
