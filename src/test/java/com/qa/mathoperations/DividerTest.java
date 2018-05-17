package com.qa.mathoperations;

import org.junit.Assert;
import org.junit.Test;

public class DividerTest {

	@Test
	public void test() {
		int result = Divider.divide(8,4);
		Assert.assertEquals(2, result);
	}

}