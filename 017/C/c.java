import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class c{
	
	public static void main(String[] args){
		
		// ---------------------- Border Layout ---------------------- //
		
		//Cria janela
		JFrame newWindow = new JFrame("Nova janela");
		newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newWindow.setSize(500, 300);
		
		//Cria componentes
		JButton topArea   	 = new JButton("TOP");
		JButton leftArea 	 = new JButton("LEFT");
		JButton centerArea   = new JButton("CENTER");
		JButton rightArea 	 = new JButton("RIGHT");
		JButton bottomArea 	 = new JButton("BOTTOM");
		
		//Cria organizador
		newWindow.setLayout(new BorderLayout());
		
		newWindow.add(topArea, BorderLayout.PAGE_START);
		newWindow.add(leftArea, BorderLayout.LINE_START);
		newWindow.add(centerArea, BorderLayout.CENTER);
		newWindow.add(rightArea, BorderLayout.LINE_END);
		newWindow.add(bottomArea, BorderLayout.PAGE_END);
		
		newWindow.setVisible(true);
	}
}