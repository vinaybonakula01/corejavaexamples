package com.corejavaexamples;

public class Diamond {
	
	public static void main(String args[])
	{
		int star = 1;
		int space =4;;
	for (int i=1;i<=9 ;i++ )
	{
		
		for (int b=1;b<=space ;b++ )
		{
			System.out.print("   ");
		}
		for (int a=1;a<=star ;a++ )
		{
			System.out.print(" * ");
		}
	
	System.out.println();

if (i<=4)
{
	star=star+2;
	space--;
}
else 
{
	star=star-2;
	space++;
}
}
}

}
	


