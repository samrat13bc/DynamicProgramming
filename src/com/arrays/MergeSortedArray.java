package com.arrays;

public class MergeSortedArray {
	
	public static int[] mergeSortedArrays(int [] A, int [] B) {
		int n1 = A.length;
		int n2 = B.length;
		int C[] = new int[n1+n2];
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(j < n2 && i < n1) {
			if(A[i]< B[j]) {
				C[k] = A[i];
				i++;
			}
			else {
				C[k] = B[j];
				j++;
			}
			k++;
		}
		
		if(i > n1-1) {
			while(j< n2) {
				C[k] = B[j];
				j++;
				k++;
			}
		}
		else {
			while(i<n1) {
				C[k] = A[i];
				i++;
				k++;
			}
		}
		
		return C;
	}
	
	public static void main(String[] args) {
		int A[] = {1, 3, 4, 6, 8, 9};
		int B[] = {2,5,7,10};
		int n = A.length+B.length;
		int C[] = new int[n];
		C = mergeSortedArrays(A, B);
		for(int i = 0 ; i < n ; i ++) {
			System.out.print(C[i] + " ");
		}
		
	}

}
