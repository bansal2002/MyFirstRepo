package com.vechicledekho.data;

public class Vechicle {
	
	private String modalName;
	private long price;
	private String fuelType;
	private String companyName;
	private String color;	
	private int mileage;
	private int maximumSpeed;
	private boolean isInsurance;
	private boolean isRto;
	private int madeYear;
    private boolean isTubeless;
	
	public boolean isInsurance() {
		return isInsurance;
	}
	public void setInsurance(boolean isInsurance) {
		this.isInsurance = isInsurance;
	}
	public boolean isRto() {
		return isRto;
	}
	public void setRto(boolean isRto) {
		this.isRto = isRto;
	}
	public int getMadeYear() {
		return madeYear;
	}
	public void setMadeYear(int madeYear) {
		this.madeYear = madeYear;
	}
	public boolean isTubeless() {
		return isTubeless;
	}
	public void setTubeless(boolean isTubeless) {
		this.isTubeless = isTubeless;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
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
	

}
