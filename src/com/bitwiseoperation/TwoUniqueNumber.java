package com.bitwiseoperation;

// Find the two non repeating elements in an array where every elements repeats twice
public class TwoUniqueNumber{
	
	public static void twoRepeatingNumber(int arr[], int n) {
		int res = 0;
		int a=0;
		int b =0;
		for(int i = 0; i < n ; i ++) {
			res = res^arr[i];
		}
		
		res = (res & -res);
		
		for(int j = 0; j < n; j ++) {
			
			if((arr[j] & res) > 0) {
				a = a^arr[j];
			}
			else {
				b = b^arr[j];
			}
		}
		
		System.out.println("The first unique number is :"+ a);
		System.out.println("The second unique number is :"+ b);
	}
	
	public static void main(String[] args) {
		int arr [] = {5, 4, 1, 4, 3, 5, 1, 2};
		int n = arr.length;
		twoRepeatingNumber(arr, n);
	}
}
