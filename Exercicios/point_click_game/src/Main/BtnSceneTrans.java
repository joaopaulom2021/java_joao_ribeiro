package Main;

import javax.swing.JButton;
import javax.swing.ImageIcon;

public class BtnSceneTrans extends JButton{
	
	//Construtor
	public BtnSceneTrans()
	{
		super();
		setBackground(null);
		setContentAreaFilled(false);
		setFocusPainted(false);
		setBorderPainted(false);
	}
	
	//Propriedades
	public int x; 		public int y;
	public int width; 	public int height;
	public String img;
	
	//Métodos
	public void setProperties(int x, int y, int width, int height, String url)
	{
		this.x 		= x;
		this.y 		= y;
		this.width  = width;
		this.height = height;
		this.img	= url;
	}
	
	public void objConstruct()
	{
		setBounds(x, y, width, height);
		setIcon(new ImageIcon(img));
	}
	
}