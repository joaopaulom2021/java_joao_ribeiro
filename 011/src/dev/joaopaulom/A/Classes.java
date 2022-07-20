package dev.joaopaulom.A;

// ----------------------- Classe Pública ----------------------- //

public class Classes
{
	//Propriedades
	public String empresa;
	public String nome;
	public String email;
	
	//Setter
	public void setProperty(String empresa, String nome, String email)
	{
		//Define propriedades
		this.empresa = empresa;
		this.nome	= nome;
		this.email	= email;
		
		//Apresenta sucesso
		System.out.println("Propriedades atualizadas com sucesso.");
	}
	
	//Método público
	public void apresentar()
	{
		System.out.println("Parametros->Empresa: "+empresa+", Nome: "+nome+", Email: "+email);
	}
	
	//Método estático
	static void apresentar2()
	{
		System.out.println("Esta classe contem metodos publicos e estaticos.");
	}
	
	// ------------------------- Métodos que retornam valores ------------------------- //
	
	//Overloading
	static String returnString(String subs)
	{
		return "O valor do parametro foi: "+subs+".";
	}
	
	static String returnString(String subs, String subs2)
	{
		return "O valor do primeiro parametro foi: "+subs+", o do segundo: "+subs2+".";
	}
}