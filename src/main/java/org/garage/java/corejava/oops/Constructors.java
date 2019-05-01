package org.garage.java.corejava.oops;

public class Constructors {
	
	 int count;
	 static int countStatic;
	
	{
		System.out.println("instance block");
		count++;
		countStatic++;
	}
	
	static {
		System.out.println("static block1");
	}
	public Constructors() {
		super();
		System.out.println(" Constructors Default");
	}
	static {
		System.out.println("static block2");
	}
}
