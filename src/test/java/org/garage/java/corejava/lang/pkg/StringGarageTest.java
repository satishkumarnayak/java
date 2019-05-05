package org.garage.java.corejava.lang.pkg;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringGarageTest {

	StringGarage str;

	@Before
	public void setUp() throws Exception {
		str = new StringGarage();
	}

	@Test
	public void createStringTest() {
		str.createString();
	}

	//Returns the character locating at specified index.
	@Test
	public void charAtTest() {
		assertEquals('r', str.charAt("Garage", 2)); // String zero based index
	}

	@Test
	public void concatTest() {
		String str = new String("Garage");
		str.concat("Super");
		assertEquals("Garage", str);
		str = str.concat("Super");
		assertEquals("GarageSuper", str);
		str = str + "Grand";
		assertEquals("GarageSuperGrand", str);
	}
	
	// Return the substring from begin index to end of the string.
	@Test
	public void substringTest() {
		String str = new String("Garage");
		assertEquals("rage",str.substring(2));
	}
	
	//Returns the substring from begin index to end-1 index.
	@Test
	public void substring2Test() {
		String str = new String("Garage");
		assertEquals("ar",str.substring(1,3));
	}
	
	//To replace every old character with a new character.
	@Test
	public void replaceTest() {
		String str = new String("Garage");
		assertEquals("GBrBge",str.replace('a', 'B'));
	}
	
	//It returns index of 1st occurrence of the specified character if the specified
	//character is not available then return -1.
	@Test
	public void indexOfTest() {
		String str = new String("Garage");
		assertEquals(1,str.indexOf('a'));
		assertEquals(-1,str.indexOf('b'));
	}
	
	/*
	 * It returns index of last occurrence of the specified character if the
	 * specified character is not available then return -1.
	 */
	@Test
	public void lastindexOfTest() {
		String str = new String("Garage");
		assertEquals(3,str.lastIndexOf('a'));
		assertEquals(-1,str.lastIndexOf('b'));
	}
}
