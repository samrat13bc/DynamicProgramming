package com.arrays;

import java.util.ArrayList;

// Printing the contiguous array having maximum sum 
public class KadiensAdvance {
	
	public static ArrayList<Integer> kadien(int arr[] , int n){
		
		ArrayList<Integer> subArray = new ArrayList<Integer>();
		int currSum = 0;
		int maxSum = 0;
		for(int i = 0 ; i < n ; i ++) {
			currSum += arr[i];
			if( currSum > maxSum) {
				maxSum = currSum;
				subArray.add(arr[i]);
			}
			
			if(currSum<0) {
				currSum = 0;
				subArray.clear();
			}
		}
		
		return subArray;
	}
	
	public static void main(String[] args) {
		int arr[] = {-5, 4, 6, -3, 4, -1};
		int n = arr.length;
		ArrayList<Integer> list= kadien(arr, n);
		System.out.println(list);
	}

}
