package com.vechicledekho.ui;

import com.vechicledekho.data.Car;
import com.vechicledekho.data.VechicleProperties;

public class DisplayVechicleInformation {
	
	public void displayInformation(VechicleProperties properties) {
		System.out.println("Vechile modal name : "+properties.getModalName());
		System.out.println("Vechile company name : "+properties.getCompanyName());
		System.out.println("Vechile color : "+properties.getColor());
		System.out.println("Vechile fuel type : "+properties.getFuelType());
		System.out.println("Vechile maximum speed : "+properties.getMaximumSpeed());
		System.out.println("Vechile mileage : "+properties.getMileage()+"KM/L");
		System.out.println("Vechile price : "+properties.getPrice());
		
		if(properties instanceof Car) {	
			System.out.println("Number of seats : "+((Car) properties).getNumberOfSeats());
		}
		System.out.println("===================================");
	}

}
