package dev.joaopaulom.A;

public class a{
	
	public static void main(String[] args){
		
		// ----------------- Ciclos ----------------- //
		
		//Ciclo while
		System.out.println("----------------- While -----------------");
		int i = 0;
		while(i < 100)
		{
			//Verifica valor de i
			if(i == 10){ break; }		//Obs: os valores acima de dez serão ignorados
			if(i == 5){ i++; continue; }		//Obs: o valor cinco será ignorado
				
			//Apresenta valor de i
			System.out.printf("Valor atual: %d\n", i);
			i++;
		}
		
		System.out.println("\n----------------- Do While -----------------");
		
		i = 10;
		do
		{
			//Apresenta valor de i
			System.out.printf("Valor atual: %d\n", i);			//Obs: o valor dez será apresentado
			i++;
			
		} while(i < 10);
		
		System.out.println("\n----------------- For -----------------");
		
		for(i = 0; i < 10; i++)
		{
			//Apresenta valor de i
			System.out.printf("Valor atual: %d\n", i);
		}
		
		System.out.println("\n----------------- Foreach -----------------");
		
		//Pega empresas
		String[] empresas = {
			"Logon Solucoes",
			"Cyclog Cloud",
			"Verdes Mares",
			"Objetiva Distribuidora"
		};
		
		for(String val: empresas)
		{
			//Apresenta valor
			System.out.println("Valor atual: "+val);
		}
	}
}