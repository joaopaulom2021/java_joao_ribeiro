package Main;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPopupMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import Event.PopupSetText;

// ---------------------------- Interface - Objeto ---------------------------- //

public class Object extends JLabel{
	
	//Construtor
	public Object()
	{
		super();
		labelContainer  = new JPopupMenu();
		labelItem 		= new JMenuItem[10];
	}
	
	//Propriedades
	public int width; 	public int height;
	public int x;  		public int y;
	public ImageIcon img;
	public JPopupMenu labelContainer;
	public JMenuItem  labelItem[];
	
	//Métodos
	public void setProperties(int x, int y, int width, int height)
	{
		this.width  = width;
		this.height = height;
		this.x 	 	= x;
		this.y 	 	= y;
	}
	
	public void addPopupMenu(String[] popupItems, String[] itemDescription, PopupSetText instancia)
	{
		for(int i=0; i<popupItems.length; i++)
		{
			labelItem[i] = new JMenuItem(popupItems[i]);
			labelItem[i].setActionCommand(itemDescription[i]);
			labelItem[i].addActionListener(instancia);
			labelContainer.add(labelItem[i]);
		}
		
		addMouseListener(new MouseListener(){
			
			public void mouseClicked(MouseEvent event){}
			public void mousePressed(MouseEvent event)
			{
				if(SwingUtilities.isRightMouseButton(event))
				{
					labelContainer.show(Object.this, event.getX(), event.getY());
				}
			}
			public void mouseReleased(MouseEvent event){}
			public void mouseEntered(MouseEvent event){}
			public void mouseExited(MouseEvent event){}
		});
	}
	
	public void objConstruct(String url)
	{
		setBounds(x, y, width, height);
		img = new ImageIcon(url);
		setIcon(img);
	}
}