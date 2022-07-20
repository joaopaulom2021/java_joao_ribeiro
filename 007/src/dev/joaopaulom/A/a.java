package dev.joaopaulom.A;

public class a{
	
	// ------------ Variáveis ------------ //

	public static void main(String[] args){
		
		//Variáveis numéricas
		byte 	valA  = 100;			//Valores pequenos
		short 	valB  = 12000;			//Valores razoaveis
		int 	valC  = 1999999;		//Valores enormes
		long 	valD  = 1999999999L; 	//Valores astronômicos, obs: necessário pôr-se o "L" ao final
		float	valE  = 12.6f;			//Valores decimais, obs: necessário pôr-se o "f" ao final
		double  valF  = 134.23D;		//Sinônimo de float
		
		//Variável booleana
		boolean param = false;
		
		//String
		String recip = "none";
		
		//Outras variáveis
		char uniq = '!';		//Armazena um único caracter qualquer
		
		// ------------ Operadores ------------ //
		
		int  recipA = 1200;
		int  recipB = 500;
		char symbol = '/';
		
		int sum 	 = recipA + recipB;		//Adição
		int sub 	 = recipA - recipB;		//Subtração
		int mul 	 = recipA * recipB;		//Multiplicação
		int div 	 = recipA / recipB;		//Divisão
		int resto 	 = recipA % recipB;		//Resto da divisão
		System.out.printf("O resultado de "+recipA+" "+symbol+" "+recipB+" e igual a "+div+" | resto->"+resto);
	}
}