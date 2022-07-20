package dev.joaopaulom.A;

public class Circle
{
	//Definindo propriedade constante
	public static final double pival = 3.14;
	
	static double circleArea(double rval)
	{
		//Realiza cálculo
		double carea = pival * (rval*rval);
		return carea;
	}
}