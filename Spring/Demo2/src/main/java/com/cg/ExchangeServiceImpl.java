package com.cg;

public class ExchangeServiceImpl implements ExchangeService {
	private double exchangeRate;

	public ExchangeServiceImpl(double exchangeRate) {
		System.out.println("Exchange Service Impl()");
		this.exchangeRate = exchangeRate;
	}

	public double getExchangeRate() {
		System.out.println("getExchangeRate()");
		return exchangeRate;
	}

}
