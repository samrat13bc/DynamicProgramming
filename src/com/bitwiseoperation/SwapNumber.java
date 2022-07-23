package com.bitwiseoperation;

public class SwapNumber {
	
	// Swapping a number using a third variable 
	
	public void swapNumber(int a , int b) {
		
		int temp;
		
		temp = a;
		a= b;
		b = temp;
		
		System.out.println("The first number after swapping:" + a);
		System.out.println("The second number after swapping: "+ b);
	}
	
	public void swapNumberUsingXor(int a , int b) {
		a = a^b;
		b = a^b;
		a= a^b;
		
		System.out.println("The first number after swapping:" + a);
		System.out.println("The second number after swapping: "+ b);
		
	}
	
	public static void main(String[] args) {
		SwapNumber x = new SwapNumber();
		x.swapNumberUsingXor(10, 5);
		x.swapNumber(10, 5);
	}
	

}
