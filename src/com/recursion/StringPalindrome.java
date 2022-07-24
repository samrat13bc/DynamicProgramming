package com.recursion;

// Check whether a string is palindrome or not 
public class StringPalindrome {

	public static boolean isPalindrome(String s, int l , int r) {
		
		if(l >=r) {
			return true;
		}
		
		if(s.charAt(l) != s.charAt(r)) {
			return false;
		}
		
		return isPalindrome(s, l +1, r-1);
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("aba", 0, 2));
		System.out.println(isPalindrome("abc", 0, 2));
	}
}
