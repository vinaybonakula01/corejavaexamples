package com.corejavaexamples;
import java.util.Scanner;
/*
 * program to print n prime numbers
 */

 class Primenumbers {
	public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
		System.out.println("enter n for n primenumbers");
		int n = scan.nextInt();
		System.out.println(n+" prime numbers");
		for(int number=1;number<=n;number++) {
			int j=0;
			for(int i=1;i<=number;i++) {
				if(number%i==0) {
					j= j+1;
				}
			}
			if(j==2) {
				System.out.println(number+" is prime number");
				
			}
			else {
				System.out.println(number+(" is not a primenumber"));
			}
			
		}
	}
	}
 }
    