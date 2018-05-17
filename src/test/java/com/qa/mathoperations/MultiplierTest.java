package com.qa.mathoperations;

import org.junit.Assert;
import org.junit.Test;

public class MultiplierTest {

	@Test
	public void test() {
		int result = Multiplier.multiply(3,2);
		Assert.assertEquals(6, result);
	}

}