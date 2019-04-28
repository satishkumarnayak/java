package org.garage.java.corejava.vars;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VarsTest {

	Vars var;

	@Before
	public void test() {
		var = new Vars();
	}

	@Test
	public void variableAccessFromStaticMethodTest() {
		assertEquals(4, var.variable());
	}

}
