package Event;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Main.Mensagem;

public class PopupSetText implements ActionListener{
	
	//Construtor
	public PopupSetText(Mensagem textLabel)
	{
		this.textLabel = textLabel;
	}
	
	//Propriedades
	Mensagem  textLabel;
	String	  texto;
	
	public void actionPerformed(ActionEvent event)
	{
		texto = event.getActionCommand();
		textLabel.setText(texto);
	}
}