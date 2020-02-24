package com.vehicles.project;

import java.util.List;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) {
		super(plate, brand, color);
	}

	@Override
	public void addWheels(List<Wheel> wheels) {// throws Exception
		System.out.println("Implement 2 Wheels");		
	}

}
