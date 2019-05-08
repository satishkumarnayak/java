package org.garage.java.corejava.collection;

import java.util.Comparator;

public class SetGarage {

}

class MyComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		Integer i1 = (Integer) obj1;
		Integer i2 = (Integer) obj2;
		if (i1 == i2) {
			return 0;
		} else if (i1 < i2) {
			return +1;
		} else
			return -1;

	}

}

class MyComparator2 implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		MyComparableObj i1 = (MyComparableObj) obj1;
		MyComparableObj i2 = (MyComparableObj) obj2;
		Integer r1 = Integer.valueOf(i1.roll);
		Integer r2 = Integer.valueOf(i2.roll);
		return r1.compareTo(r2);

	}

}
class MyComparableObj implements Comparable {

	String name;
	int roll;

	public MyComparableObj(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}

	public int compareTo(Object obj) {
		MyComparableObj obj1 = (MyComparableObj) obj;
		return this.name.compareTo(obj1.name);
	}

	@Override
	public String toString() {
		return "MyComparableObj [name=" + name + ", roll=" + roll + "]";
	}

	

}