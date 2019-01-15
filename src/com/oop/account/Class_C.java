package com.oop.account;

import org.testng.annotations.Test;

import com.oop.user.Class_A;
import com.oop.user.Class_Interface_01;
import com.oop.user.Class_Interface_02;

public class Class_C extends Class_A implements Class_Interface_01,Class_Interface_02 {
	public Class_C() {
		super();
		System.out.println("Class_C constructor");
	}
	
	@Test
	public void TC_01() {
		System.out.println(name);
		System.out.println(address);
		System.out.println(city);
		System.out.println(state);
		System.out.println(getName());
		System.out.println(getAddress());
		System.out.println(getCity());
		System.out.println(getState());
	}
	
	/*ko cho phep viet lai ham 'overrideNumberItem' vi ham nay da khai bao final o class_A rui.
	public void overrideNumberItem() {
		
	}*/
}
