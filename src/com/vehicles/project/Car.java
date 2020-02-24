package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {
	
	public Car(String plate, String brand, String color) {
		super(plate, brand, color);
	}
	
	@Override
	public void addWheels(List<Wheel> wheels) throws WheelException{
		
		List<Wheel> frontWheels = new ArrayList<Wheel>();
		frontWheels.add(wheels.get(0));
		frontWheels.add(wheels.get(1));
		
		List<Wheel> backWheels = new ArrayList<Wheel>();
		backWheels.add(wheels.get(2));
		backWheels.add(wheels.get(3));
				
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}
	
	// Make private!
	private void addTwoWheels(List<Wheel> wheels) throws WheelException{
		if (wheels.size() != 2)
			throw new WheelException("Too many or too few wheels!");

		Wheel leftWheel = wheels.get(0);
		Wheel rightWheel = wheels.get(1);
		
		if (!leftWheel.equals(rightWheel))
			throw new WheelException(leftWheel +" and " + rightWheel + " are different!");
		
		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}

}
