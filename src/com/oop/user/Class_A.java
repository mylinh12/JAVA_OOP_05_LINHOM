package com.oop.user;

public class Class_A {
	
	public Class_A() {
		System.out.println("Class A Constructor");
	}
	
	public static String numberItem = "1000";
	public static final String NUMBER_FINAL = "2000";
	
	public String name = "Automation Test", address = "123 Truong Trinh";
	protected String city = "Ha Noi", state = "Hoan Kiem";
	String phone = "0987654321", email = "automated@gmail.com";
	private String firstName = "Automation Test";
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
	return address;	
	}
	
	public void selectAddressInDropdown() {
		
	}
	
	protected String getCity() {
		return city;
	}
	
	protected String getState() {
		return state;
	}
	
	String getPhone() {
		return phone;
	}
	
	String getEmail() {
		return email;
	}
	
	private String getFirstName() {
		return firstName;
	}
	
	public void overrideNumberFinal() {
		// bien la final thi se ko cho gan lai so moi
		// NUMBER_FINAL = "3000";
	}
	
	public final void overrideNumberItem() {
		System.out.println(numberItem);
	}
}
