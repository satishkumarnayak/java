package org.garage.java.corejava.declareaccess;

import static java.lang.Math.*;

public class DeclareAccess {

	int parent = 12;
	public int staticImports(int input) {
		return (int) sqrt(input);

	}

	public int regularImports(int input) {
		return (int) Math.sqrt(input);

	}
	public void mthree() {
		System.out.println("mthree");
	}
}
