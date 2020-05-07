package org.garage.java.corejava.serialization;

import java.io.Serializable;

public class MySerializable implements Serializable {
	
	public String someString;
	
	public int  someInt;
	
	public MyClass myclass;
	
//	public static  int  someInt;
	
//	public transient final int  someInt = 400; // final keyword makes serialization irrespective of  transient or static
	
//	public transient int someInt; // transient or static skips serialization 

	public String getSomeString() {
		return someString;
	}

	public void setSomeString(String someString) {
		this.someString = someString;
	}

	public int getSomeInt() {
		return someInt;
	}

	public void setSomeInt(int someInt) {
		this.someInt = someInt;
	}
	
	

	public MyClass getMyclass() {
		return myclass;
	}

	public void setMyclass(MyClass myclass) {
		this.myclass = myclass;
	}

	@Override
	public String toString() {
		return "MySerializable [someString=" + someString + ", someInt=" + someInt + ", myclass=" + myclass + "]";
	}

	
	
	
	
	
	

}
