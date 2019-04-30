package org.garage.java.corejava.declareaccess2;

import org.garage.java.corejava.declareaccess.DeclareAccess;

public class DeclareAccess2  extends DeclareAccess{
	
	public void mone() {
		DeclareAccess2 da2 = new DeclareAccess2();
		da2.mone();
		da2.mthree();
		DeclareAccess da = new DeclareAccess();
//		da.mone() // compile time issue 
		da.mthree();
		
	}

}


class DeclareAccess3 {
	
}
