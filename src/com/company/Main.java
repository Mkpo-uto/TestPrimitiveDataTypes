package com.company;

public class Main {

    public static void main(String[] args) {
	int pounds = 1; double result;
	result = pounds * 0.45359237;
        System.out.println("Converted kilograms equals" + result);

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + " , and this is more";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString);

    }
}
