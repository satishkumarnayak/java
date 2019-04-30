package org.garage.java.corejava.flowcontrol;

import java.util.ArrayList;
import java.util.List;

public class FlowControl {

	public void switchEx(int switchInput) {

		switch (switchInput) {
		case 0:
			System.out.println("0");
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
		default:
			System.out.println("default");
		}

	}

	public void foreach() {
		int[] array = { 10, 20, 30, 40 };
		// int[] array2;
		// array2 = new int[4];
		List<Integer> arrayList = new ArrayList();
		arrayList.add(50);
		arrayList.add(60);
		arrayList.add(70);
		arrayList.add(80);
		for (int i : array) {
			System.out.println(i);
		}
		for (Integer ele : arrayList) {
			System.out.println(ele);
		}

	}
}
