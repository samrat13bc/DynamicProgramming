package com.sorting;

public class MergeSort {
	
	public static void mergeSort(int arr[]  , int l , int r) {
		
		if(l<r) {
			int mid = (l+r)/2;
			mergeSort(arr,l, mid);
			mergeSort(arr,mid+1,r);
			merge(arr, l, mid, r);
		}
	}
	
	public static void merge(int arr[] , int l ,int mid, int r) {
		int i = l ;
		int j = mid+1;
		int k = l;
		int b[] = new int[arr.length];
		while(i <= mid && j <=r) {
			if(arr[i]<arr[j]) {
				b[k] = arr[i];
				i++;
			}
			else {
				b[k] = arr[j];
				j++;
			}
			k++;
		}
		
		if(i > mid) {
			while(j <=r) {
				b[k] = arr[j];
				j++;
				k++;
				
			}
		}
		else {
			while(i<= mid) {
				b[k] = arr[i];
				i++;
				k++;
			}
		}
		
		for(k = l ; k <=r ; k ++) {
			arr[k] = b[k];
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {3, 4, 8, 6, 9, 1};
		int l = 0 ;
		int r = arr.length - 1;
		mergeSort(arr, l, r);
		for(int i = 0; i < arr.length ; i ++) {
			System.out.print(arr[i]+" ");
		}
	}

}
