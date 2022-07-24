package com.mathematialoperation;

public class Factorial {
	
	public static int findFactorial(int n) {
		int fact = 1;
		if( n == 0 || n == 1) {
			fact = 1;
		}
		for(int i =2; i <=n ; i ++) {
			fact = fact * i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		System.out.println(findFactorial(3));
		System.out.println(findFactorial(5));
		System.out.println(findFactorial(1));
	}

}
