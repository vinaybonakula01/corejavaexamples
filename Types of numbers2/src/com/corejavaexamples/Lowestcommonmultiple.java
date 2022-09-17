package com.corejavaexamples;

import java.util.Scanner;

public class Lowestcommonmultiple {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter x value");
		int x = scan.nextInt();
		System.out.println("enter y value");
		int y = scan.nextInt();
		System.out.println("enter z value");
		int z = scan.nextInt();
		int lcm =0;
		for (int a =1;a<=x*y*z;a++) {
			
			if(a%x==0&&a%y==0&&a%z==0) {
				lcm=a;
				break;
				
			}
			
		}
		
         System.out.println(lcm);
	}

}
