package com.mcy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.assertj.core.api.Condition;
import org.junit.Test;

public class AssertJListTest {

	@Test
	public void test() {
		List<String> sehirler = Arrays.asList("Istanbul", "Ankara", "Izmir");

		assertThat(sehirler).describedAs("HATA MESAJI")
							.contains("Ankara")
							.doesNotContain("Bursa")
							.containsExactly("Istanbul", "Ankara", "Izmir")
							.doesNotHaveDuplicates();
	}

	List<String> turkSehirler = Arrays.asList("Istanbul", "Ankara", "Izmir");
	List<String> yabanciSehirler = Arrays.asList("Paris", "Amsterdam", "Londra");

	@Test
	public void test2() {
		assertThat(yabanciSehirler).have(isThereYabanciSehirleri());
	}

	@Test
	public void test3() {
		List<String> karma = Arrays.asList("Paris", "Amsterdam", "Londra", "Istanbul", "Ankara");
		assertThat(karma)	.haveExactly(2, isThereTurkSehirleri())
							.haveExactly(3, isThereYabanciSehirleri());
	}

	private Condition<? super String> isThereYabanciSehirleri() {
		return new Condition<String>() {
			public boolean matches(String s) {
				return yabanciSehirler.contains(s);
			}
		};
	}

	private Condition<? super String> isThereTurkSehirleri() {
		return new Condition<String>() {
			public boolean matches(String s) {
				return turkSehirler.contains(s);
			}
		};
	}

}
