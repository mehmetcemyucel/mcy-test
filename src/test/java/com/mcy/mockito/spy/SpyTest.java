package com.mcy.mockito.spy;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.spy;

import org.junit.Test;

import com.mcy.mockito.annotation.DummyCustomerService;
import com.mcy.mockito.annotation.DummyCustomerServiceImpl;

public class SpyTest {

	@Test(expected = RuntimeException.class)
	public void test() {
		DummyCustomerService service = spy(new DummyCustomerServiceImpl());

		doNothing()	.when(service)
					.addCustomer("MCY");
		doThrow(new RuntimeException("BLA BLA")).when(service)
												.removeCustomer("MCY");

		service.addCustomer("Cem");
		service.addCustomer("MCY");

		service.removeCustomer("Cem");
		service.removeCustomer("MCY");
	}

}
