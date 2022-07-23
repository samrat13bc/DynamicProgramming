package com.bitwiseoperation;
// Find the unique number in an array when all  numbers are repeating thrice and one number is unique
public class UniqueNumberRepeatingThrice {
	
	public static int uniqueNumber(int arr[], int n) {
		int ones = 0;
		int twos = 0;
		int not_threes;
		int x;
		for(int i =0; i< n; i++) {
			x = arr[i];
			
			twos = twos | (ones & x);
			ones = ones ^ x;
			not_threes = ~(ones & twos);
			ones &= not_threes;
			twos &= not_threes;
		}
		return ones;
	}
	
	public static void main(String[] args) {
		int arr[] = {2, 2, 1, 5, 1, 1, 2};
		int n = arr.length;
		int x = uniqueNumber(arr, n);
		System.out.println(x);
	}

}
