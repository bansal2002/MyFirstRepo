package com.vechicledekho;

public class Car extends VechicleProperties{
	
	private int noOfSeats;

	public Car() {
		System.out.println("These are car properties");
	}
	
	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

}
