package com.mcy;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.either;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class HamcrestTest {

	@Test
	public void test() {
		String txt = "MCY";

		// Junitcesi
		assertEquals("MCY", txt);

		// Hamcrestcesi
		assertThat(txt, is(equalTo("MCY")));
		assertThat(txt, is(notNullValue()));
		assertThat(txt, containsString("MC"));
		assertThat(txt, anyOf(containsString("M"), containsString("CY")));
	}

	@Test
	public void testList() {
		List<String> sehirler = new ArrayList<String>(Arrays.asList("Istanbul", "Ankara", "Izmir"));
		assertThat(sehirler, hasItem("Istanbul"));
		assertThat(sehirler, hasItems("Istanbul", "Izmir"));
		assertThat(sehirler, allOf(hasItem("Istanbul"), not(hasItem("Bursa"))));
		assertThat(sehirler, either(hasItem("Istanbul")).or(not(hasItem("Bursa"))));

	}

}
