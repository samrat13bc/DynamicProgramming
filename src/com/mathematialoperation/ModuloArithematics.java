package com.mathematialoperation;
// a^b = (a^2)^b/2 if b is even 
// a^b = (a*a^b-1) if b is odd

// Modulo Arithmetic 
// (a+b) %n = (a%n + b%n)%n
// (a*b)%n = (a%n * b%n)%n
public class ModuloArithematics {
	
	public static int powerFinding(int a , int b) {
		
		int res = 1;
		
		while(b > 0) {
			if((b &1) !=0) {
				res = res*a;
			}
			a = a*a;
			b = b >> 1;
		}
		
		return res;
	}
	
	// here n will be in terms of 10 ^ 9 + 7 and we have to give our answer in terms of that 
	public static long fastPower(long a, long b, int n) {
		long res = 1L;
		while(b > 0) {
			if((b&1) != 0) {
				res = (res%n * a %n )%n;
			}
			a = (a%n * a%n )%n;
			b = b >>1;
		}
		return res;
		
	}
	
	public static void main(String[] args) {
		System.out.println(powerFinding( 2 , 3));
		System.out.println(fastPower(3978432, 5, 1000000007));
	}
	
	

}
