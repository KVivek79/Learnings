package com.DesignPatterns.StrategyPattern;

public class ShoppingCartTest {

	public static void main(String[] args) {
		
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("Iphone",45003.00);
		Item item2 = new Item("S23",40000.00);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		//pay by paypal
		cart.pay(new PaypalStrategy("myemail@example.com", "abc123"));
				
		//pay by credit card
		cart.pay(new CreditCardStrategy("Vivek Kumar", "7827154763582365", "739", "12/25"));

	}

}
