package com.empower.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class MathematicsTest2 {
	Mathematics maths=new Mathematics();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("This is before class method");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("This is after class method");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("This is before each test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("This is after each test");
	}

	@Test
	public void testSum() {
		int actual = maths.sum(2, 3);
		int expected=5;
		assertEquals(expected, actual);
	}

	@Test
	@Ignore
	public void testDifference() {
		int actual = maths.difference(2, 3);
		int expected=-1;
		assertEquals(expected, actual);
	}

	@Test
	@Ignore
	public void testProduct() {
		int actual = maths.product(2, 3);
		int expected=6;
		assertEquals(expected, actual);
	}

}
