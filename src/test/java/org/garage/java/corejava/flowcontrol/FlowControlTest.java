package org.garage.java.corejava.flowcontrol;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FlowControlTest {

	FlowControl flowControl;

	@Before
	public void test() {
		flowControl = new FlowControl();
	}

	@Test
	public void switchExTest() {
		flowControl.switchEx(3);
	}

}
