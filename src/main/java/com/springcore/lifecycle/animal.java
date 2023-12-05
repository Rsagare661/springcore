package com.springcore.lifecycle;

public class animal {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "animal [price=" + price + "]";
	}
	

}
