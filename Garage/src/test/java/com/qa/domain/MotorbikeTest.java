package com.qa.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MotorbikeTest {
	
	@Test
	public void getTypeTest() {
		Motorbike instance = new Motorbike();
		String typeTest = "Sport";
		instance.setType("Sport");
		String result = instance.getType();
		assertEquals(typeTest, result);
	}
	
	@Test
	public void setTypeTest() {
		String typeTest = "Sport";
		Motorbike instance = new Motorbike();
	    instance.setType(typeTest);
	    assertEquals(instance.getType(), typeTest);
	}

	
	@Test
	public void getEngineCapTest() {
		Motorbike instance = new Motorbike();
		Double typeTest = 550.4;
		instance.setEngineCap(550.4);
		Double result = instance.getEngineCap();
		assertEquals(typeTest, result,0.1);
	}
	
	@Test
	public void setEngineCapTest() {
		double typeTest = 504.3;
		Motorbike instance = new Motorbike();
	    instance.setEngineCap(typeTest);
	    assertEquals(instance.getEngineCap(), typeTest,0.1);
	}
	
	@Test
	public void isElectricTest() {
		Motorbike instance = new Motorbike();
		boolean typeTest = false;
		instance.setElectric(false);
		boolean result = instance.isElectric();
		assertEquals(typeTest, result);
	}
	
	@Test
	public void setElectricTest() {
		boolean typeTest = false;
		Motorbike instance = new Motorbike();
	    instance.setElectric(false);
	    assertEquals(instance.isElectric(), typeTest);
	}

	@Test
	public void testMotorbike() {
		Motorbike instance = new Motorbike("Honda", "Yellow", 5, "Sport", 740.75, false);
		assertEquals("Honda", instance.getMake());
		assertEquals("Yellow", instance.getColour());
		assertEquals(5, instance.getAge());
		assertEquals("Sport", instance.getType());
		assertEquals(740.75, instance.getEngineCap(),0.1);
		assertEquals(false, instance.isElectric());
		
	}
	
	@Test
	public void toStringTest() {
		Motorbike instance = new Motorbike("Honda", "Yellow", 5, "Sport", 740.75, false);
		assertEquals("Motorbike [Make: Honda, Colour: Yellow, Age: 5, Type: Sport, Engine Capacity: 740.75, Electric: false]",instance.toString());
	}
	

}


