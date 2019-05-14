package org.garage.java.corejava.generics;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


/*
 * Deff : The main objective of Generics is to provide Type-Safety and to resolve
Type-Casting problems.
*/

/*Conclusion1:
 Polymorphism concept is applicable only for the base type but not for parameter
type[usage of parent reference to hold child object is called polymorphism].

Concluson2:
Collections concept applicable only for objects , Hence for the parameter
type we can use any class or interface name but not primitive
value(type).Otherwise we will get compile time error.*/
public class GenericsGarageTest {

	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Case 1: Type-Safety
			 Arrays are always type safe that is we can give the guarantee for the
			  type of elements present inside array.
			 That is we can always provide guarantee for the type of elements present inside
				array and hence arrays are safe to use with respect to type that is arrays are type safe.
			 But collections are not type safe that is we can't provide any guarantee for the
				type of elements present inside collection.
			By mistake if we are trying to add any other type we won't get any compile time
			error but the program may fail at runtime.
	 */
	@Test(expected=ClassCastException.class)
	public void testTypeSafety() {
		
		ArrayList list = new ArrayList();
		list.add("one");
		list.add("two");
		list.add(new Integer(4));
		
		String s1 = (String) list.get(0);
		String s2 = (String) list.get(1);
		String s3 = (String) list.get(2);  //ClassCastException
	}
	
	
	/*
	 * Case 2: Type-Casting In the case of array at the time of retrieval it is not
	 * required to perform any type casting.
	 * 
	 * But in the case of collection at the time of retrieval compulsory we should
		perform type casting otherwise we will get compile time error.
	 */
	
	@Test
	public void testTypeCasting() {

		String[] str = { "one", "two", "three" };

		String s1 = str[0];
		String s2 = str[1];
		String s3 = str[2];

		ArrayList list = new ArrayList();
		list.add("one");
		list.add("two");
		list.add("three");

		String s11 = (String) list.get(0);
		String s12 = (String) list.get(1);
		String s13 = (String) list.get(2);
	}

	
	/* Generic class
	 * In Generics we are associating a type-parameter to the class, such type of
	 * parameterised classes are nothing but Generic classes. Generic class : class
	 * with type-parameter
	 */
	@Test
	public void testGenericClassGarage() {
      GenericClassGarage<String> strObj = new GenericClassGarage<String>("evyaan");
      assertEquals("evyaan", strObj.getObject());
      strObj.show();
      
      GenericClassGarage<Integer> intObj = new GenericClassGarage<Integer>(120);
      assertEquals(120, intObj.getObject());
      intObj.show();
      
      GenericClassGarage<Double> dbObj = new GenericClassGarage<Double>(140.0);
      assertEquals(140.0, dbObj.getObject());
      
      dbObj.show();
	}
	
	/**
	 * Bounded types:
		We can bound the type parameter for a particular range by using extends
		keyword such types are called bounded types.
		class Test<T extends X>
		{}
		 If x is a class then as the type parameter we can pass either x or its child classes.
		 If x is an interface then as the type parameter we can pass either x or its
		implementation classes.
		
		We can't define bounded types by using implements and super keyword.
		
		We can pass any no of type parameters need not be one.
		
		class Test<T extends Number&Runnable&Comparable> {}
	 */
	@Test
	public void testGenericClassBondedTypes() {

		Test2<Integer> t1 = new Test2();

		Test2<Float> t2 = new Test2<Float>();

	}
	
	/* Generic methods and wild-card character (?) : */
	@Test
	public void testGenericMethod() {
//	 System.out.println("Check garage class");	
	}
	
	/*
	 * Generics concept is applicable only at compile time, at runtime there is no
	 * such type of concept.
	 */
	@Test
	public void testGenericsOnlyCompileTime() {
		ArrayList<String> l = new ArrayList<String>();
		l.add("varun");
		l.add(null);
		// l.add(100); CE
		ArrayList lt = methodOne(l);
		assertEquals("[varun, null, evyaan, 100, 123.6]", lt.toString());

	}
	
	private ArrayList methodOne(ArrayList l) {
		l.add("evyaan");
		l.add(100);
		l.add(123.6f);

		return l;
	}
	
	@Test
	public void testGenericsOnlyCompileTime2() {
		ArrayList l = new ArrayList<String>();
		l.add("varun");
		l.add(null);
		l.add(100);
		l.add(100.3f);

		assertEquals("[varun, null, 100, 100.3]", l.toString());

	}

}
