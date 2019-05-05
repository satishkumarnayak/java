package org.garage.java.corejava.lang.pkg;

public class StringGarage {

	public void createString() {
		String str1 = new String("New String in Heap and Pool");
		String str2 = "New String in SCP only";
		String str3 = "New String in SCP only"; // refering to str2, no new in SCP
		// System.out.println(str2 == str3);

	}

	public char charAt(String str, int index) {
		return str.charAt(index); // String zero based index

	}

}
