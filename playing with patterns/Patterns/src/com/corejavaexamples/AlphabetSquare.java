package com.corejavaexamples;

public class AlphabetSquare {

	public static void main(String[] args) {
		char v='a';
		for(char i=1;i<=5;i++) {
			for(char j=1;j<=5;j++) {
				System.out.print(" "+v+" ");
				v++;
			}
			System.out.println();
		}

	}

}
