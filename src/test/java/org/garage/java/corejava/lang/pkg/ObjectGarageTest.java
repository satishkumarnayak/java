package org.garage.java.corejava.lang.pkg;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ObjectGarageTest {

	ObjectGarage obj;

	@Before
	public void setUp() throws Exception {
		obj = new ObjectGarage();
	}

	@Test
	public void toStringTest() {
		Employee emp = new Employee("evyaan", 121);
		assertEquals("name->evyaan,id->121", emp.toString());
	}

	@Test
	public void hashCodeTest() {
		Employee emp = new Employee("evyaan", 121);
		assertEquals(121, emp.hashCode());
	}

	@Test
	public void equalsDefault1Test() {
		Employee emp = new Employee("evyaan", 121);
		Employee emp2 = new Employee("evyaan", 122);
		assertFalse(emp.equals(emp2));
	}

	@Test
	public void equalsTest() {
		Employee emp = new Employee("evyaan", 121);
		Employee emp2 = new Employee("evyaan", 121);
		assertTrue(emp.equals(emp2));
	}

	@Test
	public void equalsFalseTest() {
		Employee emp = new Employee("evyaan", 121);
		Employee emp2 = new Employee("varun", 124);
		assertFalse(emp.equals(emp2));
	}

	/* Contract between .equals() method and hashCode() method: */
	/*
	 * 1. If 2 objects are equal by .equals() method compulsory their hashcodes must
	 * be equal (or) same. That is If r1.equals(r2) is true then
	 * r1.hascode()==r2.hashcode( ) must be true.
	 */
	@Test
	public void testHashCodeEqualsContract1() {
		Employee emp = new Employee("evyaan", 121);
		Employee emp2 = new Employee("evyaan", 121);

		assertTrue(emp.equals(emp2));
		assertTrue(emp.hashCode() == (emp2.hashCode()));

	}

	/*
	 * . 2. If 2 objects are not equal by .equals() method then there are no
	 * restrictions on hashCode() methods. They may be same (or) may be different.
	 * That is If r1.equals(r2) is false then r1.hashCode()==r2.hashCode() may be
	 * same (or) may be different.
	 */

	@Test
	public void testHashCodeEqualsContract2() {
		Employee emp = new Employee("evyaan", 121);
		Employee emp2 = new Employee("varun", 124);

		assertFalse(emp.equals(emp2));
		assertFalse(emp.hashCode() == (emp2.hashCode()));

		Employee emp3 = new Employee("evyaan", 121);
		Employee emp4 = new Employee("varun", 121);

		assertFalse(emp3.equals(emp4));
		assertTrue(emp3.hashCode() == (emp4.hashCode()));

	}

	/*
	 * 3. If hashcodes of 2 objects are equal we can't conclude anything about
	 * .equals() method it may returns true (or) false. That is If
	 * r1.hashCode()==r2.hashCode() is true then r1.equals(r2) method may returns
	 * true (or) false.
	 */

	@Test
	public void testHashCodeEqualsContract3() {
		Employee emp = new Employee("evyaan", 121);
		Employee emp2 = new Employee("varun", 121);

		assertFalse(emp.equals(emp2));
		assertTrue(emp.hashCode() == (emp2.hashCode()));

		Employee emp3 = new Employee("evyaan", 121);
		Employee emp4 = new Employee("evyaan", 121);

		assertTrue(emp3.equals(emp4));
		assertTrue(emp3.hashCode() == (emp4.hashCode()));

	}

	/*
	 * 4. If hashcodes of 2 objects are not equal then these objects are always not
	 * equal by .equals() method also. That is If r1.hashCode()==r2.hashCode() is
	 * false then r1.equals(r2) is always false.
	 */

	@Test
	public void testHashCodeEqualsContract4() {
		Employee emp = new Employee("evyaan", 121);
		Employee emp2 = new Employee("varun", 124);

		assertFalse(emp.hashCode() == (emp2.hashCode()));
		assertFalse(emp.equals(emp2));

	}

	@Test
	public void testClone() throws CloneNotSupportedException {
		TestClone original = new TestClone(12,12, new Employee("varun", 123));
		TestClone cloned = original.cloneme(original);
		assertEquals(original.i, cloned.i);
		assertEquals(original.j, cloned.j);
		assertFalse(original.emp == cloned.emp);
		assertSame(original.emp.getName(),cloned.emp.getName());
		cloned.emp.setName("evyaan");
		assertEquals("evyaan",cloned.emp.getName());
		assertNotSame(original.emp.getName(),cloned.emp.getName());

	}

}
