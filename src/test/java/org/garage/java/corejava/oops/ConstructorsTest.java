package org.garage.java.corejava.oops;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConstructorsTest {

	@Test
	public void constructorsInstanceBlockStaticBlockTest() {
		Constructors c1 = new Constructors();
		assertEquals(1, c1.count);
		Constructors c2 = new Constructors();
		assertEquals(1, c2.count);
		assertEquals(2, c2.countStatic);
	}

}
