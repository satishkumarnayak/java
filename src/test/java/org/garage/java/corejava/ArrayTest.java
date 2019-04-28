package org.garage.java.corejava;

import static org.junit.Assert.*;

import org.garage.java.corejava.arrays.Array;
import org.junit.Before;
import org.junit.Test;

public class ArrayTest {

	Array array;

	@Before
	public void setup() {
		array = new Array();
	}

	@Test
	public void arrayIntitalWithDefaultValueTest() {
		array.arrayIntitalWithDefaultValue();
	}

	@Test
	public void arrayIntitalWithValue() {
		array.arrayIntitalWithValue();
	}

	@Test
	public void stringArrayIntitalWithValue() {
		array.stringArrayIntitalWithValue();
	}

	@Test
	public void stringArrayIntitalWithDefaultValue() {
		array.stringArrayIntitalWithDefaultValue();
	}

	@Test
	public void stringArrayWithDefaultValue() {
		array.stringArrayWithDefaultValue();
	}

	@Test
	public void length() {
		array.length();
	}

	@Test
	public void anonymous() {
		array.anonymous();
	}

}
