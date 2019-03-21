package com.mcy.rules.custom;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;

public class CustomRuleTest {

	// Mesela bu sekilde sadece rule ile mocklarin ayaga kaldirilmasini
	// saglayabilinir.
	// Bu rule'u extend eden diger rule'larda behaviour'lar tanimlanabilir

	@Rule
	public CustomRule rule = new CustomRule(this);

	@Mock
	CustomService service;

	@Test
	public void test() {
		assertThat(service).isNotNull();
	}

}
