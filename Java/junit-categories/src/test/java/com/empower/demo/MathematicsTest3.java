package com.empower.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class MathematicsTest3 {
	Mathematics cut=new Mathematics();
	
	@BeforeClass
	public static void setupClass() {
		
		
	}
	
	@Before
	public void setup() {
		cut.setNo1(2);
		cut.setNo2(3);
	}
	
	@Test
	@Category(User.class)
	public void addTest() {
		float expected=5.0f;
		cut.add();
		float actual=cut.getResult();
		assertEquals(expected, actual, 0.0f);
	}
	
	@Test
	@Category(Admin.class)
	public void subtractTest() {
		float expected=-1.0f;
		cut.subtract();
		float actual=cut.getResult();
		assertEquals(expected, actual,0.0f);
	}
	
	@Test
	@Category(User.class)
	public void productTest() {
		float expected=6.0f;
		cut.multiply();
		float actual=cut.getResult();
		assertEquals(expected, actual,0.0f);
	}
	
	@Test
	@Category(Admin.class)
	public void divisonTest() {
		float expected=(float)2/3;
		System.out.println(expected);
		cut.divide();
		float actual=cut.getResult();
		assertEquals(expected, actual,0.0f);
	}
}
