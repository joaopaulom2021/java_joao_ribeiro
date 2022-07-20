package dev.joaopaulom.A;

import java.util.Scanner;

public class a{
	
	// ---------------- Cálculos ---------------- //
	
	public static void main(String[] args){
		
		//Define variáveis
		int valA;
		int valB;
		int sumAB;
		
		//Cria objeto de inserção
		Scanner input = new Scanner(System.in);
		
		//Pede inserção dos valores
		System.out.println("--------------- Soma ---------------");
		System.out.println("Digite o valor A: ");
		valA = input.nextInt();
		
		System.out.println("Digite o valor B: ");
		valB = input.nextInt();
		
		//Calculo resultado
		sumAB = valA + valB;
		
		//Apresenta Resultado
		System.out.printf("Resultado da soma do valor %d + %d e igual a %d", valA, valB, sumAB);
	}
}