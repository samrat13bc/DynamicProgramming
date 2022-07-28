package com.arrays;

//We can find the maximum sub array which is having the maximum sum by using this algorithm.
public class KadienAlgorithm {
	
	public static int kadienAlgorithm(int arr[]) {
		int maxSum = 0;
		int currSum = 0;
		
		for (int i = 0 ; i< arr.length; i ++) {
			currSum += arr[i];
			if(currSum > maxSum) {
				maxSum = currSum;
			}
			
			if(currSum< 0) {
				currSum = 0;
			}
		}
		
		return maxSum;

	}
	
	public static void main(String[] args) {
		int arr[] = {-5, 4, 6, -3, 4, -1};
		int num = kadienAlgorithm(arr);
		System.out.println(num);
	}
}
