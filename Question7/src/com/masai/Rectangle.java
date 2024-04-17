package com.masai;

public class Rectangle extends Shape{

	public void draw() {
        System.out.println("Drawing Rectangle");
    }

    public void draw(int length, int breadth) {
        System.out.println("Drawing Rectangle with length "+length+" and breadth " +breadth);
    }
}
