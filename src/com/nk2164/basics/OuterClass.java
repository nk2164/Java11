package com.nk2164.basics;

public class OuterClass {

	  public static void main(String[] args){  
		// To access an inner class, first create a new object of outer class
		OuterClass x = new OuterClass();
		// Then create a new object of inner class using the outer class object reference
		OuterClass.InnerClass y = x.new InnerClass();
		System.out.println(y.returnMsg());

		// To access a static nested class ,first create a new object of the 
		// inner static nested class using the outer class reference
		// as shown below.
		OuterClass.StaticNestedClass z = new OuterClass.StaticNestedClass();
		System.out.println(z.returnMsg());

	  }

	  // Inner reference types 
	  
	  class InnerClass {
	    String text = "Hi from inner class";

	    String returnMsg() {
		return text;
	    }

	  }

	  static class StaticNestedClass {
	     String text = "Hi from Static nested class";		  
		String returnMsg() {
			return text;
		}
	  }


	}