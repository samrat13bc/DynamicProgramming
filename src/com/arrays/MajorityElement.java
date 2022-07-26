package com.arrays;

import java.util.Arrays;
import java.util.HashMap;

// There is an array find the element which is present more than N/2 where N is the size of array

public class MajorityElement {
	
	// Brutt Force Approach Traverese the array and compare the element one by one and check its no of Presence 
	// Here in this solution the time complexity is O(n^2) and space complexity is O(1)
	public static void majorityElement(int arr[], int n) {
		
		int maxCount = 0;
		int index = -1;
		
		for(int i = 0; i < n ; i ++) {
			int count = 0;
			for(int j = 0 ; j <n ; j++) {
				if(arr[i] == arr[j] ) {
					count++;
				}
				
			}
			
			if(maxCount < count) {
				maxCount = count;
				index = i;
			}
		}
		
		if(maxCount>n/2) {
			System.out.println("The element which is in majority is:"+ arr[index]);
		}
		else {
			System.out.println("No such element is there");
		}
	}
	
	
	// We can sort the array and then reduce its time complexity to O(n) 
	// The time complexity is O(n*Logn) and space complexity is O(1) 
	public static void sortMajorityElement(int arr[] , int n) {
		
		Arrays.sort(arr);
		int temp = arr[0];
		int maxCount = 0;
		int count = 0;
		int ele = 0;
		for(int i = 0 ; i < n ; i ++) {
			if(temp== arr[i]) {
				count ++;
			}
			else {
				count = 1;
				temp = arr[i];
			}
			
			if(count > maxCount) {
				maxCount = count;
				ele = arr[i];
			}
		}
		if(maxCount > n/2) {
			System.out.println("The majority element is: "+ ele);
		}
		else {
			System.out.println("No such element is there");
		}
	}
	
	// We can reduce the time complexity more by using a space complexity by using the HashMap
	// Time Complexity will be O(n) and Space Complexity will be O(n)
	
	public static void hashMajorityElement(int arr[] , int n) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		for(int i = 0; i < n ; i++) {
			if(map.containsKey(arr[i])) {
				count = map.get(arr[i]) +1;
				if(count > n/2) {
					System.out.println("The majority element is present : "+ arr[i]);
					return;
				}
				else {
					map.put(arr[i], count);
				}
			}
			else {
				map.put(arr[i], 1);
			}
		}
		System.out.println("No such element is there");
		
	}
	
	
	// We can reduce the space complexity to O(1) by using Moore Voting Algorithm
	
	public static void mooreVoting(int arr[] , int n) {
		int count =0;
		int index = 0;
		
		for(int i =0; i < n ; i ++) {
			if(arr[index] == arr[i]) {
				count++;
			}
			else {
				count --;
			}
			
			if(count ==0) {
				count = 1;
				index = i;
			}
		}
		int c =0;
		for(int j = 0 ; j < n ; j ++) {
			
			if(arr[j] == arr[index]) {
				c++;
			}
		}
		
		if(c> n/2) {
			System.out.println("The element in majority is : "+ arr[index]);
		}
		else {
			System.out.println(" No such element is there");
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 1, 1};
		int n = arr.length;
		majorityElement(arr, n);
		sortMajorityElement(arr, n);
		hashMajorityElement(arr, n);
		mooreVoting(arr, n);
	}

}
