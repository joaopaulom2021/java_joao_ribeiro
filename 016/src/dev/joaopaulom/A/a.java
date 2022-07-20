package dev.joaopaulom.A;

import java.io.File;
import java.time.*;
import java.io.*;

public class a{
	
	public static void main(String[] args){
		
		// ------------------------- Manipulação de Ficheiros ------------------------- //
		
		//Pega data
		String ymd 		=  LocalDate.now().toString(); 
		String horas    =  String.valueOf(LocalTime.now().getHour());
		String minutos  =  String.valueOf(LocalTime.now().getMinute());
		String segundos =  String.valueOf(LocalTime.now().getSecond());
		
		//Define file
		StringBuilder ymdHis = new StringBuilder();
		ymdHis.append(ymd+" "+horas+"-"+minutos+"-"+segundos+".txt");
		
		//Define path
		String path = System.getProperty("user.dir");
		path = path.concat("\\logs\\");
		path = path.concat(ymdHis.toString());
		
		//Cria objeto file
		File arquivo = new File(path);
		
		//Cria conteúdo do file
		String content = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
		
		try
		{
			makeFile(path, content);
			//deleteFile(path);				//Deleta arquivo
			
			/*
			 * Cria pasta
			 * Obs: mkdirs para a criação de subpastas
			 * Obs: delete também é aplicável
			 * arquivo.mkdir();
			*/
			
		} catch(Exception error){
			
			System.out.println(System.getProperty("user.dir")+": Erro->"+error.getMessage());
		}
	}
	
	// --------------------------- Escreve ficheiros --------------------------- //
	
	public static void makeFile(String path, String content)
	{	
		try
		{
			//Cria file
			File arquivo = new File(path);
			arquivo.createNewFile();
			
			if(arquivo.exists())
			{
				//Escreve conteúdo
				BufferedWriter writer = new BufferedWriter(new FileWriter(path));
				writer.write(content);
				writer.close();
				
				//Apresenta o conteúdo
				readFile(path);
				
			} else{
				
				System.out.println(System.getProperty("user.dir")+": Info->o arquivo nao existe.");
			}
			
		} catch(Exception error){ 
		
			System.out.println(System.getProperty("user.dir")+": Erro->"+error.getMessage()); 
		}
	}
	
	// --------------------------- Deleta ficheiros --------------------------- //
	
	public static void deleteFile(String path)
	{
		//Cria objeto file
		File arquivo = new File(path);
		
		//Verifica se file existe
		if(arquivo.exists())
		{
			try{ arquivo.delete(); System.out.println("O arquivo foi deletado."); }
			catch(Exception error){ System.out.println(System.getProperty("user.dir")+": Erro->"+error.getMessage()); }
			
		} else{
			
			System.out.println(System.getProperty("user.dir")+": Info->o arquivo nao existe.");
		}
	}
	
	// --------------------------- Faz leitura de files --------------------------- //
	
	public static void readFile(String path)
	{
		//Cria objeto file
		File arquivo = new File(path);
		
		//Verifica se file existe
		if(arquivo.exists())
		{
			//Pega dados do file
			try
			{
				BufferedReader fileReader = new BufferedReader(new FileReader(path));
				String content = fileReader.readLine();
				
				while(content != null)
				{
					System.out.println(content);
					content = fileReader.readLine();
				}
				
			} catch(Exception error){
				
				System.out.println(System.getProperty("user.dir")+": Erro->"+error.getMessage());
			}
			
			
		} else{
			
			System.out.println(System.getProperty("user.dir")+": Info->o arquivo nao existe.");
		}
	}
}