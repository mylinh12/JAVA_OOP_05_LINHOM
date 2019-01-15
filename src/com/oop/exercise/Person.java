package com.oop.exercise;

public class Person {
	
	public String name, address, age;

	public Person() {
		
	}
	
	public Person(String personName, String personAddress, String personAge) {
		this.name = personName;
		this.address = personAddress;
		this.age = personAge;
	}
	
	public void setName(String personName) {
		this.name = personName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAddress(String personAddress) {
		this.address = personAddress;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAge(String personAge) {
		this.age = personAge;
	}
	
	public String getAge() {
		return age;
	}
	
	public void printPersonalInformation() {
		System.out.println("Name: " + this.name);
		System.out.println("Address: " + this.address);
		System.out.println("Age: " + this.age);
	}
}
