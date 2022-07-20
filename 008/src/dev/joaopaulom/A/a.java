package dev.joaopaulom.A;

import java.util.Scanner;

public class a{
	
	public static void main(String[] args){
		
		// ------------------------ Instruções Condicionais ------------------------ //
		
		//Condição IF > ELSEIF > ELSE
		
		//Cria objeto de scanner
		Scanner input = new Scanner(System.in);
		
		/*
		//Pergunta idade ao usuário
		System.out.println("--------------- Voto ---------------");
		System.out.println("Digite a sua idade: ");
		int idade = input.nextInt();
		
		//Verifica idade
		if(idade > 18 && idade < 60)
		{
			//Apresenta resultado
			System.out.printf("Apto para voto, voto obrigatorio, pois possui %d anos de idade.", idade);
			
		} else if((idade > 16 && idade < 18) || (idade > 60)){
		
			//Apresenta resultado
			System.out.printf("Apto para voto, voto opicional, pois possui %d anos de idade.", idade);
			
		} else{
			
			//Apresenta resultado
			System.out.printf("Inapto para voto, pois possui %d anos de idade.", idade);
		} 
		
		System.out.println("\n");
		
		//Condição ternária
		System.out.println("Escolha uma opcao:\n1 - Masculino\n2 - Feminino");
		int sexo = input.nextInt();
		
		//Apresenta resultado
		String resultado = (sexo==1? "Masculino":"Feminino");
		System.out.println("O usuario escolheu o sexo "+resultado+".");
		*/
		
		//Condição SWITCH
		
		//Pede valor ao usuario
		System.out.println("Digite um numero inteiro: ");
		
		//Pega valor
		int numero = input.nextInt();
		
		//Verifica valor introduzido
		switch(numero)
		{
			case 1:
				System.out.println("Valor digitado: *UM*");
				break;
			case 2:
				System.out.println("Valor digitado: *DOIS*");
				break;
			case 3:
				System.out.println("Valor digitado: *TRES*");
				break;
			case 4:
				System.out.println("Valor digitado: *QUATRO*");
				break;
			case 5:
				System.out.println("Valor digitado: *CINCO*");
				break;
			default:
				System.out.println("Valor digitado irreconhecivel.");
		}
	}
}