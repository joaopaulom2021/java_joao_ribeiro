import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.AWTEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class d{
	
	public static void main(String[] args){
		
		// ------------------------------- Java GUI - Absolute Position ------------------------------- //
		
		//Cria janela
		JFrame newWindow = new JFrame("Nova janela");
		newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newWindow.setSize(600, 300);
		newWindow.setLayout(null);
		
		//Cria elementos
		JLabel  textConfirm  = new JLabel("Deseja realizar o seguinte?");
		JButton btnOk		 = new JButton("OK");
		JButton btnErro		 = new JButton("ERRO");
		
		//Posiciona elementos
		textConfirm.setBounds(200, 100, 200, 20);
		textConfirm.setHorizontalAlignment(JLabel.CENTER);
		
		btnOk.setBounds(200, 160, 80, 40);
		btnErro.setBounds(320, 160, 80, 40);
		
		// ------------------------------- Java AWT - Events ------------------------------- //
		
		//Cria eventos
		btnOk.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent event)
			{
				//Informa sucesso
				System.out.println("Operacao realizada com sucesso.");
			}
		});
		
		btnErro.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent event)
			{
				//Informa erro
				System.out.println("Operacao cancelada.");
			}
		});
		
		//Apresenta janela
		newWindow.add(textConfirm);
		newWindow.add(btnOk);
		newWindow.add(btnErro);
		
		newWindow.setVisible(true);
	}
}