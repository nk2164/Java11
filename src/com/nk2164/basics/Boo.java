package com.nk2164.basics;

class Boo {
	
	public static void main(String[] args) {
		NestedClass nc = new NestedClass();
		nc.printIt();
		
	}
	static class NestedClass {
		void printIt() {
			System.out.println("Hi From Nested class");
			abstract class InnerNestedClass {
				
			}
			
			@SuppressWarnings("unused")
			class OneMore extends InnerNestedClass {
				
			}
		}
	}

	static interface NestedInterface {
	}

	static enum NestedEnum {
	}
	
}
