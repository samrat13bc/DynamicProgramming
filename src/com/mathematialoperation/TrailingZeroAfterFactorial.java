package com.mathematialoperation;

// The number of zeros after a given number factorial
public class TrailingZeroAfterFactorial {
	
	public static int noOfZero(int n) {
		int noOfZeros = 0;
		for(int i =5 ; i <=n ; i*=5) {
			noOfZeros = noOfZeros + n / i;
		}
		
		return noOfZeros;
	}
	
	public static void main(String[] args) {
		System.out.println(noOfZero(12));
		System.out.println(noOfZero(30));
		System.out.println(noOfZero(127));
	}

}
