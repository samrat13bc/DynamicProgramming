package com.bitwiseoperation;

public class OddandEvenNumber {
	
	// We are going to check the odd and even number by using the bitwise operation
	public void checkOddandEven(int n) {
		
		if((n & 1) == 0) {
			System.out.println("The number is even");
		}
		else {
			System.out.println("The number is odd");
		}
	}
	
	public static void main(String[] args) {
		
		OddandEvenNumber x = new OddandEvenNumber();
		x.checkOddandEven(13);
		x.checkOddandEven(4);
	}
	

}
