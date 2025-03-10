package com.DesignPatterns.Factory;

public class ProductFactoryA implements ObjectFactory{

	@Override
	public Product getFactoryMethod() {
		
		return new ProductA();
	}

}
