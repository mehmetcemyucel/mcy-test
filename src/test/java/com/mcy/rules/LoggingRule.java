package com.mcy.rules;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import org.mockito.MockitoAnnotations;

public class LoggingRule implements TestRule {

	String value;

	public LoggingRule(String value) {
		super();
		this.value = value;
	}

	public Statement apply(final Statement arg0, Description arg1) {
		return new Statement() {
			@Override
			public void evaluate() throws Throwable {
				System.out.println(value);
				arg0.evaluate();
			}
			
		};
	}

}
