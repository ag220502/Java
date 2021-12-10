package AdvanceComponents;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PopupMenuInJava extends JFrame implements ActionListener 
{
	//Creating Menu Item
	JMenuItem item1 ,item2,item3;
	
	//Creating Constructor
	PopupMenuInJava()
	{
		//Setting size of frame
		setSize(500,500);
		
		//Setting default close operation
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Making frame non resizable 
		setResizable(false);
		
		//Setting location to relative
		setLocationRelativeTo(null);
		
		//Setting layout of frame to flow layout
		setLayout(new FlowLayout());
		
		//Creating popup menu 
		JPopupMenu pop = new JPopupMenu();
		
		//Menu item
		item1 =new JMenuItem("Item 1");
		item2 =new JMenuItem("Item 2");
		item3 =new JMenuItem("Item 3");
		
		//Adding all the items in popup menu
		pop.add(item1);
		pop.add(item2);
		pop.add(item3);
		
		//Adding event listeners on items
		item1.addActionListener(this);
		item2.addActionListener(this);
		item3.addActionListener(this);
		
		//Adding popup in frame 
		add(pop);
		
		//Making frame visible
		setVisible(true);
		
		//Adding event listener for mouse click
		addMouseListener( new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				//If the clicked button is left then
				if(e.getButton() == MouseEvent.BUTTON1)
				{
					//getting position of mouse
					int i = e.getX();
					int j = e.getY();
		
					//Showing popup on that place
					pop.show(PopupMenuInJava.this, i, j);
				}
			}
		}
		);
	}	
	
	//Action listener
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==item1)
		{
			System.out.println("Item 1 Is Selected");
		}
		else if(e.getSource()==item2)
		{
			System.out.println("Item 2 Is Selected");
		}
		else if(e.getSource()==item3)
		{
			System.out.println("Item 3 Is Selected");
		}
	}
	public static void main(String[] args) {
	
		//Constructor of class
		new PopupMenuInJava();
	}
}