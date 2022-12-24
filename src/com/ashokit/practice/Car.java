package com.ashokit.practice;

interface Vehicle {

	void cleanVehicle();

	default void startVehicle() {
		System.out.println("Vehicle is starting");
	}

	static void ready() {
		System.out.println("Ready to Drive");
	}
}

public class Car implements Vehicle {

	@Override
	public void cleanVehicle() {
		System.out.println("Cleaning the vehicle");
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.cleanVehicle();
		c.startVehicle();
		Vehicle.ready();
	}

}
