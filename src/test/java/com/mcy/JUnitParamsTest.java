package com.mcy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import com.mcy.hesapmakinesi.HesapMakinesi;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class JUnitParamsTest {

	HesapMakinesi h;

	@Before
	public void setUp() throws Exception {
		h = new HesapMakinesi();
	}

	@Test
	@Parameters({ "1,2,3", "2,4,6", "4,1,5" })
	public void toplaTest(int s1, int s2, int res) {
		assertEquals(res, h.topla(s1, s2));
	}

	@Test(expected = ArithmeticException.class)
	@Parameters({ "1,0,0" })
	public void bolTest1(int s1, int s2, int res) {
		assertEquals(res, h.bol(s1, s2));
	}

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	@Parameters({ "1,0,0" })
	public void bolTest2(int s1, int s2, int res) {
		thrown.expect(ArithmeticException.class);
		thrown.expectMessage("/ by zero");
		assertEquals(res, h.bol(s1, s2));
	}

}
