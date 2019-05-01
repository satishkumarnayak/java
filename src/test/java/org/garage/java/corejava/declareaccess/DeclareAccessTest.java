package org.garage.java.corejava.declareaccess;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DeclareAccessTest {

	DeclareAccess da;

	@Before
	public void setup() {
		da = new DeclareAccess();
	}

	@Test
	public void regularImportsTest() {
		assertEquals(2, da.regularImports(4));
	}

//	@Test
	public void staticImportsTest() {
		assertEquals(4, da.staticImports(16));
	}
	
//	@Test
	public void staticmethod() {
		DeclareAccess.mfour();
		DeclareAccess4.mfour();
		da.mfour();
	}

}
