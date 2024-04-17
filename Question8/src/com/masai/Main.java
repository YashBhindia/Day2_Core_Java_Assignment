package com.masai;

public class Main {

	public static void main(String[] args) {
		 ElectricCar electricCar = new ElectricCar();
	     electricCar.drive();
	     electricCar.fuelType();
	        
	     GasCar gasCar = new GasCar();
	     gasCar.drive();
	     gasCar.fuelType();
	}
}
