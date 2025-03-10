package com.DesignPatterns.AbstractFactory;

public class SharedAuto extends Auto{

	

	@Override
    public void setVehicleType(){
        shareType = "Shared";
    }

    @Override
    public void setBaseCost(){
        baseCost = 0;
    }

    @Override
    public void setVehicleChargesPerUnitDistance(){
        chargesPerUnitDistance = 10;
    }

}
