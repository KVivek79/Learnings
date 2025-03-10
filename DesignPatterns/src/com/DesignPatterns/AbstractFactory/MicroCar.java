package com.DesignPatterns.AbstractFactory;

public class MicroCar extends Car{
	
	public MicroCar(){};

	@Override
    public void setVehicleType(){
        carType = "Micro";
    }

    @Override
    public void setBaseCost(){
        baseCost = 30;
    }

    @Override
    public void setVehicleChargesPerUnitDistance(){
        chargesPerUnitDistance = 12;
    }

}
