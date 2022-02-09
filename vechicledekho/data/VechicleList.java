package com.vechicledekho.data;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "VechicleList")
@XmlAccessorType (XmlAccessType.FIELD)
public class VechicleList {
	
	@XmlElement(name = "Vechicle")
	private List<Vechicle> vechicles = null;
	
	public List<Vechicle> getVechicles(){
		return vechicles;
	}
	
	public void setVechicles(List<Vechicle> vechicles) {
		this.vechicles = vechicles;
	}

}
