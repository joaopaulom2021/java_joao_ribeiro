import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.AWTEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame{
	
	public Calculadora()
	{
		//Cria janela
		super("Calculadora");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 300);
		setVisible(true);
	}
}