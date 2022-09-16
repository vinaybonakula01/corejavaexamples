package com.typesofnumbers;
import java.util.Scanner;
/*
 * program to print n Strong numbers
 */
public class Strongnumbers { 

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("enter n for n Strong numbers");
			int n=scan.nextInt();
			System.out.println(n+" strong numbers");
			for(int i=1;i<=n;i++) {
			 int t1 = i;
			 int lastdigit,sum=0;
			 while(t1!=0) {
				 int factorial=1;
				lastdigit= t1%10;
				for(int j=1;j<=lastdigit;j++) {
					factorial=factorial*j;//factorial of digitSSS
				}
				sum=sum+factorial;
				t1=t1/10;
			 }
			
			 
			 if(i==sum) {
				 System.out.println(i);
				 
			 }
			 else {
				 System.out.println(i+" is not a Strong number");
			 }
			 }
}
	}
}
			 


		



