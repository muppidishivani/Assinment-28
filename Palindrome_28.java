package com.web.java;

import java.util.Scanner;

public class Palindrome_28 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	       
	        boolean isPalindrome = true;
	        int length = input.length();

	        for (int i = 0; i < length / 2; i++) {
	            if (input.charAt(i) != input.charAt(length - i - 1)) {
	                isPalindrome = false;
	                break;
	            }
	        }

	       
	        if (isPalindrome) {
	        	System.out.println(isPalindrome);
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }

	        scanner.close();
	    }

	}


