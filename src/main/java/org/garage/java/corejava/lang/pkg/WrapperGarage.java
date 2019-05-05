package org.garage.java.corejava.lang.pkg;

public class WrapperGarage {

	public void methodOne(long l) {
		System.out.println("widening...");
	}

	public void methodOne(Integer i) {
		System.out.println("autoboxing...");
	}
	
	public void methodOne(int... i) {
		System.out.println("avrgs...");
	}

}
