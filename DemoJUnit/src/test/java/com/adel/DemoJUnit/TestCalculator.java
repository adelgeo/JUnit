package com.adel.DemoJUnit;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class TestCalculator {

	Calculator c = null;
	// using Mockito to create a mock service
	// CalculatorServices service = mock(CalculatorServices.class);

	// using mockito with annotation : you should include @Rule annotation
	@Mock
	CalculatorServices service;

	@Rule
	public MockitoRule rule = MockitoJUnit.rule();

	@Before
	public void setUp() {
		c = new Calculator(service);

	}

	@Test
	public void testPerform() {

		when(service.add(2, 3)).thenReturn(5);
		assertEquals(10, c.perform(2, 3));

		// verify if you actually using your mock service
		verify(service).add(2, 3);
	}

}
