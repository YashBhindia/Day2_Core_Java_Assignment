package com.masai;

public class Circle extends Shape{

	public void draw() {
        System.out.println("Drawing Circle");
    }

    public void draw(int radius) {
        System.out.println("Drawing Circle with radius " +radius);
    }
}
