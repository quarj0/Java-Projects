package com.object.oreinted.programming.in.java;

// Encapsulation practice

public class Student{
	private String name;
	private String address;
	private int age;
	
	public Student(String name, String address, int age) {
		this.name=name;
		this.address=address;
		this.age=age;
	}
	public void  setName(String name) {
		this.name = name;
	}
	
	public void  setAddress(String address) {
		this.address = address;
	}
	
	public void  setAge(int age) {
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int age() {
		return age;
	}
	
	@Override
	public String toString() {
		return ("Student name is " + this.getName() + " and is "+this.age +"years of age." + " The address is of " +this.getName()+" is " +this.getAddress());
	}

	
	public static void main (String [] args) {
		Student john = new Student("John", "NorthEast 541 line Arizona", 23);
		System.out.print(john);
	}
}