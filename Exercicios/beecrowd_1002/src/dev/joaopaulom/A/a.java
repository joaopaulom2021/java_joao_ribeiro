package dev.joaopaulom.A;

import java.util.Scanner;
import java.text.DecimalFormat;

public class a{
	
	public static void main(String[] args){
		
		// ----------------------------- Beecrowd 1002 - Area of a Circle ----------------------------- //
		
		//Define the pi value
		double pival = 3.14159;
		
		//Create the input object
		Scanner input = new Scanner(System.in);
		
		//Get the radius value
		double rval = input.nextFloat();
		
		//Calculate the circle area
		double carea = pival * (rval*rval);
		
		//Create the numFormat object
		DecimalFormat numFormat = new DecimalFormat(".0000");
		
		//Display the result
		System.out.println("A="+numFormat.format(carea));
	}
}  