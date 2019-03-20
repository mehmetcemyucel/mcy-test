package com.mcy.mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.security.Provider.Service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.mcy.mockito.annotation.DummyCustomerService;

import static org.mockito.Mockito.*;

public class OnAsamaTest {

	@Test
	public void test() {
		DummyCustomerService customerService = Mockito.mock(DummyCustomerService.class);
		when(customerService.getCustomer(anyString())).thenReturn("result");

		String customer = customerService.getCustomer("Cem");
		assertThat(customer).isEqualTo("result");
	}

	@Test
	public void test2() {
		DummyCustomerService customerService = Mockito.mock(DummyCustomerService.class);
		when(customerService.getCustomer(eq("MCY"))).thenReturn("result");

		String customer = customerService.getCustomer("MCY");
		assertThat(customer).isEqualTo("result");

	}

	@Test
	public void test3() {
		DummyCustomerService customerService = Mockito.mock(DummyCustomerService.class);
		doNothing()	.when(customerService)
					.addCustomer(anyString());

		doReturn("Cem")	.when(customerService)
						.getCustomer("MCY");

		assertThat(customerService.getCustomer("MCY")).isEqualTo("Cem");
	}
}
