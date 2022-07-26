import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.AWTEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Toolkit;

public class confirmAlert extends JFrame{
	
	public confirmAlert(String title, String message, Dimension windowSize)
	{
		//Configura janela
		super();
		setTitle(title);
		setSize(windowSize);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		//Posiciona janela
		//Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		//setLocation((screenSize.width/2)-(windowSize.width/2),(screenSize.height/2)-(windowSize.height/2));
		setLocationRelativeTo(null);
		
		//Cria elementos
		JLabel alertText = new JLabel(message, JLabel.CENTER);
		alertText.setBounds(200, 100, 200, 20);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(200, 160, 80, 40);
		
		JButton btnErro = new JButton("ERRO");
		btnErro.setBounds(320, 160, 80, 40);
		
		//Cria eventos
		btnOk.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent event)
			{
				//Apresenta sucesso
				System.out.println("Operacao realizada com sucesso.");
			}
		});
		
		btnErro.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent event)
			{
				//Apresenta erro
				System.out.println("Operacao cancelada.");
				System.exit(0);
			}
		});
		
		//Apresenta janela
		add(alertText);
		add(btnOk);
		add(btnErro);
		
		setVisible(true);
	}
}