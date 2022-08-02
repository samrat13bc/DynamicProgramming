package com.arrays;

public class MinimizeTheHeights {
	
	static int getMinDiff(int[] arr, int n, int k) {
        // code here
        int ans[] = new int[n];
        int count =0;
        for(int i = 0 ; i < n ; i++){
           if(arr[i] < k){
               ans[count] = arr[i] +k;
               count ++;
           }
           else{
               ans[count] = arr[i] - k;
               count ++;
           }
        }
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n ; i ++){
        	
           System.out.print(ans[i] + " ");
           min= Math.min(ans[i], min);
           max= Math.max(ans[i], max);
        }
        
        return max - min;
    }
	
	public static void main(String[] args) {
		int arr[] = {2, 6 ,3 ,4, 7 ,2 ,10, 3, 2 ,1};
		int n = arr.length; 
		int k = 5;
		getMinDiff(arr,n,k );
	}

}
