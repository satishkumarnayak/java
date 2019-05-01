package org.garage.java.corejava.oops;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OverRidingTest {

	@Before
	public void setUp() throws Exception {
	}

//	@Test
	public void test() {
		Parent parent = new Parent();
		Child child = new Child();
	}

//	@Test
	public void testParent() {
		Parent parent = new Parent();
		parent.methodOne();
	}

//	@Test
	public void testChild() {
		Child child = new Child();
		child.methodOne();
	}

//	@Test
	public void testParentChild() {
		Parent pchild = new Child();
		pchild.methodOne();
	}
	
//	@Test
	public void testStaticHiding() {
		Parent parent = new Parent();
		parent.methodTwo();
		Child child = new Child();
		child.methodTwo();
		Parent pchild = new Child();
		pchild.methodTwo();
	}
	
	@Test
	public void testVariableArgumentCase() {
		Parent pchild = new Child();
		pchild.methodThree(10);
	}
}
