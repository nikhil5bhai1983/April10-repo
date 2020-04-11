package com.nikhil.grp;

public class Palindrome {
	public static void main(String[] args) {
		String myString = "nihin";
		
		String reverse = "";
		
		for (int i=myString.length()-1; i>=0; i--) {
			reverse = reverse + myString.charAt(i);
			
		}
		System.out.println(reverse);
		
		if (myString.equals(reverse)) {
			System.out.println("Given string is palindrome");
		}
		else System.out.println("Given string isnt palindrome");
		
	}

}
