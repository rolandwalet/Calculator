package com.qa.mathoperations;

import org.junit.Assert;
import org.junit.Test;

public class SubtractorTest {

	@Test
	public void test() {
		int result = Subtractor.subtract(4,2);
		Assert.assertEquals(2, result);
	}

}
