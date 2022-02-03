package com.vechicledekho.data;

public class Car extends VechicleProperties{
	
	private int numberOfSeats;

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
