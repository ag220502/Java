//In null layout position and size of elements are Fixed
//In null layout we are not using any defined layout and we will decide the position and size of elements
//When we resize the frame there is no effect in position and size of elements 
package LayoutManagers;
import java.awt.*;
import javax.swing.*;

public class NullLayout1 extends JFrame
{
	public static void main(String[] args) 
	{
		//Creating frame
		JFrame frame = new JFrame("Null Layout Example");
		
		//Setting bounds of frame
		frame.setBounds(100,100,700,600);
		
		//CLosing frame when someone clicks on close button
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		//Container
		Container c = frame.getContentPane();
		
		//Setting null layout
		c.setLayout(null);
		
		//Creating Buttons
		JButton btn1 = new JButton("Button 1");
		JButton btn2 = new JButton("Button 2");
		JButton btn3 = new JButton("Button 3");
		JButton btn4 = new JButton("Button 4");
		JButton btn5 = new JButton("Button 5");
		
		//Setting bounds of button
		btn1.setBounds(20, 20, 80, 40);
		btn2.setBounds(120, 20, 80, 40);
		btn3.setBounds(220, 20, 80, 40);
		btn4.setBounds(20, 80, 80, 40);
		btn5.setBounds(120, 80, 80, 40);
		
		//Adding buttons to container
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		c.add(btn4);
		c.add(btn5);
		
		//Making frame visible
		frame.setVisible(true);
	}

}
