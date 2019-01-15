package com.oop.exercise;

public class Employee extends Person{
	public double salary, rate;
	
	public Employee() {

	}
	
	public Employee(String personName, String personAddress, String personAge, double personSalary, double personRate) {
		super(personName, personAddress, personAge);
		super.printPersonalInformation();
		this.salary = personSalary;
		this.rate = personRate;
	}
	
	public void setSalary(double setSalary) {
		this.salary = setSalary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void caculateSalary() {
		System.out.println("Caculate Salary: " + this.salary * this.rate);
	}
	
	 public static void main(String args[]){  
		 Employee employeeA = new Employee("Dao Minh Dam", "30", "123 Le Loi", 1000, 8.0);
		 employeeA.caculateSalary();
		     
		}  
}
