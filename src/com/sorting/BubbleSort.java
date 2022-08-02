package com.sorting;

// Here we will start from initial element and will check that is that greater than we will swap and similarly we will go ahead 
public class BubbleSort {
	
	public static void bubbleSort(int arr[] , int n) {
		for(int i = 0 ; i < n -1 ; i ++) {
			
			for(int j = 0 ; j < n - i -1 ; j ++) {
				
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		int arr[] = {2, 5, 9, 1, 3, 4,6};
		int n = arr.length;
		bubbleSort(arr,n);
		for(int i = 0 ; i < n ; i ++) {
			System.out.print(arr[i] + " ");
		}
	}

}
