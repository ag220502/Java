package LayoutManagers;

import java.awt.*;
import javax.swing.*;

public class CardLayout1 
{
	public static void main(String[] args) 
	{
		//Creating frame
		JFrame frame = new JFrame("Border Layout Example");
		
		//Setting bounds of frame 
		frame.setBounds(100,100,700,600);
		
		//CLosing frame when someone clicks on close button
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		//Container
		Container c = frame.getContentPane();

		//Creating flow layout object
		CardLayout card = new CardLayout();
		c.setLayout(card);
		
		//Creating Buttons
		JButton btn1 = new JButton("Button1");
		JButton btn2 = new JButton("Button2");
		JButton btn3 = new JButton("Button3");
		JButton btn4 = new JButton("Button4");
		JButton btn5 = new JButton("Button5");
		
		//Adding buttons to container
		c.add(btn1,"1");
		c.add(btn2,"2");
		c.add(btn3,"Page 3");
		c.add(btn4,"4");
		c.add(btn5,"5");
		
		/*card.next(c);
		card.previous(c);*/
		card.first(c);
		card.last(c);
		card.show(c,"Page 3");
		
		
		//Making frame visible
		frame.setVisible(true);
	}
}