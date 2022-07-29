import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class confirmAlert extends JFrame{
	
	//Cria variáveis
	JButton 	btnOk	  = new JButton();
	JCheckBox 	btnCheck  = new JCheckBox();
	JPanel 		container = new JPanel();
	JPanel		content	  = new JPanel();
	JPanel		content2  = new JPanel();
	
	int windowWidth  	 = 800;
	int windowHeight 	 = 600;
	int containerWidth	 = 400;
	int containerHeight	 = 400;
	
	public confirmAlert()
	{
		//Cria janela
		super("Alerta");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(windowWidth, windowHeight);
		setLocationRelativeTo(null);
		setLayout(null);
		
		//Cria elementos
		container.setBounds((windowWidth/2)-(containerWidth/2), (windowHeight/2)-(containerHeight/2), containerWidth, containerHeight);
		container.setLayout(new GridLayout(2, 1));
		
		content.setLayout(null);
		btnCheck.setText("Deseja realizar o seguinte?");
		btnCheck.setBounds((containerWidth/2)-100, (containerHeight/4)-10, 200, 20);
		
		content2.setLayout(null);
		btnOk.setText("Prosseguir");
		btnOk.setBounds((containerWidth/2)-100, 0, 200, 50);
		btnOk.setVisible(false);
		
		//Cria eventos
		btnCheck.addItemListener(new ItemListener(){
			
			public void itemStateChanged(ItemEvent event)
			{
				if(event.getStateChange() == ItemEvent.SELECTED)
				{
					//Apresenta button
					btnOk.setVisible(true);
					
				} else{
					
					//Remove button
					btnOk.setVisible(false);
				}
			}
		});
		
		//Apresenta janela
		content.add(btnCheck);
		content2.add(btnOk);
		
		container.add(content);
		container.add(content2);
		add(container);
		
		setVisible(true);
	}
}