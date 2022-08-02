package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class CountPairs {
	
	public static int countPairs(int arr[] , int n , int k ) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		for(int i = 0 ; i < n ; i ++) {
			
			int diff = k - arr[i];
			Integer val = map.getOrDefault(diff, 0);
			count += val;
			
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		int arr [] = {1,5,7,1};
		int n = arr.length;
		int k = 6;
		int ans = countPairs(arr, n , k);
		System.out.println(ans);
	}

}
