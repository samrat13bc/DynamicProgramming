package com.arrays;

//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//Find the maximum profit you can achieve. You may complete at most two transactions.
// Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).

public class BsetTimeToBuyandSellStock3 {
	 public static int maxProfit(int[] prices) {
		        int minSoFar = prices[0];
		        int maxSoFar = prices[prices.length - 1];
		        int profit1 = 0;
		        int profit2 = 0;
		        int dpl[] = new int[prices.length];
		        int dpm[] = new int[prices.length];
		        int max = 0;
		        for(int i = 1 ;i < prices.length; i ++){
		            
		            minSoFar = Math.min(prices[i], minSoFar);
		            profit1 = prices[i] - minSoFar;
		            dpl[i] = Math.max(dpl[i-1], profit1);
		        }
		        
		        for(int i = prices.length -2; i >=0 ; i--){
		            maxSoFar = Math.max(prices[i], maxSoFar);
		            profit2 = maxSoFar - prices[i];
		            dpm[i] = Math.max(dpm[i+1], profit2);
		        }
		        
		        for(int i = 0; i < prices.length; i ++){
		            max = Math.max(max, dpm[i] + dpl[i]);
		        }
		        return max;
	    }
	 
	 public static void main(String[] args) {
		int arr [] = {1, 2, 3, 4,5};
		System.out.println(maxProfit(arr));
	}

}
