package com.mcy.mockito.annotation;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.ArgumentMatchers.anyString;

@RunWith(MockitoJUnitRunner.class)
public class AnnotationTest {
	
	//@InjectMocks

	@Mock
	DummyCustomerService service;

	@Mock
	DummyCustomerServiceImpl serviceImpl;

	@Before
	public void setUp() throws Exception{
		service = mock(DummyCustomerService.class);
	}

	@Test
	public void test() {
		service.addCustomer("MCY");
		verify(service,times(1)).addCustomer(anyString());
	}

}
