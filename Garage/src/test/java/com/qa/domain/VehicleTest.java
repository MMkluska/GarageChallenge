package com.qa.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VehicleTest {
	
	
	@Test
	public void getMakeTest() {
		Vehicle instance = new Vehicle();
		String typeTest = "Audi";
		instance.setMake("Audi");
		String result = instance.getMake();
		assertEquals(typeTest, result);
	}
	
	@Test
	public void setMakeTest() {
		String typeTest = "Audi";
		Vehicle instance = new Vehicle();
	    instance.setMake(typeTest);
	    assertEquals(instance.getMake(), typeTest);
	}

	@Test
	public void getColourTest() {
		Vehicle instance = new Vehicle();
		String typeTest = "Yellow";
		instance.setColour("Yellow");
		String result = instance.getColour();
		assertEquals(typeTest, result);
	}
	
	@Test
	public void setColourTest() {
		String typeTest = "Yellow";
		Vehicle instance = new Vehicle();
	    instance.setColour(typeTest);
	    assertEquals(instance.getColour(), typeTest);
	}

		
	@Test
	public void getAgeTest() {
		Vehicle instance = new Vehicle();
		int typeTest = 1;
		instance.setAge(1);
		int result = instance.getAge();
		assertEquals(typeTest, result);
	}
	
	@Test
	public void setAgeTest() {
		int typeTest = 2;
		Vehicle instance = new Vehicle();
	    instance.setAge(2);
	    assertEquals(instance.getAge(), typeTest);
	}

	@Test
	public void testVehicle() {
		Vehicle instance = new Vehicle("Honda", "Yellow", 5);
		assertEquals("Honda", instance.getMake());
		assertEquals("Yellow", instance.getColour());
		assertEquals(5, instance.getAge());
			
	}
	
	@Test
	public void toStringTest() {
		Vehicle instance = new Vehicle("Honda", "Yellow", 5);
		assertEquals("Vehicle [Make : Honda, Colour : Yellow, Age : 5]",instance.toString());
	}
	


}
