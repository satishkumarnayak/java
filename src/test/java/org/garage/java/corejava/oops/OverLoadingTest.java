package org.garage.java.corejava.oops;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OverLoadingTest {
	
	OverLoading o;

	@Before
	public void setUp() throws Exception {
		o = new OverLoading();
	}

	@Test
	public void testWithInt() {
		o.methodOne(10);
	}
	
	@Test
	public void testWithFloat() {
		o.methodOne(10f);
	}
	
	@Test
	public void testWithChar() {
		o.methodOne('a');
	}
	
	@Test
	public void testWithString() {
		o.methodOne("hello");
	}
	
	@Test
	public void testWithNull() {
		o.methodOne(null);
	}

	@Test
	public void testWithOject() {
		o.methodOne(new Object());
	}
}
