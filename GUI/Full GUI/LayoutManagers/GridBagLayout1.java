package LayoutManagers;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagLayout1 {

	public static void main(String[] args) {
		//Creating frame
		JFrame frame = new JFrame("Grid Bag Layout Example");
		
		//Setting bounds of frame 
		frame.setBounds(100,100,700,600);
		
		//CLosing frame when someone clicks on close button
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		//Container
		Container c = frame.getContentPane();
		
		//Creating Buttons
		JButton btn1 = new JButton("Button 1");
		JButton btn2 = new JButton("Button 2");
		JButton btn3 = new JButton("Button 3");
		JButton btn4 = new JButton("Button 4");
		
		//Making object of grid bag Layout
		GridBagLayout grid = new GridBagLayout();
		c.setLayout(grid);
		
		//Making object of grid bag constraints 
		//This is for adding the components of one part in bag 
		GridBagConstraints gbc = new GridBagConstraints();
		
		//For this we have to give x and y position of elements
		gbc.weightx=0.5;
		gbc.gridx = 0;
		gbc.gridy = 0;
		c.add(btn1,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		c.add(btn2,gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 0;
		c.add(btn3,gbc);
		
		//pack();
		 
		//Setting Vertical Gap
		
		
		//Setting Horizontal Gap
		
		
		
		//Making frame visible
		frame.setVisible(true);
	}
}