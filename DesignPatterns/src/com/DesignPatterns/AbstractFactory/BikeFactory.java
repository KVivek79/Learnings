package com.DesignPatterns.AbstractFactory;

public class BikeFactory implements VehicleFactory{

	@Override
	public Vehicle getVehicle(String type) {
		if(type.equalsIgnoreCase("Electric")) {
            return new ElectricBike();
        }
        else if(type.equalsIgnoreCase("Sports")) {
            return new SportsBike();
        }
        else{
            return new ElectricBike();
        }
	}

}
