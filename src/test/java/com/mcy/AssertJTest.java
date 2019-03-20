package com.mcy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class AssertJTest {

	@Test
	public void test() {

		String str = "Istanbul";
		assertThat(str).describedAs("HATA MESAJI: burada bir hata var").isEqualTo("Istanbul").startsWith("Ist")
				.endsWith("bul").contains("tan").isNotEmpty().isNotNull().doesNotContainAnyWhitespaces()
				.doesNotContain("MCY").containsOnlyOnce("tan");

	}

}
