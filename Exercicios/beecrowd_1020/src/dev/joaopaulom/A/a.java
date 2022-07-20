package dev.joaopaulom.A;

import java.util.Scanner;

public class a{
	
	public static void main(String[] args){
		
		// --------------------- Beecrowd 1020 --------------------- //
		
		//Create the input object
		Scanner input = new Scanner(System.in);
		
		//Get the user age
		int age = input.nextInt();
		
		//Calculate the user years
		int years = (int) (age/365);
		
		//Get the remminder
		int remminder = (int) (age%365);
		
		//Verify the ammount of days
		if(remminder >= 30)
		{
			//Calculate the user months
			int months = (int) (remminder/30);
			
			//Calculate user days
			int days = (int) (remminder%30);
			
			//Display the result
			System.out.println(years+" year(s)\n"+months+" month(s)\n"+days+" day(s)");
			
		} else{
			
			int months = 0;
			int days   = remminder;
			
			//Display the result
			System.out.println(years+" year(s)\n"+months+" month(s)\n"+days+" day(s)");
		}
	}
}