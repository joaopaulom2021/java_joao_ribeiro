package dev.joaopaulom.A;

public class Humano{
	
	//Define propriedades
	public String nome;
	public int idade;
	private String sexo;
	
	//Define métodos
	public void ApresentaInfo(){
		
		//Apresenta informações
		System.out.println("O nome do usuario e "+nome+", ele possui "+idade+" anos e identifica-se com o sexo "+sexo+".");
	}
	
	public void DefineSexo(String recip){
		
		//Atribui valor do sexo
		sexo = recip;
	}
}