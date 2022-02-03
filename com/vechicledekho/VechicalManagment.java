package com.vechicledekho;

public class VechicalManagment {

	public static void main(String[] args) {
		
		VechicleProperties vp = new Bike();
		setProperties(vp);
		getProperties(vp);

	}
	
	public static void setProperties(VechicleProperties properties) {
		properties.setVechicleModalName("Hero motarbike");
		properties.setVechiclePrice(70000);
		properties.setFuelType("petrol");
		properties.setVechicleColor("Black");
		properties.setVechicleCompany("Hero motars");
	}

	public static void getProperties(VechicleProperties properties) {
		System.out.println("Vechicle name : "+properties.getVechicleModalName());
		System.out.println("Vechicle name : "+properties.getVechiclePrice());
		System.out.println("Vechicle name : "+properties.getFuelType());
		System.out.println("Vechicle name : "+properties.getVechicleCompany());
		System.out.println("Vechicle name : "+properties.getVechicleColor());
	}
}
