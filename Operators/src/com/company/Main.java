package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
	    System.out.println("1 + 2 = " + result);

	    int prevResult = result;

	    result = result - 1;


	    boolean isAlien = false;

	    if (isAlien==false)
            System.out.println(("It is not an alien"));

		boolean test = isAlien ? true : false;
		System.out.println(isAlien + "   " + test);


		double A, B, result1;
		A = 20;
		B = 80;

		result1 = (A + B) * 25;

		double rest = result1 % 40;

		if ( rest <= 20 )
			System.out.println("Total is over the limit");


    }
}
