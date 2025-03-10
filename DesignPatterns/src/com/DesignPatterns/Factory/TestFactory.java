package com.DesignPatterns.Factory;

public class TestFactory {

	public static void main(String[] args) {
		ObjectFactory objA = new ProductFactoryA();
		Product productObjA = objA.getFactoryMethod();
		productObjA.display();
		
		ObjectFactory objB = new ProductFactoryB();
		Product productObjB = objB.getFactoryMethod();
		productObjB.display();
		
	}

}
