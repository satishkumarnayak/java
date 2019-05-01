package org.garage.java.corejava.declareaccess;

public class DeclareAccess4 extends DeclareAccess {
	
	public void mtwo() {
		DeclareAccess4 da4 = new DeclareAccess4();
		da4.mthree();
		da4.mtwo();
	}

	public static void mfour() {
		System.out.println("mfour in child");
	}
}
