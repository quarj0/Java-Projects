package com.object.oreinted.programming.in.java;

public class Cuboid {
	double width;
	double length;
	float depth;

	 Cuboid(double width, double length, float depth) {
		this.width=width;
		this.depth=depth;
		this.length=length;
	}
	 
	Cuboid(){
		 width= 50;
		 length=12;
		 depth=3;
	}
	Cuboid(double lenght, double width){
	this.length=lenght;
	this.width=width;
	this.depth=2;
}
	double result() {
		return width*length*depth;
	}
	
	public static void main(String[] args) {
		double volume;
		Cuboid noParam = new Cuboid();
		volume =noParam.result();
		System.out.println("The result of noParam is "+volume);
		
		Cuboid allParam = new Cuboid(14,12,6);
		System.out.println("The result of allParam is "+allParam.result());
		
		Cuboid dualParam = new Cuboid(6,7);
		System.out.println("The result of dualParam is "+dualParam.result());
		

	}

}
