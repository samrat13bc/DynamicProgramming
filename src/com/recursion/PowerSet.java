package com.recursion;

// Find the number of subset that can be formed with a given string 
public class PowerSet {
	
	public static void powerSet(String s, int i , String curr) {
		if(i == s.length()) {
			System.out.println(curr);
			return ;
		}
		powerSet(s, i +1, curr + s.charAt(i));
		powerSet(s, i+1, curr);
	}
	
	public static void main(String[] args) {
		powerSet("abc", 0, " ");
	}

}
