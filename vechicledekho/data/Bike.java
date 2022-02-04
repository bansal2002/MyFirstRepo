package com.vechicledekho.data;

public class Bike extends Vechicle{
	
	private String typeOfBike;
	private String power;
	
	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public Bike() {
		System.out.println("These are bike properties");
	}

	public String getTypeOfBike() {
		return typeOfBike;
	}

	public void setTypeOfBike(String typeOfBike) {
		this.typeOfBike = typeOfBike;
	}
	
	

}
