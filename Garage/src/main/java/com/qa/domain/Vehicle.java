package com.qa.domain;

public class Vehicle {

	private String make;
	private String colour;
	private int age;

	//Constructors
	public Vehicle() {
	}

	public Vehicle(String make, String colour, int age) {

		this.make = make;
		this.colour = colour;
		this.age = age;
	}

	//Getters and Setters
	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getColour() {
		return this.colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//Methods
	@Override
	public String toString() {
		return "Vehicle [Make : " + make + ", Colour : " + colour + ", Age : " + age + "]";
	}

}
