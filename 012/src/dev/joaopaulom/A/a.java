package dev.joaopaulom.A;

public class a{
	
	public static void main(String[] args){
		
		
		// ---------------------- Hereditariedade ---------------------- //
		
		//Cria parâmetros - Empresa
		int 	id = 47;
		String 	fantasia = "Logon Solucoes";
		boolean status_serv = true;
		
		//Cria parâmetros - LZap
		String api_id	 = "chatpro-suh0ujdr5v"; 
		String api_token = "60tdb8s2we6k28nkumvxnd9gwj0963";
		
		//Define parâmetros
		LZap logon = new LZap();
		logon.setParamsEmp(id, fantasia, status_serv);
		logon.setParamsLzap(api_id, api_token);
		
		//Apresenta parâmetros
		logon.getParamsEmp();
		System.out.println("\n");
		logon.getParamsLzap();
	}
}