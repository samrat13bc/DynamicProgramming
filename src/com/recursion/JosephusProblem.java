package com.recursion;
//There are n number of friend and they start killing each other to the next 3rd guy and passing the gun 
// to the next guy whom he killed. They are sitting in circular. Find the guy who left at last. 
public class JosephusProblem {
	
	public static int jos(int n , int k) {
		
		if(n ==1 ) {
			return 0;
		}
		
		return (jos(n -1, k)+k)%n;
	}
	
	public static void main(String[] args) {
		System.out.println(jos(5,3));
	}

}
