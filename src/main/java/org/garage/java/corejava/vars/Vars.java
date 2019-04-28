package org.garage.java.corejava.vars;

public class Vars {

	public int instanceVariable;
	public static int staticVarible;

	public static int staticMethod(int param) {
		Vars var = new Vars();
		var.instanceVariable = param;
		return var.instanceVariable;
	}
	
	public static int staticMethodTwo() {
		return staticVarible;
	}
	
	
	

}
