package com.vechicledekho.ui;

import com.vechicledekho.data.Bike;
import com.vechicledekho.data.Car;
import com.vechicledekho.data.Vechicle;

public class DisplayVechicleInformation {
	
	public void displayInformation(Vechicle properties) {
		
		System.out.println("=============Vechicledekho.com=================");
		System.out.println();
		
		System.out.println("Vechile modal name : "+properties.getModalName());
		System.out.println("Vechile company name : "+properties.getCompanyName());
		System.out.println("Vechile color : "+properties.getColor());
		System.out.println("Vechile fuel type : "+properties.getFuelType());
		System.out.println("Vechile maximum speed : "+properties.getMaximumSpeed());
		System.out.println("Vechile mileage : "+properties.getMileage()+"KM/L");
		System.out.println("Vechile price : "+properties.getPrice());
		System.out.println("Vechile made year ; "+properties.getMadeYear());
		System.out.println("Vechile Insurence ; "+properties.isInsurance());
		System.out.println("Vechile RTO ; "+properties.isRto());
		System.out.println("Vechile tyre type ; "+properties.isTubeless());
		
		if(properties instanceof Car) {	
			System.out.println("Number of seats : "+((Car) properties).getNumberOfSeats());
			System.out.println("Number of seats : "+((Car) properties).getHorsePower());
		}else if(properties instanceof Bike) {
			System.out.println("Type of bike : "+((Bike) properties).getTypeOfBike());
		}
		
		System.out.println();
	}

}
