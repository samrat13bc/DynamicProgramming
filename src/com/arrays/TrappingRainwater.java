package com.arrays;

// There are multiple 2D block of building given in an array calculate the total height of water that can be stored 

public class TrappingRainwater {
	
	public static int calculateRainwater(int arr[], int n ) {
		int right[] = new int [n];
		int left [] = new int [n];
		
		int ans = 0;
		left[0] = arr[0];
		for(int i = 1 ; i < n ; i ++) {
			left [i] = Math.max(left[i-1], arr[i]);
		}
		right[n-1] = arr[n-1];
		for(int i = n - 2 ; i >=0 ; i --) {
			right[i] = Math.max(arr[i], right[i+1]);
		}
		for(int i = 0 ; i < n ; i ++) {
			ans += (Math.min(left[i], right[i]) - arr[i]);
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		int arr[] = {3,1,2,4, 0,1,3,2};
		int n = arr.length;
		int ans = calculateRainwater(arr, n);
		System.out.println(ans);
	}

}
