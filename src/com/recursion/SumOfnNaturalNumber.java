package com.recursion;

public class SumOfnNaturalNumber {
	
	public static int sumOfNNaturalNumber(int n) {
		if(n == 1) {
			return 1;
		}
		
		return n + sumOfNNaturalNumber(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(sumOfNNaturalNumber(5));
	}

}
