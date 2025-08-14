package com.empower.demo;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MathematicsTest {
	int no1;
	int no2;
	int expectedResult;
	Mathematics maths = new Mathematics();

	public MathematicsTest(int no1, int no2, int expectedResult) {
		super();
		this.no1 = no1;
		this.no2 = no2;
		this.expectedResult = expectedResult;
	}

	@Test
	public void addTest() {
//		Runtime rt=new Runtime();		//error
		Runtime rt=Runtime.getRuntime();		//correct
		
		
		maths.setNo1(no1);
		maths.setNo2(no2);
		maths.add();
		int actualResult = maths.getResult();
		assertEquals(expectedResult, actualResult);
	}

	@Parameterized.Parameters
	public static Collection populateValues() {
		return Arrays
				.asList(new Object[][] { { 2, 3, 5 }, { 5, 4, 9 }, { 11, 12, 23 }, { 100, 200, 300 }, { 18, 28, 46 } });

	}
}
