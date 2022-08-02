package com.sorting;


// Selecting the minimum from the unsorted array and putting that in the sorted array 
public class SelectionSort {

	public static void selectionSort(int arr[], int n) {
		for(int i = 0 ; i < n-1 ; i ++) {
			int min = i;
			
			for (int j = i +1; j < n ; j ++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			
			if(min != i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 6, 9, 4, 8, 2, 3};
		int n = arr.length;
		selectionSort(arr, n);
		for(int i = 0 ; i < n ; i ++) {
			System.out.print(arr[i] + " ");
		}
	}
}
