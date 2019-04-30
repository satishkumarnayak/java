package org.garage.java.corejava.flowcontrol;

public class FlowControl {

	public void switchEx(int switchInput) {
		
		switch(switchInput) {
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
}
