package com.recursion;

// There is a m*n matrix we have to go from top left of a matrix to the bottom right then find the number of ways 
// We can traverse in right or bottom
public class NumberOfWays {
	
	public static int numberOfWays(int m , int n) {
		
		if(n == 1 || m == 1) {
			return 1;
		}
		
		return numberOfWays(m -1 , n) + numberOfWays(m , n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(numberOfWays(3, 4));
	}

}
