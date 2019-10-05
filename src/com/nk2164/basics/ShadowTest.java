package com.nk2164.basics;

public class ShadowTest {

	// You have a class member x declared here.
    public int x = 0;

    // Here is an inner class FirstLevel
    class FirstLevel {

    	// You define another variable X inside the inner class
        public int x = 1;

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
        }
    }

    public static void main(String... args) {
        ShadowTest st = new ShadowTest();
        ShadowTest.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
    }
}
