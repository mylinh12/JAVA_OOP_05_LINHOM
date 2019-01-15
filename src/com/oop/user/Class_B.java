package com.oop.user;

import org.testng.annotations.Test;

public class Class_B {

	@Test
	public void TC_01() {
		Class_A classA = new Class_A();
		System.out.println(classA.address);
		System.out.println(classA.city);
		System.out.println(classA.state);
		System.out.println(classA.phone);
		System.out.println(classA.email);
		System.out.println(classA.getPhone());
		System.out.println(classA.getEmail());
	}
}
