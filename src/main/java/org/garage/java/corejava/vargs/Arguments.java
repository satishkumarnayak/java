package org.garage.java.corejava.vargs;

public class Arguments {

	public int vargMethod(int... param) {
		int sum = 0;
		for (int i : param) {
			sum += i;
		}
		return sum;
	}

	public int vargMethodWithRegularParam(int param1, int... param2) {
		int sum = 0;
		for (int i : param2) {
			sum += i;
		}
		sum += param1;
		return sum;
	}

	public int vargMethodWithRegularParam(int param1, int param2) {
		int result = 0;
		result = param1 - param2;
		return result;
	}
}
