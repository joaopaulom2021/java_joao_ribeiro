package dev.joaopaulom.A;

public class a{
	
	public static void main(String[] args){
		
		
		// ------------------------- String Methods ------------------------- //
		
		String lorem  = " Lorem Ipsum is simply dummy text of the printing and typesetting industry. Ipsum ";
		
		char 	caracter = lorem.charAt(1);				//Obtêm caracter específico
		String  fword  	 = lorem.substring(1, 7);		//Obtêm parte do conteúdo de uma string
		String  sword  	 = lorem.substring(7, 12);
		boolean equals 	 = fword.equals(sword);			//Verifica se strings são iguais
		String  cwords	 = fword.concat(sword);			//Concatena strings
		int		fwindex	 = lorem.indexOf(fword);		//Obtêm primeira ocorrência de um caracter ou substring
		int 	swlindex = lorem.lastIndexOf(sword);	//Obtêm última ocorrência de um caracter ou substring
		boolean none	 = lorem.isEmpty();				//Verifica se string está vazia
		
		// ------------------------- Outras Implementações ------------------------- //
		
		String[] path = {
			"%JAVA_HOME%\\bin\\;",
			"%java_env%\\apache_ant\\bin\\;",
			"C:\\xampp\\composer\\vendor\\;"
		};
		
		StringBuilder plain_text = new StringBuilder();
		
		for(String val: path)
		{
			//Concatena strings
			plain_text.append(val);
		}
		
		//Apresenta no terminal
		System.out.println(plain_text);
	}
}