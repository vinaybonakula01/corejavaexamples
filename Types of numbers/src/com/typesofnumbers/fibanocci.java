package com.typesofnumbers;

import java.util.Scanner;

public class fibanocci {
 public static void main(String[]args) {
	 try (Scanner scan = new Scanner(System.in)) {
		System.out.println("enter n for n fibonocci numbers ");
		 int n = scan.nextInt();
		 System.out.println(n+" fibonocci nnumbers");
		 int a=0;
		 int b=1;
		 int sum=0;
		 
		 for(int i=1;i<=n;i++) {
			 System.out.println(sum);
			 a=b;
			 b=sum;
			 sum=a+b;
		 }
	}
	 
 }
}
