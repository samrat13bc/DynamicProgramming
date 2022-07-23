package com.bitwiseoperation;
// Find the only non repeating number in an array where every number repeats twice
public class SingleUniqueNumber {
	
	public static void uniqueNumber(int arr[], int n) {
		int res =0;
		for(int i = 0; i < n; i ++) {
			res = res ^ arr[i];
		}
		
		System.out.println(" The unique number in the array is :"+ res);
	}
	
	public static void main(String[] args) {
		int arr[] = {12, 3, 12, 6, 6, 8, 10, 10, 8};
		int n = arr.length;
		uniqueNumber(arr, n);
	}

}
