package com.DesignPatterns.AbstractFactory;

public class AutoFactory implements VehicleFactory{

	@Override
	public Vehicle getVehicle(String type) {
		if(type.equalsIgnoreCase("Personal")) {
            return new PersonalAuto();
        }
        else if(type.equalsIgnoreCase("Shared")) {
            return new SharedAuto();
        }
        else{
            return new PersonalAuto();
        }
	}

}
