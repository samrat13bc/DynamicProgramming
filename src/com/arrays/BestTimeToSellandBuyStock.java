package com.arrays;


// Find the max profit which can be earned by buying and selling a stock 
public class BestTimeToSellandBuyStock {
	
	// Trying brutte force approach
	
	public static int maxProfit(int arr[] , int start, int end) {
		if(start >= end) {
			return 0;
		}
		
		int profit = 0;
		
		for(int i = start ; i < end; i ++) {
			
			for(int j = i +1; j < end; j++) {
				
				if(arr[j] > arr[i]) {
					
					int curr_Profit = arr[j] - arr[i] + maxProfit(arr, start, i -1)+maxProfit(arr, j+1, end);
					profit = Math.max(curr_Profit, profit);
				}
			}
		}
		
		return profit;
	}
	
	// Trying to solve in O(n) time Complexity and O(1) space complexity 
	
	public static int maxProfits(int arr[]) {
		
		int min_Sofar = Integer.MAX_VALUE;
		int max_Profit = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < arr.length; i ++) {
			min_Sofar = Math.min(arr[i], min_Sofar);
			int profit = arr[i] - min_Sofar;
			max_Profit = Math.max(max_Profit, profit);
		}
		
		return max_Profit;
	}
	
	public static void main(String[] args) {
		int arr [] = {3, 1, 4, 8, 7, 2, 5};
		int n = maxProfit(arr, 0, 6);
		int m = maxProfits(arr);
		System.out.println(n);
		System.out.println(m);
	}

}
