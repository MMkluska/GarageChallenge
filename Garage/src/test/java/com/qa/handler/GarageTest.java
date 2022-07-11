package com.qa.handler;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.qa.domain.Car;
import com.qa.domain.Motorbike;
import com.qa.domain.Truck;

public class GarageTest {
	
	Garage tryMe = new Garage();

	@Before
	public void init() {

		Truck truck1 = new Truck("Iveco", "White", 5, "City", 12, 14650);
		Motorbike bike1 = new Motorbike("Honda", "Yellow", 5, "Sport", 740.75, false);
		Car car1 = new Car("Toyota", "Red", 14, "Hatchback", 1542.5, 5);

		tryMe.addTruck(truck1);
		tryMe.addCar(car1);
		tryMe.addBike(bike1);

	}

	@Test
	public void fixTestTruck() {
		String type = "Truck";
		String make = "Iveco";
		assertEquals("Expected: Truck Iveco Will cost £15 per day", type + " " + make + " Will cost £15 per day",
				tryMe.fix(type, make));

	}
	
	@Test
	public void fixTestCar() {
		String type = "Car";
		String make = "Toyota";
		assertEquals("Expected: Car Toyota Will cost £7 per day", type + " " + make + " Will cost £7 per day",
				tryMe.fix(type, make));

	}
	
	@Test
	public void fixTestBike() {
		String type = "Motorbike";
		String make = "Honda";
		assertEquals("Expected: Motorbike Toyota Will cost £7 per day", type + " " + make + " Will cost £2 per day",
				tryMe.fix(type, make));

	}
	
	@Test
	public void fixTestNull() {
		String type = "Wrong";
		String make = "And Wrong";
		assertEquals("Expected: Null", null,
				tryMe.fix(type, make));

	}

}
