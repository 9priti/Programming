package com.practice.programming.designPattern.java;

public class FactoryPatternDemo {

	public static void main(String[] args) {

		ShapeFactory factory = new ShapeFactory ();
		
		Shape shape =factory.getShape("CIRCLE");
		shape.draw();
		
		Shape shape1 = factory.getShape("TRIANGLE");
		shape1.draw();
		
		Shape shape2 = factory.getShape("RECTANGLE");
		shape2.draw();
	}

}
