package com.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateElements {
	
	public static void findDuplicate(int arr[] , int n) {
		int count = 0;
		List<Integer> duplicate = new ArrayList<Integer>();
		int t = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < n ; i ++) {
			if(map.containsKey(arr[i])) {
				count = map.get(arr[i])+1;
				map.put(arr[i], count);
			}
			
			else {
				map.put(arr[i], 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> set : map.entrySet()) {
			if(set.getValue()>1) {
				duplicate.add(set.getKey());
				t = 1;
			}
			
		}
		
		if( t == 1) {
			for(int i=0; i <duplicate.size(); i++) {
				System.out.println("The duplicate elements are : "+ duplicate.get(i));
			}
		}
		else {
			System.out.println("No such elements are there");
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {12, 3, 4, 5, 6, 7, 12, 3, 9};
		int n = arr.length;
		findDuplicate(arr, n);
	}

}
