package com.qa.mathoperations;

import org.junit.Assert;
import org.junit.Test;

public class AdderTest {

	@Test
	public void test() {
		int result = Adder.add(2,2);
		Assert.assertEquals(4, result);
	}

}
