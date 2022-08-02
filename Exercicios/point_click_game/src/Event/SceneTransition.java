package Event;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Main.Background;

public class SceneTransition implements ActionListener{
	
	//Construtor
	public SceneTransition(Background instancia[])
	{
		this.instancia = instancia;
	}
	
	//Propriedades
	Background  instancia[];
	int	   		selectedBg;
	
	//Métodos
	public void actionPerformed(ActionEvent event)
	{
		selectedBg = Integer.parseInt(event.getActionCommand());
		if(instancia[selectedBg].isVisible())
		{
			instancia[selectedBg].setVisible(false);
			
		} else{
			
			instancia[selectedBg].setVisible(true);
		}
	}
}