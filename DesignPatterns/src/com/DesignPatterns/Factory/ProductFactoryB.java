package com.DesignPatterns.Factory;

public class ProductFactoryB implements ObjectFactory{

	@Override
	public Product getFactoryMethod() {
		
		return new ProductB();
	}

}
