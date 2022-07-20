package dev.joaopaulom.A;

public class LZap extends Empresa
{
	//Define propriedades
	String api_id;
	String api_token;
	
	//Setter
	public void setParamsLzap(String api_id, String api_token)
	{
		this.api_id		 = api_id;
		this.api_token	 = api_token;
	}
	
	//Getter
	public void getParamsLzap()
	{
		System.out.println("Parametros:\nToken - "+api_token+"\nAPI Id - "+api_id);
	}
}