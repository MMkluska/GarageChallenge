package com.qa.handler;

import java.util.ArrayList;
import java.util.List;

import com.qa.domain.Car;
import com.qa.domain.Motorbike;
import com.qa.domain.Truck;
import com.qa.domain.Vehicle;

public class Garage {

	List<Vehicle> vehicle = new ArrayList<>();

	// Constructors
	public Garage() {
	}

	public Garage(List<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	// Methods

	public void addCar(Car car) {
		this.vehicle.add(car);
	}

	public void removeCar(Car car) {
		this.vehicle.remove(car);
	}

	public void addBike(Motorbike motorbike) {
		this.vehicle.add(motorbike);
	}

	public void removeBike(Motorbike motorbike) {
		this.vehicle.remove(motorbike);
	}

	public void addTruck(Truck truck) {
		this.vehicle.add(truck);
	}

	public void removeTruck(Truck truck) {
		this.vehicle.remove(truck);
	}

	public void print() {
		for (Vehicle p : vehicle) {
			System.out.println(p);
		}
	}

	public void bill() {
		for (Vehicle p : vehicle) {

			switch (p.getClass().getSimpleName()) {

			case "Car":

				System.out.println(p.getClass().getSimpleName() + " " + p.getMake() + " Will cost £7 per day");
				break;

			case "Motorbike":

				System.out.println(p.getClass().getSimpleName() + " " + p.getMake() + " Will cost £2 per day");
				break;

			case "Truck":

				System.out.println(p.getClass().getSimpleName() + " " + p.getMake() + " Will cost £15 per day");
				break;

			}
		}
	}

	public String fix(String type, String make) {

		for (Vehicle p : vehicle) {

			if (p.getClass().getSimpleName().equalsIgnoreCase(type) && p.getMake().equalsIgnoreCase(make)) {

				switch (p.getClass().getSimpleName()) {

				case "Car":

					return p.getClass().getSimpleName() + " " + p.getMake() + " Will cost £7 per day";
					

				case "Motorbike":

					return p.getClass().getSimpleName() + " " + p.getMake() + " Will cost £2 per day";
					

				case "Truck":

					return p.getClass().getSimpleName() + " " + p.getMake() + " Will cost £15 per day";
					

				}

			}
		}
		return null;
	}

	public void removeType(String type) {
		for (int i = 0; i < vehicle.size(); i++) {
			if (vehicle.get(i).getClass().getSimpleName().equalsIgnoreCase(type)) {
				vehicle.remove(i);
				i--;
			}
		}
	}

	public void empty() {
		vehicle.clear();

	}

}
