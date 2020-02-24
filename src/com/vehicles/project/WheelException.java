package com.vehicles.project;

public class WheelException extends Exception{
	// Default constructor
	public WheelException() {}
	
	// constructor with custom message
	public WheelException(String custom_message) {
		super(custom_message);
	}
}
