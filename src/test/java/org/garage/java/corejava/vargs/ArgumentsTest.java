package org.garage.java.corejava.vargs;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ArgumentsTest {

	Arguments arg;

	@Before
	public void setup() {
		arg = new Arguments();
	}

	
	@Test
	public void vargTest() {
		assertEquals(0, arg.vargMethod(0));
	}

	@Test
	public void vargTestNoParam() {
		assertEquals(0, arg.vargMethod());
	}

	@Test
	public void vargTestTwoParam() {
		assertEquals(3, arg.vargMethod(1, 2));
	}

	@Test
	public void vargTestThreeParam() {
		assertEquals(7, arg.vargMethod(2, 2, 3));
	}

	@Test
	public void vargMethodWithRegularParamTest() {
		assertEquals(7, arg.vargMethodWithRegularParam(2, 2, 3));
	}

	@Test
	public void vargMethodWith2RegularParamOverLoadedTest() {
		assertEquals(0, arg.vargMethodWithRegularParam(2, 2));
	}

}
