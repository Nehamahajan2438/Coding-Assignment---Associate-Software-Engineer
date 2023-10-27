package com.java_assignment;

import java.util.Scanner;

public class pangramCheck {
   
	public static void main(String[] args) {
		System.out.println("Enter the Sentence");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.next();
		
		boolean isPangram = isPangram(sentence);
		if(isPangram == true) {
			System.out.println("Sentence is Pangram");
		  }else {
			System.out.println("Sentence is not Pangram");
		}
	}
		   
	public static boolean isPangram(String str) {
		        
	     boolean[] alphabet = new boolean[26];
		 int index;

		 for (int i = 0; i < str.length(); i++) {
		     char ch = str.charAt(i);
		        if ('A' <= ch && ch <= 'Z') {
		            index = ch - 'A';
		        } else if ('a' <= ch && ch <= 'z') {
		            index = ch - 'a';
		            } else {
		              continue;
		         }
		     alphabet[index] = true;
		 }

		 for (boolean letter : alphabet) {
		     if (!letter) {
		         return false;
		     }
		   }
          return true;
	}
}
