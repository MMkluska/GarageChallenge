package com.qa.garage;

import com.qa.domain.Car;
import com.qa.domain.Motorbike;
import com.qa.domain.Truck;
import com.qa.handler.Garage;

public class Runner {

	public static void main(String[] args) {

		Garage garage = new Garage();

		Car car1 = new Car("Toyota", "Red", 14, "Hatchback", 1542.5, 5);
		Car car2 = new Car("Peugot", "Blue", 1, "Sport", 652.5, 3);
		Car car3 = new Car("Citroen", "Yellow", 3, "Hatchback", 1642.5, 5);
		Car car4 = new Car("Porshe", "Red", 2, "Sport", 743.5, 3);
		Car car5 = new Car("Volvo", "Grey", 13, "Cupe", 842.5, 5);

		Motorbike bike1 = new Motorbike("Honda", "Yellow", 5, "Sport", 740.75, false);
		Motorbike bike2 = new Motorbike("Yamaha", "Red", 2, "Cruise", 523.25, true);
		Motorbike bike3 = new Motorbike("Suzuki", "Green", 7, "Mopet", 240.5, false);
		Motorbike bike4 = new Motorbike("Kawasaki", "Black", 1, "Sport", 940.75, false);
		Motorbike bike5 = new Motorbike("BMW", "Yellow", 2, "Cruise", 653.75, false);

		Truck truck1 = new Truck("Iveco", "White", 5, "City", 12, 14650);
		Truck truck2 = new Truck("Fiat", "Yellow", 3, "Woods", 16, 14310);
		Truck truck3 = new Truck("Scania", "Black", 14, "Arctic", 16, 14341);
		Truck truck4 = new Truck("Volvo", "Green", 9, "City", 8, 15320);
		Truck truck5 = new Truck("Kia", "Blue", 7, "Desert", 18, 25150);

		//Adding vehicle to the list
		garage.addCar(car1);
		garage.addCar(car2);
		garage.addCar(car3);
		garage.addCar(car4);
		garage.addCar(car5);

		garage.addBike(bike1);
		garage.addBike(bike2);
		garage.addBike(bike3);
		garage.addBike(bike4);
		garage.addBike(bike5);
		
		garage.addTruck(truck1);
		garage.addTruck(truck2);
		garage.addTruck(truck3);
		garage.addTruck(truck4);
		garage.addTruck(truck5);
		
		//removing vehicle from a list
		garage.removeTruck(truck3);
		
		
		//prints whole list
		garage.print();
		System.out.println();
		
		//bills all vehicles
		garage.bill();
		System.out.println();
		
		//bills specific vehicle
		System.out.println(garage.fix("Truck", "Iveco"));
		System.out.println();
		
		//removes certain type from the list
		garage.removeType("Truck");
		garage.print();
		System.out.println();
		
		//clears list
		garage.empty();
		garage.print();
		System.out.println();
		
		
	}

}
