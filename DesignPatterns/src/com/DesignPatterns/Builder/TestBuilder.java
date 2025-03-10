package com.DesignPatterns.Builder;

public class TestBuilder {

	public static void main(String[] args) {
		Customer customer = new CustomerBuilder()
                .firstName("Hero")
                .lastName("Moto")
                .primaryEmail("hermoto@server.com")
                .primaryMobileNumber("3523634634")
                //.getSecondaryEmail()
                .build();
		System.out.println(customer.toString());
	}

}
