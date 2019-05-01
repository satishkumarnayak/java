package org.garage.java.corejava.declareaccess;

import static java.lang.Math.*;

public class DeclareAccess {
    static transient int i;
	int parent = 12;
	final int instance;

	{
		System.out.println("instance block");
		instance = 10;
	}

	static {
		System.out.println("static block");
	}

	public DeclareAccess() {
		// instance = 10;
		System.out.println("constructor");
	}

	public int staticImports(int input) {
		return (int) sqrt(input);

	}

	public int regularImports(int input) {
		return (int) Math.sqrt(input);

	}

	public void mthree() {
		System.out.println("mthree");
	}
	
	public void localVarMethod() {
		final int j;  // final or non final
		System.out.println("No issues as we are not using local variable");
	//	System.out.println(j); must be initialised before use
	}
	
	public static void mfour() {
		System.out.println("mfour");
	}
}

abstract interface MyInt {
	 
	abstract void   myint();
 }