package com.qa.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarTest {

	
	@Test
	public void getTypeTest() {
		Car instance = new Car();
		String typeTest = "Family";
		instance.setType("Family");
		String result = instance.getType();
		assertEquals(typeTest, result);
	}
	
	@Test
	public void setTypeTest() {
		String typeTest = "Family";
		Car instance = new Car();
	    instance.setType(typeTest);
	    assertEquals(instance.getType(), typeTest);
	}

	
	@Test
	public void getBootCapTest() {
		Car instance = new Car();
		Double typeTest = 550.4;
		instance.setBootCap(550.4);
		Double result = instance.getBootCap();
		assertEquals(typeTest, result);
	}
	
	@Test
	public void setBootCapTest() {
		double typeTest = 504.3;
		Car instance = new Car();
	    instance.setBootCap(typeTest);
	    assertEquals(instance.getBootCap(), typeTest,0.1);
	}
	
	@Test
	public void getDoorTest() {
		Car instance = new Car();
		int typeTest = 5;
		instance.setNumberOfDoors(5);
		int result = instance.getNumberOfDoors();
		assertEquals(typeTest, result);
	}
	
	@Test
	public void setDoorTest() {
		int typeTest = 5;
		Car instance = new Car();
	    instance.setNumberOfDoors(typeTest);
	    assertEquals(instance.getNumberOfDoors(), typeTest);
	}

	@Test
	public void testCar() {
		Car instance = new Car("Toyota", "Red", 14, "Hatchback", 1542.5, 5);
		assertEquals("Toyota", instance.getMake());
		assertEquals("Red", instance.getColour());
		assertEquals(14, instance.getAge());
		assertEquals("Hatchback", instance.getType());
		assertEquals(1542.5, instance.getBootCap(),0.1);
		assertEquals(5, instance.getNumberOfDoors());
		
	}
	
	@Test
	public void toStringTest() {
		Car instance = new Car("Toyota", "Red", 14, "Hatchback", 1542.5, 5);
		assertEquals("Car [Make: Toyota, Colour: Red, Age: 14, Type: Hatchback, Trunk capacity: 1542.5, Number of doors: 5]",instance.toString());
	}
	
}
