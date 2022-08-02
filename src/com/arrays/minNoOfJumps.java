package com.arrays;

public class minNoOfJumps {
	
	static int minJumps(int[] arr){
        // your code here
        int minNoOfJumps = 0;
        int n = arr.length;
        for(int i = 0 ; i < n ; i += arr[i]){
            if(arr[i] >= n - i ){
               minNoOfJumps+= 1;
            }      
            System.out.print(i + " ");
            minNoOfJumps++;
        }
        
        return minNoOfJumps;
    }
	
	public static void main(String[] args) {
		int arr [] = {2,3, 1, 1, 2, 4, 2, 0, 1, 1};
		int n = minJumps(arr);
		System.out.println(n);
	}

}
