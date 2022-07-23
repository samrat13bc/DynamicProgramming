package com.bitwiseoperation;

// Number of bits required to change one number to other number
public class BitConversion {
	
	public int noOfBitsRequired(int a, int b) {
		int n = a^b;
		int count =0;
		while(n != 0) {
			n = n&(n-1);
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		BitConversion x = new BitConversion();
		int n =x.noOfBitsRequired(12, 3);
		System.out.println(n);
	}

}
