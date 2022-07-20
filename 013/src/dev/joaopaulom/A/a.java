package dev.joaopaulom.A;

import java.util.Arrays;

public class a{
	
	public static void main(String[] args){
		
		
		// --------------------- Arrays --------------------- //
		
		//Array com indice definido
		String[] logon = new String[3];
		logon[0] = "47"; 
		logon[1] = "Logon Solucoes"; 
		logon[2] = "S";
		
		//Array com indice indefinido
		String[] verdes_mares = {
			"48",
			"Verdes Mares",
			"S"
		};
		
		//Array multidimensional
		String[][] empresas = {
			logon,
			verdes_mares
		};
		
		// --------------------- Métodos de Arrays --------------------- //
		
		//Copia array inteiro
		String[] fantasia = new String[5];
		/*
		 *fantasia = verdes_mares;
		 *fantasia = verdes_mares.clone();
		*/
		
		//Copia elementos do array
		System.arraycopy(verdes_mares, 1, fantasia, 0, 1);
		System.arraycopy(logon, 1, fantasia, 1, 1);
		
		fantasia[2] = "Fiat Mavel";
		fantasia[3] = "DAF Caminhoes";
		fantasia[4] = "Objetiva Distribuidora";
		
		//Ordena de forma ascendente 
		Arrays.sort(fantasia);
				
		//System.out.println(Arrays.asList(empresas[0]));
		
		// --------------------- Array de Objetos --------------------- //
		
		Empresas[] colaboradores = new Empresas[3];
		colaboradores[0] = new Empresas();
		colaboradores[0].setParamsEmp(47, "Logon Solucoes", true);
		colaboradores[0].getParamsEmp();
		
		System.out.print("\n");
		
		colaboradores[1] = new Empresas();
		colaboradores[1].setParamsEmp(105, "Cylog Cloud", true);
		colaboradores[1].getParamsEmp();
		
		System.out.print("\n");
		
		colaboradores[2] = new Empresas();
		colaboradores[2].setParamsEmp(120, "Boa Terra", true);
		colaboradores[2].getParamsEmp();
	}
}