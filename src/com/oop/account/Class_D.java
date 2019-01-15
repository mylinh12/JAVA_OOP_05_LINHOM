package com.oop.account;

import org.testng.annotations.Test;

import com.oop.user.Class_A;

public class Class_D {
	@Test
	public void TC_01() {
		Class_A classA = new Class_A();
		System.out.println(classA.name);
		System.out.println(classA.address);
		System.out.println(classA.getName());
		System.out.println(classA.getAddress());
	}
}
