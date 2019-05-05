package org.garage.java.corejava.lang.pkg;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WrapperGarageTest {

	WrapperGarage wrap;

	@Before
	public void setUp() throws Exception {
		wrap = new WrapperGarage();
	}

	@Test
	public void testConstructor() {
		Integer i = new Integer(10);
		Integer i1 = new Integer("10");
		assertEquals(i, i1);

		Float f1 = new Float(10.5f);
		Float f2 = new Float("10.5f");
		assertEquals(f1, f2);

		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("TRuE");
		assertEquals(b1, b2);

		Character c1 = new Character('c');
		// Character cs2 = new Character("c"); Not Allowed, CE
	}

	@Test
	public void testUtilityMethods() {
		/*
		 * We can use valueOf() method to create wrapper object for the given primitive
		 * or String this method is alternative to constructor.
		 */
		Integer i = Integer.valueOf("10");
		Double d = Double.valueOf(123);
		Boolean b = Boolean.valueOf("super");
		Character c = Character.valueOf('r');

		assertEquals(i, 10);
		assertEquals(d, 123.0);
		assertEquals(b, false);
		assertEquals(c, 'r');

		/* We can use xxxValue() methods to convert wrapper object to primitive. */

		assertEquals(10, i.intValue());
		assertEquals(123.0, d.doubleValue());
		assertEquals(false, b.booleanValue());
		assertEquals('r', c.charValue());

		/* We can use parseXxx() method to convert String to corresponding primitive. */

		assertEquals(10, Integer.parseInt("10"));
		assertEquals(123.0, Double.parseDouble("123"));
		assertEquals(false, Boolean.parseBoolean("Hello"));
		assertEquals(false, Boolean.parseBoolean("false"));

	}

	/*
	 * All wrapper objects are immutable that is once we created a wrapper object we
	 * can't perform any changes in the existing object. If we are trying to perform
	 * any changes with those changes a new object will be created.
	 */
	@Test
	public void autoboxingTest() {
		Integer i1 = 100;
		Integer i2 = 100;

		assertTrue(i1 == i2);

		Integer i3 = new Integer(100);
		Integer i4 = new Integer(100);

		assertFalse(i3 == i4);

		Integer i5 = 100 + new Integer(100);
		assertEquals(200, i5);

		/*
		 * 1. To implement the Autoboxing concept in every wrapper class a buffer of
		 * objects will be created at the time of class loading. 2. By Autoboxing if an
		 * object is required to create 1st JVM will check whether that object is
		 * available in the buffer or not.(Integer -128 To 127 buffer at loading)
		 */

		Integer i6 = 100;
		Integer i7 = 100;

		assertTrue(i6 == i7);

		Integer i8 = 1000;
		Integer i9 = 1000;

		assertFalse(i8 == i9);

	}

	/*
	 * In general var-arg method will get least priority i.e., if no other method
	 * matched then only var-arg method will get chance. It is exactly same as
	 * "default" case inside a switch. Note : While resolving overloaded methods
	 * compiler will always gives the presidence in the following order : 1.
	 * Widening 2. Autoboxing 3. Var-arg method.
	 */
	@Test
	public void overload() {
		// Widening dominates Autoboxing.
		wrap.methodOne(10);

		// Widening dominates var-arg method.
		int i = 20;
		wrap.methodOne(i);

		// Widening dominates var-arg method.
		wrap.methodOne(new Integer(10));

	}

}
