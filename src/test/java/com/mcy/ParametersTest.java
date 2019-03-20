package com.mcy;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.mcy.hesapmakinesi.HesapMakinesi;

@RunWith(Parameterized.class)
public class ParametersTest {

	private HesapMakinesi h = new HesapMakinesi();

	private int s1, s2, res;

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 1, 2, 3 }, { 1, 5, 6 }, { 2, 7, 9 } });
	}

	public ParametersTest(int s1, int s2, int res) {
		this.s1 = s1;
		this.s2 = s2;
		this.res = res;
	}

	@Test
	public void test() {
		assertEquals(res, h.topla(s1, s2));
	}

}
