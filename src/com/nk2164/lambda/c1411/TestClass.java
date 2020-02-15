package com.nk2164.lambda.c1411;

import java.util.*;

public class TestClass {

	public static void main(String[] args) {
		CarMall cm = new CarMall();
		
		// Getting a list of cars without using lambda.
		CarFilter cf = new CompanyFilter("Nissan");
		List<Car> carsByCompany = cm.showCars(cf);
		System.out.println(carsByCompany);
		
		cf = new PriceFilter(10000);
		carsByCompany = cm.showCars(cf);
		System.out.println(carsByCompany);
		
		System.out.println();

		// Using lambda
		carsByCompany = cm.showCars(c -> c.company.equals("Nissan"));
		System.out.println(carsByCompany);
		
		carsByCompany = cm.showCars(c -> c.price > 10000);
		System.out.println(carsByCompany);
	}
}

class Car {
	String company;
	int year;
	double price;
	String type;

	public Car(String c, int y, double p, String t) {
		this.company = c;
		this.year = y;
		this.price = p;
		this.type = t;
	}

	@Override
	public String toString() {
		return "(" + company + " " + year + ")";
	}
}

class CarMall {
	List<Car> cars = new ArrayList<Car>();

	public CarMall() {
		cars.add(new Car("Honda", 2012, 9000.0, "HATCH"));
		cars.add(new Car("Honda", 2018, 17000.0, "SEDAN"));
		cars.add(new Car("Toyota", 2014, 19000.0, "SUV"));
		cars.add(new Car("Ford", 2014, 13000.0, "SPORTS"));
		cars.add(new Car("Nissan", 2017, 8000.0, "SUV"));
	}

	List<Car> showCars(CarFilter cf) {

		ArrayList<Car> carsToShow = new ArrayList<Car>();

		for (Car c : cars) {
			if (cf.showCar(c)) {
				carsToShow.add(c);
			}
		}
		return carsToShow;
	}

}

interface CarFilter {
	boolean showCar(Car c);
}

class CompanyFilter implements CarFilter {
	private String company;

	public CompanyFilter(String c) {
		this.company = c;
	}

	@Override
	public boolean showCar(Car c) {
		return company.equals(c.company);
	}

}


class PriceFilter implements CarFilter {
	private double price;

	public PriceFilter(double p) {
		this.price = p;
	}

	@Override
	public boolean showCar(Car c) {
		return c.price > price;
	}

}