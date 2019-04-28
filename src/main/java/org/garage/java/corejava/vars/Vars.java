package org.garage.java.corejava.vars;

public class Vars {

	public int variable = 4;

	public static int variable() {
		Vars var = new Vars();
		return var.variable;
	}

}
