package com.mathematialoperation;

import java.util.Arrays;

// How to check in a given range the number of prime number present 

public class SieveOfErathosthenes {
	
	public static boolean[] sieveOfErathosthenes(int n) {
		boolean isPrime[] = new boolean[n+1];
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;
		for(int i = 2; i*i <= n ; i ++) {
			for(int j = 2*i; j<= n ; j +=i) {
				isPrime[j] = false;
			}
		}
		return isPrime;
	}
	
	public static void main(String[] args) {
		boolean arrays[] = sieveOfErathosthenes(7);
		for(int i = 0 ; i <= 7 ; i ++) {
			if( arrays[i] == true) {
				System.out.println( i + " "+ "is a prime number");
			}
			else {
				System.out.println( i + " "+ "is not a prime number");
			}
		}
	}

}
