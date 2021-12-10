//Box Layout 
//In this layout components are added in single row or single column
 
package LayoutManagers;

import java.awt.*;
import javax.swing.*;

public class BoxLayout1 
{
	public static void main(String[] args) 
	{
		//Creating frame
		JFrame frame = new JFrame("Box Layout Example");
		
		//Setting bounds of frame 
		frame.setBounds(100,100,700,600);
		
		//CLosing frame when someone clicks on close button
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		//Container
		Container c = frame.getContentPane();

		//Creating box layout object
		BoxLayout box = new BoxLayout(c,BoxLayout.Y_AXIS);
		c.setLayout(box);
		
		//Creating Buttons
		JButton btn1 = new JButton("Button1");
		JButton btn2 = new JButton("Button2");
		JButton btn3 = new JButton("Button3");
		JButton btn4 = new JButton("Button4");
		JButton btn5 = new JButton("Button5");
		
		btn1.setAlignmentX(c.RIGHT_ALIGNMENT);
		btn2.setAlignmentX(c.RIGHT_ALIGNMENT);
		btn3.setAlignmentX(c.RIGHT_ALIGNMENT);
		btn4.setAlignmentX(c.RIGHT_ALIGNMENT);
		btn5.setAlignmentX(c.RIGHT_ALIGNMENT);
		

		btn1.setAlignmentX(c.LEFT_ALIGNMENT);
		btn2.setAlignmentX(c.LEFT_ALIGNMENT);
		btn3.setAlignmentX(c.LEFT_ALIGNMENT);
		btn4.setAlignmentX(c.LEFT_ALIGNMENT);
		btn5.setAlignmentX(c.LEFT_ALIGNMENT);
		
		
		//Adding buttons to container
		c.add(btn1);
		c.add(Box.createRigidArea(new Dimension(20,50)));
		c.add(btn2);
		c.add(btn3);
		c.add(btn4);
		c.add(btn5);
		
		//Making frame visible
		frame.setVisible(true);
	}
}