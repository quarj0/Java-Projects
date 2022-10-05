package com.object.oreinted.programming.in.java;

public class AbstractionDemo {

	public static void main(String[] args) {
		abstraction square = new Square();
		square.draw();
		square.resize();
		
		abstraction circle = new Circle();
		circle.draw();
		circle.resize();
	}

}
