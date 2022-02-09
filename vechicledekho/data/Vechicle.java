package com.vechicledekho.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Vechicle")
@XmlAccessorType(XmlAccessType.FIELD)
public class Vechicle {
	
	private int vechicleId;
	private String modalName;
	private long price;
	private String fuelType;
	private String companyName;
	private String colour;	
	private int mileage;
	private int maximumSpeed;
    private String vechicleType;
    
	public int getVechicleId() {
		return vechicleId;
	}
	public void setVechicleId(int vechicleId) {
		this.vechicleId = vechicleId;
	}
	public String getModalName() {
		return modalName;
	}
	public void setModalName(String modalName) {
		this.modalName = modalName;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getColour() {
		return colour;
	}
	public void setColor(String colour) {
		this.colour = colour;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public int getMaximumSpeed() {
		return maximumSpeed;
	}
	public void setMaximumSpeed(int maximumSpeed) {
		this.maximumSpeed = maximumSpeed;
	}
	public String getVechicleType() {
		return vechicleType;
	}
	public void setVechicleType(String vechicleType) {
		this.vechicleType = vechicleType;
	}
	
	

}
