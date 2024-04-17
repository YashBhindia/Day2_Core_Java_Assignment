package com.masai;

public class Main {

	public static void main(String[] args) {
		Shape shape = new Shape();
        shape.draw();

        Circle circle = new Circle();
        circle.draw();
        circle.draw(10);

        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        rectangle.draw(4, 8);
	}
}
