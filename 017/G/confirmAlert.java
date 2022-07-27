import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.AWTEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class confirmAlert extends JFrame{
	
	public confirmAlert(String title, Dimension windowSize)
	{
		//Configura janela
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(windowSize);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		
		//Cria contentor
		int contentWidth  = (windowSize.width/3);
		int contentHeight = (windowSize.height/3);
		
		int contentX = (windowSize.width/2)  - (contentWidth/2);
		int contentY = (windowSize.height/2) - (contentHeight/2);
		
		JPanel content = new JPanel();
		content.setLayout(null);
		content.setBounds(contentX, contentY, contentWidth, contentHeight);
		
		//Cria elementos
		JLabel alertText = new JLabel("Deseja realizar o seguinte?", JLabel.CENTER);
		alertText.setBounds(0, 0, contentWidth, 20);
		
		JButton btnOk = new JButton("S");
		btnOk.setBounds(10, 50, 50, 30);
		
		JButton btnErro = new JButton("N");
		btnErro.setBounds(140, 50, 50, 30);
		
		//Cria eventos
		btnOk.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent event)
			{
				//Esconde btn's
				btnOk.setVisible(false);
				btnErro.setVisible(false);
				
				//Altera texto
				alertText.setText("Operacao realizada com sucesso.");
			}
		});
		
		btnErro.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent event)
			{
				//Esconde btn's
				btnOk.setVisible(false);
				btnErro.setVisible(false);
				
				//Altera texto
				alertText.setText("Operacao cancelada.");
			}
		});
		
		//Apresenta janela
		content.add(alertText);
		content.add(btnOk);
		content.add(btnErro);
		
		add(content);
		setVisible(true);
	}
}