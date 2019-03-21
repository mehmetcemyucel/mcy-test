package com.mcy.rules;

import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExpectedExceptionTest {

	@Rule
	public ExpectedException exp = ExpectedException.none();

	@Test
	public void test() {
		exp.expect(NullPointerException.class);
		exp.expectMessage("olmali mi olmamali mi");
		assertTrue(true);
	}

}
