package dev.joaopaulom.A;

import java.util.Scanner;

public class a{
	
	public static void main(String[] args){
		
		
		// ----------------------- Beecrowd 1019 ----------------------- //
		
		//Create the input object
		Scanner input = new Scanner(System.in);
		
		//Get the time (in seconds)
		int seconds = input.nextInt();
		
		//Get the minutes
		int minutes = ((seconds/60)>=1?(seconds/60):0);
		seconds		= (minutes!=0?(seconds%60):seconds);
		
		//Get the hours
		int hours = ((minutes/60)>=1?(minutes/60):0);
		minutes	  = (hours!=0?(minutes%60):minutes);
		
		//Display the result
		System.out.println(hours+":"+minutes+":"+seconds);
	}
}