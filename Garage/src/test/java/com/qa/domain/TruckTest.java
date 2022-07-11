package com.qa.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TruckTest {

	@Test
	public void getTerrainTypeTest() {
		Truck instance = new Truck();
		String typeTest = "Woods";
		instance.setTerrainType("Woods");
		String result = instance.getTerrainType();
		assertEquals(typeTest, result);
	}

	@Test
	public void setTerrainTypeTest() {
		String typeTest = "Forest";
		Truck instance = new Truck();
		instance.setTerrainType(typeTest);
		assertEquals(instance.getTerrainType(), typeTest);
	}

	@Test
	public void getNumberOfWheelsTest() {
		Truck instance = new Truck();
		int typeTest = 12;
		instance.setNumberOfWheels(12);
		int result = instance.getNumberOfWheels();
		assertEquals(typeTest, result);
	}

	@Test
	public void setNumberOfWheelsTest() {
		int typeTest = 12;
		Truck instance = new Truck();
		instance.setNumberOfWheels(typeTest);
		assertEquals(instance.getNumberOfWheels(), typeTest);
	}

	@Test
	public void getLoadCapTest() {
		Truck instance = new Truck();
		double typeTest = 5000.5;
		instance.setLoadCap(5000.5);
		double result = instance.getLoadCap();
		assertEquals(typeTest, result, 0.1);
	}

	@Test
	public void setLoadCap() {
		double typeTest = 5000.5;
		Truck instance = new Truck();
		instance.setLoadCap(typeTest);
		assertEquals(instance.getLoadCap(), typeTest, 0.1);
	}

	@Test
	public void testTruck() {
		Truck instance = new Truck("Iveco", "White", 5, "City", 12, 14650);
		assertEquals("Iveco", instance.getMake());
		assertEquals("White", instance.getColour());
		assertEquals(5, instance.getAge());
		assertEquals("City", instance.getTerrainType());
		assertEquals(12, instance.getNumberOfWheels());
		assertEquals(14650, instance.getLoadCap(), 0.1);

	}

	@Test
	public void toStringTest() {
		Truck instance = new Truck("Iveco", "White", 5, "City", 12, 14650);
		assertEquals(
				"Truck [Make: Iveco, Colour: White, Age: 5, Terrain type: City, Number of wheels: 12, Load Capacity: 14650.0]",
				instance.toString());
	}

}
