package org.garage.java.corejava.arrays;

public class Array {

	int[] a; // array declare
	int[] a1 = { 1, 2, 3 }; // array declare and initialisation
	String[] strArray = { "How", "are", "you", "doing" };
	String[] strArray2 = new String[3];

	public void arrayIntitalWithDefaultValue() {
		a = new int[3];
		for (int i : a) {
			System.out.println(i);
		}
	}

	public void arrayIntitalWithValue() {

		for (int i : a1) {
			System.out.println(i);
		}
	}

	public void stringArrayIntitalWithValue() {

		for (String s : strArray) {
			System.out.println(s);

		}
	}

	public void stringArrayIntitalWithDefaultValue() {

		for (String s : strArray2) {
			System.out.println(s);

		}
	}

	public void stringArrayWithDefaultValue() {
		strArray2[0] = "I";
		strArray2[1] = "am";
		strArray2[2] = "fine";

		for (String s : strArray2) {
			System.out.println(s);

		}
	}

	public void length() {
		int length = strArray.length;
		System.out.println("length of array->" + length);
		System.out.println("length() of String->" + strArray[0].length());
	}

}
