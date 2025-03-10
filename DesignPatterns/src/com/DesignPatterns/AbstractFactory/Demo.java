package com.DesignPatterns.AbstractFactory;

public class Demo {
	
	public static void main(String[] args) {
	
	VehicleFactory carFactory = FactoryProvider.getVehicleFactory("Car");
	Vehicle carObj = carFactory.getVehicle("Micro");
	carObj.book(20);
	
	VehicleFactory autoFactory = FactoryProvider.getVehicleFactory("Auto");
    Vehicle personalAuto = autoFactory.getVehicle("Personal");
    personalAuto.book(15);
    
    VehicleFactory bikeFactory = FactoryProvider.getVehicleFactory("Bike");
    Vehicle eBike = bikeFactory.getVehicle("Electric");
    eBike.book(10);
	
	}

}
