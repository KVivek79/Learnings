package com.DesignPatterns.AbstractFactory;

public class CarFactory implements VehicleFactory{

	@Override
	public Vehicle getVehicle(String type) {
		 if(type.equalsIgnoreCase("Micro")) {
	            return new MicroCar();
	        }
	        else if(type.equalsIgnoreCase("Mini")) {
	            return new MiniCar();
	        }
	        else if(type.equalsIgnoreCase("Mega")) {
	            return new MegaCar();
	        }
	        else{
	            return new MiniCar();
	        }
	}

}
