package com.masai;

abstract class Car implements Vehicle{

	public void drive() {
        System.out.println("car.");
    }
    
    abstract void fuelType();
}
