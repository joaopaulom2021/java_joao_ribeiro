import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.AWTEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class confirmAlert extends JFrame{
	
	public confirmAlert(String title)
	{
		//Cria janela
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 300);
		setLayout(null);
		
		//Cria elementos
		JLabel  confirmText = new JLabel("Deseja realizar o seguinte?");
		confirmText.setBounds(200, 100, 200, 20);
		confirmText.setHorizontalAlignment(JLabel.CENTER);
		
		JButton btnOk 		= new JButton("OK");
		btnOk.setBounds(200, 160, 80, 40);
		
		JButton btnErro 	= new JButton("ERRO");
		btnErro.setBounds(320, 160, 80, 40);
		
		//Cria eventos
		btnOk.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent event)
			{
				//Apresenta sucesso
				System.out.println("Operacao realizada com sucesso.");
			}
		});
		
		//Cria eventos
		btnErro.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent event)
			{
				//Apresenta erro
				System.out.println("Operacao cancelada.");
			}
		});
		
		//Apresenta janela
		add(confirmText);
		add(btnOk);
		add(btnErro);
		
		setVisible(true);
		
	}
}