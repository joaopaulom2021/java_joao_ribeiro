package dev.joaopaulom.A;

public class Empresa
{
	//Define propriedades
	public int 	id;
	public String 	fantasia;
	public boolean status_serv;
	
	//Setter
	public void setParamsEmp(int id, String fantasia, boolean status_serv)
	{
		this.id			 = id;
		this.fantasia	 = fantasia;
		this.status_serv = status_serv;
	}
	
	//Getter
	public void getParamsEmp()
	{
		System.out.println("Parametros:\nId - "+id+"\nFantasia - "+fantasia+"\nStatus Servico - "+status_serv);
	}
}