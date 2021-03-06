package com.latewind.toturials.decorator;

public class HelloWorld {

	public static void main(String[] args) {

//		Shape circle = new Circle();
//
//		Shape redCircle = new RedShapeDecorator(new Circle());

		Shape redRectangle = new RedShapeDecorator(new Rectangle());
//
		Shape greenRectangle = new GreenShapeDecorator(redRectangle);

		// System.out.println("Circle with normal border");
		// circle.draw();
		//
		// System.out.println("\nCircle of red border");
		// redCircle.draw();
		//
		// System.out.println("\nRectangle of red border");
		// redRectangle.draw();
		greenRectangle.draw();
		
		((ShapeDecorator) greenRectangle).test();

	}

}