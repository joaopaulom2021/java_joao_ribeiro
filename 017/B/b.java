import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
//import java.awt.FlowLayout;

public class b{
	
	public static void main(String[] args){
		
		// ------------------------------- Java Swing - Grid Layout ------------------------------- //
		
		//Cria janela
		JFrame newWindow = new JFrame("Nova janela");
		newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newWindow.setSize(500, 300);
		
		//Cria label's
		JLabel labelA = new JLabel("Conteudo da label A"); labelA.setVerticalAlignment(JLabel.TOP);
		JLabel labelB = new JLabel("Conteudo da label B"); labelB.setVerticalAlignment(JLabel.TOP);
		JLabel labelC = new JLabel("Conteudo da label C"); labelC.setVerticalAlignment(JLabel.TOP);
		JLabel labelD = new JLabel("Conteudo da label D"); labelD.setVerticalAlignment(JLabel.TOP);
		
		//Cria organizador
		//newWindow.setLayout(new FlowLayout());
		GridLayout organizador = new GridLayout(4, 1);
		newWindow.setLayout(organizador);
		
		//Adiciona componentes
		newWindow.add(labelA);
		newWindow.add(labelB);
		newWindow.add(labelC);
		newWindow.add(labelD);
		
		newWindow.setVisible(true);
	}
}