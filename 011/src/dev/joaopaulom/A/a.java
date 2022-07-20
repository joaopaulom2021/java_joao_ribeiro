package dev.joaopaulom.A;

public class a{
	
	public static void main(String[] args){
		
		// --------------------- Público x Estático ----------------------- //
		
		//Chamando método estático
		Classes.apresentar2();
		
		//Instanciando objeto Classes
		Classes classe = new Classes();
		
		//Cria parâmetros
		String empresa  = "47";
		String nome		= "Joao Paulo";
		String email	= "joaopaulomsilva2021@gmail.com";
		
		//Chamando método setter
		classe.setProperty(empresa, nome, email);
		
		//Chamando método público
		classe.apresentar();
		
		/* 
		System.out.println("A="+Classes.circleArea(123.3));
		System.out.println(Classes.returnString("Joao Paulo"));
		System.out.println(Classes.returnString("Joao Paulo", "Moreira"));
		 */
		 
		/*
		 *Obs: ambos método e propriedades
		 *precisam ser estáticos
		*/
		System.out.println("A="+Circle.circleArea(123.3));
	}
}