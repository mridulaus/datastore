package com.xworkz.storedata.dto;

import java.io.Serializable;

public class RiverDTO  implements Serializable{
	

	private String name;
	private String origin;
	private double length;
	private int noOfStatesInflow;
	private boolean hydroPlant;

	public RiverDTO() {
 System.out.println("default constructor");
	}

	
	public RiverDTO(String name, String origin, double length, int noOfStatesInflow, boolean hydroPlant) {
	System.out.println("parameter constructor");
		this.name = name;
		this.origin = origin;
		this.length = length;
		this.noOfStatesInflow = noOfStatesInflow;
		this.hydroPlant = hydroPlant;
	}
	@Override
	public boolean equals (Object obj) {
		if(obj==null)return false; // null check 
		if(obj instanceof RiverDTO) {  //  check instance 
	RiverDTO other=(RiverDTO)obj; // down casting
	if(this.name.equals(other.getName()))
		 return true;
		}
		return true;
	}

	@Override
	public String toString() {
		return "RiverDTO [name=" + name + ", origin=" + origin + ", length=" + length + ", noOfStatesInflow="
				+ noOfStatesInflow + ", hydroPlant=" + hydroPlant + "]";
			 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public int getNoOfStatesInflow() {
		return noOfStatesInflow;
	}

	public void setNoOfStatesInflow(int noOfStatesInflow) {
		this.noOfStatesInflow = noOfStatesInflow;
	}

	public boolean isHydroPlant() {
		return hydroPlant;
	}

	public void setHydroPlant(boolean hydroPlant) {
		this.hydroPlant = hydroPlant;
	}

	}