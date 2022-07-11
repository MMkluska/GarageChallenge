package com.qa.domain;

public class Truck extends Vehicle {
	
	private String terrainType;
	private int numberOfWheels;
	private double loadCap;
	
	//Constructors 
	public Truck() {
		
	}

	public Truck(String make, String colour, int age, String terrainType, int numberOfWheels, double loadCap) {
		super(make, colour, age);
		this.terrainType = terrainType;
		this.numberOfWheels = numberOfWheels;
		this.loadCap = loadCap;
	}

	//Getters and Setters
	public String getTerrainType() {
		return terrainType;
	}

	public void setTerrainType(String terrainType) {
		this.terrainType = terrainType;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public double getLoadCap() {
		return loadCap;
	}

	public void setLoadCap(double loadCap) {
		this.loadCap = loadCap;
	}

	//Methods
	@Override
	public String toString() {
		return "Truck [Make: " + getMake() + ", Colour: " + getColour() + ", Age: " + getAge() +
				 ", Terrain type: " + terrainType + ", Number of wheels: " + numberOfWheels + ", Load Capacity: " + loadCap
				+ "]";
	}

	
}
