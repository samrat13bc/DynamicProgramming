package com.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ElementsCommoninThreeArrays {
	
	public static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0 ; i < n1 ; i ++) {
        	if(map.containsKey(A[i])) {
        		
        		map.put(A[i], 1);
        	}
        	else {
        		map.put(A[i], 1);
        	}
        	
        }
        
        for(int j = 0 ; j < n2 ; j ++) {
        	if(map.containsKey(B[j])) {
        		
        		map.put(B[j], 2);
        	}
        	else {
        		map.put(B[j], 1);
        	}
        }
        
        for(int k = 0 ; k < n3 ; k ++) {
        	if(map.containsKey(C[k])) {
        		
        		map.put(C[k], 3);
        	}
        	else {
        		map.put(C[k], 1);
        	}
        }
        
        for(Map.Entry<Integer, Integer> set : map.entrySet()) {
        	
        	System.out.println(set.getValue());
        	if(set.getValue() == 3) {
        		list.add(set.getKey());
        	}
        }
        
        return list;
    }
	
	public static void main(String[] args) {
		int [] A = {1, 5, 10,20, 20, 40, 80};
		int n1 = A.length;
		int [] B = {6, 7, 20, 80, 100};
		int n2 = B.length;
		int [] C = {3, 4, 15, 20, 30, 70, 80, 120};
		int n3 = C.length;
		ArrayList<Integer> list = commonElements(A, B, C, n1, n2, n3);
		
		for(int i = 0; i < list.size(); i ++) {
			System.out.println(list.get(i));
		}
	}

}
