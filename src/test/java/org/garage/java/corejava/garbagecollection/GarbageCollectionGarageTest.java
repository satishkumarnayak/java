package org.garage.java.corejava.garbagecollection;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/*
 * Sun people provided one assistant which is always running in the background for
destruction at useless objects. Due to this assistant the chance of failing java
program is very rare because of memory problems.

 Even through programmer is not responsible for destruction of objects but it is
always a good programming practice to make an object eligible for GC if it is no
longer required.
 An object is eligible for GC if and only if it does not have any references.

The ways to make an object eligible for GC:
1.Nullifying the reference variable:
2.Reassign the reference variable:
3. Objects created inside a method:
4.Island of Isolation

Note: if an object doesn't have any reference then it always eligible for GC.
Note: Even though object having reference still it is eligible for GC some times.
 */
public class GarbageCollectionGarageTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
