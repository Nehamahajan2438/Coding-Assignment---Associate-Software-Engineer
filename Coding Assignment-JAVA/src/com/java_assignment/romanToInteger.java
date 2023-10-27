package com.java_assignment;

import java.util.Scanner;

public class romanToInteger {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a Roman numeral: ");
	        String romanNumeral = scanner.nextLine();

	        int result = convertRomanToInteger(romanNumeral.toUpperCase());
	        System.out.println("The integer value is: " + result);
	    }

	    public static int convertRomanToInteger(String romanNumeral) {
	        int result = 0;

	        for (int i = 0; i < romanNumeral.length(); i++) {
	            char currentChar = romanNumeral.charAt(i);
	            int currentValue = getRomanValue(currentChar);

	            if (i + 1 < romanNumeral.length()) {
	                char nextChar = romanNumeral.charAt(i + 1);
	                int nextValue = getRomanValue(nextChar);

	                if (currentValue < nextValue) {
	                    result -= currentValue;
	                } else {
	                    result += currentValue;
	                }
	            } else {
	                result += currentValue;
	            }
	        }

	        return result;
	    }

	    public static int getRomanValue(char romanChar) {
	        switch (romanChar) {
	            case 'I':
	                return 1;
	            case 'V':
	                return 5;
	            case 'X':
	                return 10;
	            case 'L':
	                return 50;
	            case 'C':
	                return 100;
	            case 'D':
	                return 500;
	            case 'M':
	                return 1000;
	            default:
	                throw new IllegalArgumentException("Invalid Roman numeral character: " + romanChar);
	        }
	    }
}
		
		