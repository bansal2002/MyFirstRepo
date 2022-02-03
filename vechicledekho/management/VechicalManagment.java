package com.vechicledekho.management;

import com.vechicledekho.data.Bike;
import com.vechicledekho.data.Car;
import com.vechicledekho.data.VechicleProperties;
import com.vechicledekho.ui.DisplayVechicleInformation;

public class VechicalManagment {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.setModalName("BMW X5");
		car.setColor("Black");
		car.setPrice(7700000);
		car.setCompanyName("BMW");
		car.setFuelType("Petrol");
		car.setMaximumSpeed(200);
		car.setMileage(13);
		car.setNumberOfSeats(5);
		
		Bike bike = new Bike();
		bike.setModalName("Royal Infield Classic 350");
		bike.setCompanyName("Royal Enfield");
		bike.setPrice(187000);
		bike.setFuelType("Petrol");
		bike.setColor("Black");
		bike.setMileage(30);
		bike.setMaximumSpeed(120);
		
		DisplayVechicleInformation display = new DisplayVechicleInformation();
		
		VechicleProperties[] listOfVechicle = new VechicleProperties[2];
		listOfVechicle[0] = car;
		listOfVechicle[1] = bike;
		
		for(VechicleProperties vp : listOfVechicle)
		{
			display.displayInformation(vp);
		}

	}
	
}
