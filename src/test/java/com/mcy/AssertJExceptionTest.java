package com.mcy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class AssertJExceptionTest {

	@Test
	public void test() {
		Exception e = new RuntimeException("Deneme");
		assertThat(e)	.hasMessage("Deneme")
						.isInstanceOf(RuntimeException.class)
						.hasMessageContaining("ene");
	}

}
