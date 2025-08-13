package com.empower.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathematicsTest {
	Mathematics maths=new Mathematics();

	@Test
	public void testSum() {
		int actual = maths.sum(2, 3);
		int expected=5;
		assertEquals(expected, actual);
	}

	@Test
	public void testDifference() {
		int actual = maths.difference(2, 3);
		int expected=-1;
		assertEquals(expected, actual);
	}

	@Test
	public void testProduct() {
		int actual = maths.product(2, 3);
		int expected=6;
		assertEquals(expected, actual);
	}

}
