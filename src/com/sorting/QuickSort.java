package com.sorting;

public class QuickSort {
	
	public static void quickSort(int arr[], int l , int h) {
		if(l < h) {
			int pivot = partioning(arr, l, h);
			quickSort(arr, l, pivot-1);
			quickSort(arr, pivot+1, h);
		}
	}
	
	public static int partioning(int arr[] , int l , int h) {
		int pivot = arr[l];
		int i = l;
		int j = h;
		
		while(i < j) {
			while(arr[i] <= pivot && i <= h-1) {
				i++;
			}
			while(arr[j] > pivot && j >=l) {
				j--;
			}
			
			if(i< j) {
				swap(arr,i,j);
			}
		}
		swap(arr, j, l);
		return j;
	}
	
	public static void swap(int arr[] , int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 7, 8, 2, 4, 5, 3, 6, 9};
		int n = arr.length;
		quickSort(arr, 0, n-1);
		for(int i = 0 ; i < n ; i ++) {
			System.out.print(arr[i] + " ");
		}
				
	}

}
