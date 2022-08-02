package Main;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

// ---------------------------- Interface - Background ---------------------------- //

public class Background extends JPanel{
	
	//Construtor
	public Background()
	{
		super();
		setLayout(null);
	}
	
	//Propriedades
	public int x; 		public int y;
	public int width; 	public int height;
	public JLabel 		imgContainer;
	public ImageIcon	img;
	
	//Métodos
	public void setProperties(int x, int y, int width, int height)
	{
		this.width  = width;
		this.height = height;
		this.x 	 	= x;
		this.y 	 	= y;
	}
	
	public void objConstruct(String url)
	{
		setBounds(x, y, width, height);
		
		imgContainer = new JLabel();
		imgContainer.setBounds(0, 0, width, height);
		
		img = new ImageIcon(url);
		imgContainer.setIcon(img);
		add(imgContainer);
	}
}