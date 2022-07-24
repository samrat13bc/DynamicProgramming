package com.mathematialoperation;

public class PalindromeNumber {
	
	public static void checkPalindrome(int n) {
		
		int sum =0; 
		int temp1 = n;
		while(n > 0) {
			int temp = n%10;
			sum = sum * 10 + temp;
			n = n/10;
		}
		
		if(temp1 == sum) {
			System.out.println("The given number is a plaindrome");
		}
		else {
			System.out.println("The given number is not a palindrome");
		}
	}
	
	public static void main(String[] args) {
		
		checkPalindrome(565);
		checkPalindrome(123);
	}

}
