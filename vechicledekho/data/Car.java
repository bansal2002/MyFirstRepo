package com.vechicledekho.data;

public class Car extends Vechicle{
	
	private int numberOfSeats;
	private int horsePower;

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public Car() {
		System.out.println("These are car properties");
	}
	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

}
