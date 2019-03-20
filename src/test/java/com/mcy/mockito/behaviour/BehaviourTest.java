package com.mcy.mockito.behaviour;

import static org.junit.Assert.*;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.verifyZeroInteractions;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import com.mcy.mockito.annotation.DummyCustomerService;

public class BehaviourTest {

	@Test
	public void test() {
		DummyCustomerService customerService = Mockito.mock(DummyCustomerService.class);
		customerService.addCustomer("Cem");
		Mockito	.verify(customerService)
				.addCustomer("Cem");
	}

	@Test
	public void test2() {
		DummyCustomerService customerService = Mockito.mock(DummyCustomerService.class);
		customerService.addCustomer("Cem");
		customerService.addCustomer("Cem");
		customerService.addCustomer("Cem2");

		// 2 kez cagirildi
		Mockito	.verify(customerService, times(2))
				.addCustomer("Cem");

		// hic cagirilmadi
		Mockito	.verify(customerService, never())
				.removeCustomer(Mockito.anyString());

		// en az iki kere cagirildi
		Mockito	.verify(customerService, atLeast(2))
				.addCustomer("Cem");
	}

	@Test
	public void test3() {
		// Sirali cagirim verification'i

		DummyCustomerService customerService = Mockito.mock(DummyCustomerService.class);
		customerService.addCustomer("Cem");
		customerService.addCustomer("Cem");
		customerService.addCustomer("Cem2");

		InOrder inorder = Mockito.inOrder(customerService);
		inorder	.verify(customerService)
				.addCustomer("Cem");
		inorder	.verify(customerService)
				.addCustomer("Cem");
		inorder	.verify(customerService)
				.addCustomer("Cem2");

	}

	@Test
	public void test4() {
		DummyCustomerService customerService = Mockito.mock(DummyCustomerService.class);
		customerService.addCustomer("Cem");
		customerService.removeCustomer("Cem1");

		Mockito	.verify(customerService)
				.addCustomer("Cem");
		Mockito	.verify(customerService)
				.removeCustomer("Cem1");

		// Su dakikadan sonra bir daha islem yapilmadiginin verifier'i
		verifyNoMoreInteractions(customerService);
	}

	@Test
	public void test5() {
		DummyCustomerService customerService = Mockito.mock(DummyCustomerService.class);

		// Hic cagirilmasin
		verifyZeroInteractions(customerService);
	}

}
