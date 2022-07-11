package com.qa.domain;

public class Car extends Vehicle {

	private String type;
	private double bootCap;
	private int numberOfDoors;

	// Constructors
	public Car() {
	}

	public Car(String make, String colour, int age, String type, double bootCap, int numberOfDoors) {
		super(make, colour, age);
		this.type = type;
		this.bootCap = bootCap;
		this.numberOfDoors = numberOfDoors;
	}

	// Getters and Setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBootCap() {
		return bootCap;
	}

	public void setBootCap(double bootCap) {
		this.bootCap = bootCap;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	//Methods
	@Override
	public String toString() {
		return "Car [Make: " + getMake() + ", Colour: " + getColour() + ", Age: " + getAge() + ", Type: " + type
				+ ", Trunk capacity: " + bootCap + ", Number of doors: " + numberOfDoors + "]";
	}

}
