//Border Layout -  By default in java 
//There are 5 areas in border layout.
//The position of elements are fixed here but the size changes according to the screen size
//Width of left and right side remains same and other can change 

package LayoutManagers;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayout1 {

	public static void main(String[] args) {
		
		//Creating frame
		JFrame frame = new JFrame("Border Layout Example");
		
		//Setting bounds of frame 
		frame.setBounds(100,100,700,600);
		
		//CLosing frame when someone clicks on close button
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		//Container
		Container c = frame.getContentPane();
		
		//Making object of border Layout
		BorderLayout border = new BorderLayout();
		//BorderLayout border = new BorderLayout(10,5);
		
		//Adding border layout to container
		c.setLayout(border);
		
		//Creating Buttons
		JButton btn1 = new JButton("Page Start");
		JButton btn2 = new JButton("Page End");
		JButton btn3 = new JButton("Line Start");
		JButton btn4 = new JButton("Center");
		JButton btn5 = new JButton("Line End ");
		
		
		//Adding buttons to container
		//c.add(btn1,BorderLayout.PAGE_START);
		c.add(btn2,BorderLayout.PAGE_END);
		c.add(btn3,BorderLayout.LINE_START);
		c.add(btn4,BorderLayout.CENTER);
		//c.add(btn5,BorderLayout.LINE_END);
		
		//Setting Vertical Gap
		border.setVgap(40);
		
		//Setting Horizontal Gap
		border.setHgap(40);
		
		//Adding buttons to container
		/*c.add(btn1,BorderLayout.NORTH);
		c.add(btn2,BorderLayout.SOUTH);
		c.add(btn3,BorderLayout.WEST);
		c.add(btn4,BorderLayout.CENTER);
		c.add(btn5,BorderLayout.EAST);
		*/
		//Making frame visible
		frame.setVisible(true);
	}

}
