package com.arrays;

// W can do any number of transaction and we have to find the maximum profit which we can make 

public class BestTimeToSellBuyAndStock2 {
	
	public static int maxProfit(int arr[]) {
		int profit = 0;
		for(int i = 1; i < arr.length; i ++) {
			if(arr[i]> arr[i-1]) {
				profit += (arr[i] - arr[i-1]);
			}
		}
		return profit;
	}
	
	public static void main(String[] args) {
		int arr[] = {5, 2, 6, 4, 1, 7, 2, 1};
		int n = maxProfit(arr);
		System.out.println(n);
	}

}
