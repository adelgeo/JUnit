package com.adel.DemoJUnit;

public class Calculator {

	CalculatorServices service;

	public Calculator(CalculatorServices service) {
		this.service = service;
	}

	public int perform(int i, int j) {

		return service.add(i, j) * i;
	}
}
