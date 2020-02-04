package com.nk2164.example;

public class TestClass {
	public static void main(String[] args) {
		Person p = new Person();
		Employee e = new Employee();
		
		p.name = "Amy";
		e.name = "Betty";
		
		System.out.println(p.name);
		System.out.println(e.name);
		
		Employee.personCount = 2;
		System.out.println(Person.personCount);
		System.out.println(Employee.personCount);
	}
}
