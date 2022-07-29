
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Color;


public class genderConfirm extends JFrame{
	
	
	//Cria variáveis
	JLabel		 alertText;
	JLabel		 alertText2;
	JComboBox	 genderGroup;
	JTextField	 inputText;
	ButtonGroup  estCivilGroup;
	JPanel		 container;
	JRadioButton btnSolt;
	JRadioButton btnCas;
	JRadioButton btnDiv;
	JRadioButton btnViuv;
	
	int windowWidth  = 800;
	int windowHeight = 600;
	int formWidth	 = 400;
	int formHeight	 = 400;
	
	
	public genderConfirm()
	{
		//Cria janela
		super("Alerta");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(windowWidth, windowHeight);
		setLocationRelativeTo(null);
		setLayout(null);
		
		//Cria container
		container = new JPanel();
		container.setBounds((windowWidth/2)-(formWidth/2), (windowHeight/2)-(formHeight/2), formWidth, formHeight);
		container.setLayout(new GridLayout(8, 1));
		
		//Cria elementos
		alertText   = new JLabel("Preencha os seguintes campos: ", JLabel.CENTER);
		alertText2 	= new JLabel("Escreva abaixo um informativo: ", JLabel.CENTER);
		
		inputText	= new JTextField();
		
		genderGroup = new JComboBox(new String[] {"--------", "Masculino", "Feminino", "Nao informado"});
		genderGroup.setEditable(true);
		
		btnSolt   = new JRadioButton("Sou atualmente solteiro");
		btnSolt.setBackground(Color.LIGHT_GRAY);
		
		btnCas    = new JRadioButton("Sou atualmente casado");
		btnCas.setBackground(Color.WHITE);
		
		btnDiv	  = new JRadioButton("Sou atualmente divorciado");
		btnDiv.setBackground(Color.LIGHT_GRAY);
		
		btnViuv   = new JRadioButton("Sou atualmente viuvo");
		btnViuv.setBackground(Color.WHITE);
		
		estCivilGroup = new ButtonGroup();
		estCivilGroup.add(btnSolt);
		estCivilGroup.add(btnCas);
		estCivilGroup.add(btnDiv);
		estCivilGroup.add(btnViuv);
		
		//Cria evento
		btnSolt.setActionCommand("opc1");
		btnCas.setActionCommand("opc2");
		btnDiv.setActionCommand("opc3");
		btnViuv.setActionCommand("opc4");
		
		ItemListener selecionado = new ItemListener()
		{
			public void itemStateChanged(ItemEvent event)
			{
				if(event.getStateChange() == ItemEvent.SELECTED)
				{
					//Apresenta no console
					System.out.println(estCivilGroup.getSelection().getActionCommand());
				}
			}
		};
		
		genderGroup.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent event)
			{
				JComboBox comboItem = (JComboBox) event.getSource();
				
				//Apresenta no console
				System.out.println(comboItem.getSelectedItem().toString());
			}
		});
		
		inputText.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent event)
			{
				//Apresenta no console
				System.out.println(inputText.getText());
			}
		});
		
		btnSolt.addItemListener(selecionado);
		btnCas.addItemListener(selecionado);
		btnDiv.addItemListener(selecionado);
		btnViuv.addItemListener(selecionado);
		
		//Apresenta janela
		container.add(alertText);
		container.add(genderGroup);
		container.add(btnSolt);
		container.add(btnCas);
		container.add(btnDiv);
		container.add(btnViuv);
		container.add(alertText2);
		container.add(inputText);
		
		add(container);
		setVisible(true);
	}
}