import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;

public class a{
	
	public static void main(String[] args){
		
		// -------------------------------- Java GUI - Swing -------------------------------- //
		
		//Cria janela
		JFrame newWindow = new JFrame("Nova janela");
		newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newWindow.setSize(500, 300);
		newWindow.setTitle("New window");
		
		//Cria label's
		JLabel labelA = new JLabel("This field is a label.");
		//labelA.setVerticalAlignment(JLabel.TOP);
		
		JLabel labelB = new JLabel("This field is another label.");
		//labelB.setVerticalAlignment(JLabel.TOP);
		
		//Cria organizador
		newWindow.setLayout(new FlowLayout());
		
		newWindow.add(labelA);
		newWindow.add(labelB);
		newWindow.setVisible(true);
		
		/* 
		//Cria janela com input's
		String _valA = JOptionPane.showInputDialog("Digite o valor A: ");
		String _valB = JOptionPane.showInputDialog("Digite o valor B: ");
		
		//Pega valores
		int valA 	= Integer.parseInt(_valA);
		int valB 	= Integer.parseInt(_valB);
		int sum 	= valA + valB;
		
		//Apresenta resultado
		JOptionPane.showMessageDialog(null, "Resultado: "+sum, "Resultado da Soma", JOptionPane.INFORMATION_MESSAGE);
		*/
	}
}