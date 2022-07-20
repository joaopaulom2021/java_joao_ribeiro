package dev.joaopaulom.A;

import java.time.*;

public class a{
	
	public static void main(String[] args){
		
		// ------------------------- Data e Hora ------------------------- //
		
		System.out.println(LocalDate.now());					//Retorna no formato y-m-d
		String ymd = LocalDate.now().toString();				//Converte em string
		System.out.println(ymd);
		
		System.out.println(LocalDate.now().getYear());			//Retorna o ano
		System.out.println(LocalDate.now().getDayOfYear());		//Retorna dia do ano
		System.out.println(LocalDate.now().getMonthValue());	//Retorna mês do ano
		
		System.out.println(LocalTime.now());					//Retorna no formato H:i:s.microtime
		System.out.println(LocalTime.now().getHour());			//Retorna hora
		System.out.println(LocalTime.now().getMinute());		//Retorna minutos
		System.out.println(LocalTime.now().getSecond());		//Retorna segundos
		
		//Cria string no formato y-m-d H:i:s
		String ymdHis = ymd.concat(" "+LocalTime.now().toString());
		System.out.println(ymdHis);
	}
}