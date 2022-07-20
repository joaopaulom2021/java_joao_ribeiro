package dev.joaopaulom.A;

public class a{
	
	public static void main(String[] args){
		
		// ------------------------- Tratamento de Exceções ------------------------- //
		
		String[] fantasia = new String[5];
		
		try
		{
			//Tenta execução
			fantasia[5] = "Logon Solucoes";
			
		} catch(Exception erro){
			
			//Pega erro
			System.out.println("dev.joaopaulom.A/a.java: Erro->"+erro.getMessage());
			
		} finally{
			
			//Executado independentemente
			fantasia[4] = "Logon Solucoes";
			System.out.println("Fantasia: "+fantasia[4]);
		}
	}
}