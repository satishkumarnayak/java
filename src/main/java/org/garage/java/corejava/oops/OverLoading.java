package org.garage.java.corejava.oops;

public class OverLoading {

	public int methodOne(int param) {
		System.out.println(" methodOne int param");
		return param;
	}

	public int methodOne(float param) {
		System.out.println(" methodOne float param");
		return (int) param;
	}

	public void methodOne(String param) {
		System.out.println(" methodOne String param");
	}
	
	public void methodOne(Object param) {
		System.out.println(" methodOne Object param");
	}

}
