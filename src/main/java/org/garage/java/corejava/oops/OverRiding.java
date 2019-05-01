package org.garage.java.corejava.oops;

public class OverRiding {

}

class Parent {

	public Parent() {
		System.out.println("Parent constructor");
	}
	
	public void methodOne() {
		System.out.println("Parent methodOne");
	}
	
	public static void methodTwo() {
		System.out.println("Parent methodTwo");
	}
	
	public void methodThree(int... pram) {
		System.out.println("Parent methodThree");
	}
	
	
}

class Child extends Parent {
	public Child() {
		super();
		System.out.println("Child constructor");
	}
	
	public void methodOne() {
		
		System.out.println("Child methodOne");
	}
	public static void methodTwo() {
		
		System.out.println("Child methodTwo");
	}
	
	public void methodThree(int... pram) {
		System.out.println("Child methodThree");
	}

}
