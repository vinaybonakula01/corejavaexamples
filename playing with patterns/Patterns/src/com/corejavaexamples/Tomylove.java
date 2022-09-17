package com.corejavaexamples;

public class Tomylove {
public static void main(String[] args) {
for(int x=1;x<=50;x++) {
	for(int y=1;y<=51;y++) {
	 if((x==2&&(y==25||y==26||y==27||y==24||y==23
			 ||y==22||y==28||y==21||y==29))
		     ||((y==25&&(x==2||x==3||x==4||x==5)))
		     ||(x==6&&(y==25||y==26||y==27||y==24||y==23||
		     y==22||y==28||y==21||y==29))||(x==10&&(y==22||y==28
		    ))||
	         (x==9&&(y==21||y==25||y==29))||
	         (x==8&&(y==22||y==28||y==23||y==27))
	         ||(x==11&&(y==24||y==26))||
	         (x==12&&y==25)||
	         (y==22&&(x==14||x==15||x==16||x==17))||(x==17&&(y==23||y==24||y==25
	         ||y==26||y==27))||y==28&&(x==14||x==15||x==16||x==17)){
		System.out.print("*");
	 }
	 else {
		System.out.print(" ");
	 }		     
					
	}
		System.out.println();
}

	}
    }




