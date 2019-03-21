package com.mcy.rules;

import static org.junit.Assert.fail;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TimeoutRuleTest {

	
	@Rule
	public Timeout timeout = new Timeout(1000);

//	@Test(timeout=1000)
	@Test
	public void test() throws InterruptedException {
		Thread.sleep(1100);
	}

//	@Test(timeout=1000)
	@Test
	public void test2() throws InterruptedException {
		Thread.sleep(1100);
	}
}
