package dev.joaopaulom.A;

public class a{
	
	public static void main(String[] args){
		
		// ---------------- Commentários ---------------- //
		
		//Comentário de linha única
		/*  
		Comentário que
		Compreende mútiplos
		Espaços de Linha
		*/
		
		// ---------------- Objetos ---------------- //
		
		//Cria objetos
		Humano recipA    = new Humano();
		Automovel recipB = new Automovel();
		
		recipA.nome  = "Joao Paulo";
		recipA.idade = 19;
		//recipA.sexo  = "Masculino";
		recipA.DefineSexo("Fusca");
		
		recipB.marca  = "Wolkswagen";
		recipB.modelo = "Gol";
		recipB.placa  = "QLB-0648";
		
		//Apresenta informações
		recipA.ApresentaInfo();
		recipB.ApresentaInfo();
	}
}