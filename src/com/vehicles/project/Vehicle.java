package com.vehicles.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Vehicle {

	private String plate;
	private String brand;
	private String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();

	public Vehicle(String plate, String brand, String color) {
		this.plate = plate;
		this.brand = brand;
		this.color = color;
	}
	
	public abstract void addWheels(List<Wheel> wheels) throws WheelException;//
	
	public void basic_description() {
		System.out.println("Your Vehicle's license_plate is: " + plate);
		System.out.println("Your Vehicle's brand is: " + brand);
		System.out.println("Your Vehicle's color is: " + color);
		System.out.println("Your Vehicle has " + wheels.size() + " wheels. ");
		System.out.println("Wheels: " + wheels );
	}
}
