package com.typesofnumbers;

import java.util.Scanner;

public class amsstrongnumber {

	public static void main(String[] args) {
		 try (Scanner scan = new Scanner(System.in)) {
			System.out.println("enter n for n armsstrong numbers");
			int n = scan.nextInt();
			System.out.println(n+" armsstrong numbers");
			for(int number=1;number<=n;number++) {
			int temp = number;
			int length=0;
			while(temp!=0) {
			
				length= length+1;
				temp=temp/10;
			}
			int temp2=number;
			int x=0;
			while(temp2!=0) {
				int cubeofdigit=1;
				int lastdigit = temp2%10;
				
				for(int i=1;i<=length;i++) 
				{
					cubeofdigit=cubeofdigit*lastdigit;
			    }
			x=x+cubeofdigit;
			temp2=temp2/10;
			}
			if(number==x) {
			    System.out.println(number+" number is armsstrong");
			}
			else {
			    System.out.println(number+" number is not an armsstrong number");
			}
			}
		    }
			
		  }
	      }
        
