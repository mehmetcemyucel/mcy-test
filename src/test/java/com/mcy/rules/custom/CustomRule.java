package com.mcy.rules.custom;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import org.mockito.MockitoAnnotations;

public class CustomRule implements TestRule{
	
	public CustomRule(Object target) {
		super();
		this.target = target;
	}

	private final Object target;

	public Statement apply(final Statement base, Description description) {
		return new Statement() {

			@Override
			public void evaluate() throws Throwable {
				MockitoAnnotations.initMocks(target);
				base.evaluate();
			}
		};
	}

}
