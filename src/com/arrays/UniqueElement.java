package com.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// All element is repeating twice find the element which is present a single time 
public class UniqueElement {
	public static void findUniqueElement(int arr[] , int n) {
		int count = 0;
		List<Integer> t1 = new ArrayList<Integer>();
		int t = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < n ; i++ ) {
			if(map.containsKey(arr[i])) {
				count = map.get(arr[i])+1;
				map.put(arr[i], count);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> set : map.entrySet()) {
			if(set.getValue() == 1) {
				t1.add(set.getKey());
				t = 1;
			}
			
		}
		
		if( t ==1) {
			for(int i = 0 ; i < t1.size(); i++) {
				System.out.println("The unique element is : "+ t1.get(i));
			}
		}
		else {
			System.out.println("No such element is there");
		}
		
	}
	
	public static void main(String[] args) {
		int arr[] = {2, 3, 2, 1, 3, 2, 3};
		int n = arr.length;
		findUniqueElement(arr,n);
	}
	

}
