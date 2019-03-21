package com.mcy.rules.externalresources;

import org.junit.ClassRule;
import org.junit.Test;

public class ServerTest {

	@ClassRule
	public static MyServer server = new MyServer();
	
	@Test
	public void test() {
		System.out.println("test");
	}
	@Test
	public void test2() {
		System.out.println("test2");
	}
}
