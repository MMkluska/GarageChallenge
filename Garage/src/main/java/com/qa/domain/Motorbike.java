package com.qa.domain;

public class Motorbike extends Vehicle {

	private String type;
	private double engineCap;
	private boolean electric;

	// Constructors
	public Motorbike() {

	}

	public Motorbike(String make, String colour, int age, String type, double engineCap, boolean electric) {
		super(make, colour, age);
		this.type = type;
		this.engineCap = engineCap;
		this.electric = electric;
	}

	// Getters and Setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getEngineCap() {
		return engineCap;
	}

	public void setEngineCap(double engineCap) {
		this.engineCap = engineCap;
	}

	public boolean isElectric() {
		return electric;
	}

	public void setElectric(boolean electric) {
		this.electric = electric;
	}

	//Methods
	@Override
	public String toString() {
		return "Motorbike [Make: " + getMake() + ", Colour: " + getColour() + ", Age: " + getAge() + ", Type: " + type
				+ ", Engine Capacity: " + engineCap + ", Electric: " + electric + "]";
	}

}
