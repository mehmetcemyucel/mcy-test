package com.mcy.rules.externalresources;

import org.junit.rules.ExternalResource;

public class MyServer extends ExternalResource {

	public void before() throws Exception {
		System.out.println("server started");
	}

	public void after() {
		System.out.println("server stopped");
	}

}
