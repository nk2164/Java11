package com.nk2164.java.syntax;

public class Main {

	public static void main(String[] args) {
		
//		int i = 1;
//		int j;
//		j = 2;
//		
//		byte b = 126;
//		
//		long l = 100L;
//		long l2 = 9000000000L;
//		
//		double d = 123.4;
//		float f = 1.2f;
		
//		int i1 = 100;
//		int i2 = 51;
//		
//		double d1 = i1;
//		double d2 = i2;
//		
//		System.out.println(i1 + i2);
//		System.out.println(i1 * i2);
//		System.out.println(i1 - i2);
//		System.out.println((double)i1 /(double)i2);
//		System.out.println((double)(i1 /i2));
//		
//		i1++;
//		System.out.println(--i1);
//		System.out.println(--i1);
//		
//		int i3 = 100;
//		int i4 = 7;
//		
//		int i5 = i3%i4;
//		System.out.println(i5);
		
//		int i1 = 100;
//		int i2 = 51;
//		
//		i1*=5;
//		
//		System.out.println(i1);
//		
//		boolean b = true;
//		char c = 'M';
//		System.out.println(c);
//		System.out.println(b);
		
//		int[] j = {1,2,3,4,5};
//		System.out.println(j[0]);
//		
//		char[] myName = {'M','a','t','t'};
//		System.out.println(myName);

//		int[] j = {11,22,33,44,55};
//		
//		for (int count = 0; count < j.length; count++) {
//			System.out.println(j[count]);
//		}
		int[] myArray = {11,14,15,75,23,75,43,23,53,94};
		
		int numberUsed=0;
		int total = 0;
		
		int i = 0;
		while(total < 100)
		{
			total += myArray[numberUsed];
			numberUsed++;
		}
		
		System.out.println("Total : " + total);
		System.out.println("numberUsed : " + numberUsed );
	}

}
