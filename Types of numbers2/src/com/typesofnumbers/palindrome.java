package com.typesofnumbers;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
		System.out.println("enter n for n pallindrome numbers");
		int n = scan.nextInt();
		System.out.println(n+" pallindrome numbers");
		for(int i =1;i<=n;i++) {
			int reverse= 0;
			int lastdigit=0;
			int temp=i;
		while(temp!=0) {
			lastdigit=temp%10;
			reverse =( reverse*10)+lastdigit;
			temp=temp/10;
		}
		if (i==reverse) {
			System.out.println(i);
		}
		}
	}
	}
	}
