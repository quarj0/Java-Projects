package com.object.oreinted.programming.in.java;

public abstract class abstraction {
	
	int x,y;
	
	void moveTo(int newX, int newY) {
		System.out.print("Moved to: "+x+" Moved to: "+y);
	}

	abstract void draw();
	abstract void resize();

}
