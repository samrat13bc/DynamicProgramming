package com.recursion;

public class NameUsingRecursion {
	
	public static void printName(int n) {
		if( n == 0) {
			return ;
		}
		
		System.out.println("Samrat");
		
		printName(n -1);
	}
	
	public static void main(String[] args) {
		printName(5);
	}

}
