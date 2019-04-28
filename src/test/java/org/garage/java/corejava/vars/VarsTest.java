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
	public void instanceVariableDefaultValueTest() {
		assertEquals(0, var.instanceVariable);
	}

	@Test
	public void variableAccessFromStaticMethodTest() {
		assertEquals(4, var.staticMethod(4));
	}

	@Test
	public void staticVariableAccessFromStaticMethodTest() {
		var.staticVarible = 3;
		assertEquals(3, var.staticMethodTwo());
	}
	
	@Test
	public void staticVariableClassAccessFromStaticMethodest() {
		Vars.staticVarible = 5;
		assertEquals(5, Vars.staticMethodTwo());
	}

}
