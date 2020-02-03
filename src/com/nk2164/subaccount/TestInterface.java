package com.nk2164.subaccount;

public interface TestInterface {

	public static final int COUNT = 0;
	
	public void aMethod();
	
	//private methods are ok as long as they are not abstract.
	private void bMethod() {
	}
	
	/* c method is declared private and is not allowed. You will get the following.
	 * Illegal modifier for the interface method cMethod;
	 only public, private, abstract, default, static and strictfp are permitted */
	
    //protected void cMethod();
	
	//* static method needs an implementation.
	static void dMethod() {
	}
	
	//* default method needs implementation.
	default void eMethod() {
	}
}
