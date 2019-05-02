package org.garage.java.corejava.exceptions;

import org.junit.Before;
import org.junit.Test;

public class ExceptionsTest {

	Exceptions ex;
	
	@Before
	public void setup() {
		ex =  new Exceptions();
	}
	
	@Test
	public void testRaiseException() {
	  ex.doSomeStuff();	
	}
	
	
	@Test
	public void testTryWithResources() {
	  ex.tryWithResources();
	}
	

	@Test
	public void testMultiCatch() {
	  ex.multiCatch();
	}
	
	
	
}
