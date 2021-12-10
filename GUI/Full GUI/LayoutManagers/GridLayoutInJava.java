//Grid Layout
//Sets the components from left to right
//In this layout, extra space is consumed by components present in it
//here we can convert components into rows and columns like a real grid
//Here, size of all the components are same and it changes according to the size of the screen 

package LayoutManagers;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutInJava {

	public static void main(String[] args) {
		//Creating frame
		JFrame frame = new JFrame("Grid Layout Example");
		
		//Setting bounds of frame
		frame.setBounds(100,100,700,600);
		
		//CLosing frame when someone clicks on close button
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		//Container
		Container c = frame.getContentPane();
		
		//Making object of grid layout
		GridLayout g = new GridLayout();
		c.setLayout(g);
		
		g.setVgap(10);
		g.setHgap(20);
		
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
		c.add(btn3,0);
		c.add(btn4);
		c.add(btn5);
		
		//Making frame visible
		frame.setVisible(true);
	}
}