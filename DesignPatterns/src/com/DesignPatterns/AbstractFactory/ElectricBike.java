package com.DesignPatterns.AbstractFactory;

public class ElectricBike extends Bike{
	
	public ElectricBike() {
	}

	@Override
    public void setVehicleType(){
        bikeType = "ElectricBike";
    }

    @Override
    public void setBaseCost(){
        baseCost = 20;
    }

    @Override
    public void setVehicleChargesPerUnitDistance(){
        chargesPerUnitDistance = 5;
    }

}
