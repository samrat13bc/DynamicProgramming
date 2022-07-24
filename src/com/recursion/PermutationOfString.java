package com.recursion;

// Find all the permutation of the string that can be formed with a given string 
public class PermutationOfString {
	
	public static void permuation(String s, int l , int r) {
		
		if(l == r) {
			System.out.println(s);
			return;
		}
		
		for( int i = 0; i <= r; i++) {
			s = swap(s, l, i);
			permuation(s, l+1, r);
			s = swap(s, l, i);
		}
	}
	
	public static String swap(String s, int i , int j) {
		char temp;
		char[] charArray = s.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		
		return String.valueOf(charArray);
		
	}
	
	public static void main(String[] args) {
		permuation("abc", 0, 2);
	}

}
