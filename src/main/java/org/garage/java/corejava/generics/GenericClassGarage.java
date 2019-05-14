package org.garage.java.corejava.generics;

import java.util.ArrayList;

public class GenericClassGarage<T> {

	T obj;

	public GenericClassGarage(T obj) {
		this.obj = obj;
	}

	public void show() {
//		System.out.println("Type of Object:" + obj.getClass().getName());
	}

	public T getObject() {
		return obj;
	}
}

class Test2<T extends Number> {

}

class TestGenericMethods {

	/*
	 * Within the method we can add only String type of objects and null to the
	 * List.
	 */
	public void methodOne(ArrayList<String> l) {
		l.add("A");
		l.add(null);
	}

	/**
	 * We can use this method for ArrayList of any type but within the method we
	 * can't add anything to the List except null.
	 */
	public void methodTwo(ArrayList<?> l) {
		// l.add("A"); CE
		l.add(null);
	}

	/*
	 *  If x is a class then this method is applicable for ArrayList of either x
	 * type or its child classes.  If x is an interface then this method is
	 * applicable for ArrayList of either x type or its implementation classes.  In
	 * this case also within the method we can't add anything to the List except
	 * null.
	 */
	public void methodThree(ArrayList<? extends Object> l) {
		// l.add("A"); CE
		l.add(null);
	}

	/*
	 * If x is a class then this method is applicable for ArrayList of either x type
	 * or its super classes.  If x is an interface then this method is applicable
	 * for ArrayList of either x type or super classes of implementation class of x.
	 *  But within the method we can add x type objects and null to the List.
	 */
	public void methodFour(ArrayList<? super String> l) {
		l.add("A");
		l.add(null);
//		l.add(10); CE
	}
}