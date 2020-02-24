package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.vehicles.project.WheelException;

public class Main {

	public static void main(String[] args) {
		// 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the license plate: ");
		String licenese_plate = scan.nextLine().trim();
		
		System.out.println("Please enter the brand: ");
		String brand = scan.nextLine().trim();
		
		System.out.println("Please enter the color: ");
		String color = scan.nextLine().trim();
		
		Vehicle car = new Car( licenese_plate, brand, color );
		
	// wheels
		//front_l
		System.out.println("Please enter the front, left wheels brand: ");
		String front_l_wheels_brand = scan.nextLine().trim();
		
		System.out.println("Please enter the front left wheels diameter: ");
		double front_l_wheels_diameter = scan.nextDouble();
		scan.nextLine().trim();
		//front_r
		System.out.println("Please enter the front, right wheels brand: ");
		String front_r_wheels_brand = scan.nextLine().trim();
		
		System.out.println("Please enter the front right wheels diameter: ");
		double front_r_wheels_diameter = scan.nextDouble();
		scan.nextLine().trim();
		
		Wheel front_l = new Wheel(front_l_wheels_brand,front_l_wheels_diameter);
		Wheel front_r = new Wheel(front_r_wheels_brand,front_r_wheels_diameter);
		
		//back wheels
		//back_l
		System.out.println("Please enter the back, left wheels brand: ");
		String back_l_wheels_brand = scan.nextLine().trim();
		
		System.out.println("Please enter the back,left wheels diameter: ");
		double back_l_wheels_diameter = scan.nextDouble();
		scan.nextLine().trim();
		//back_r
		System.out.println("Please enter the back, right wheels brand: ");
		String back_r_wheels_brand = scan.nextLine().trim();
		
		System.out.println("Please enter the back, right wheels diameter: ");
		double back_r_wheels_diameter = scan.nextDouble();
		scan.nextLine().trim();
		
		Wheel back_l = new Wheel(back_l_wheels_brand,back_l_wheels_diameter);
		Wheel back_r = new Wheel(back_r_wheels_brand,back_r_wheels_diameter);
		
		// Create Wheel ArrayList
		List<Wheel> wheels = new ArrayList<Wheel>();
		wheels.add(front_l);
		wheels.add(front_r);
		wheels.add(back_l);
		wheels.add(back_r);
		
		try {
			car.addWheels(wheels);
		} catch (WheelException e) {
			System.out.println("Exception occured: " + e.getMessage());
		}
		
		car.basic_description();
		
	}

}
