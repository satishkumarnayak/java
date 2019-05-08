package org.garage.java.corejava.collection;

public class MapGarage {

}

class TempKey {
	@Override
	public String toString() {
		return "TempKey";
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("finalize in TempKey");
	}
}