package Elements;
import javax.swing.*;

import javax.swing.text.Document;


import java.awt.*;


public class CreatingTextFieldd {
	public static void main(String[] args) {
		//Creating new Frame
		JFrame frame=new JFrame(); 
		
		//Closing frame when user click on close button
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		//Setting bounds for frame
		frame.setBounds(100, 70, 600, 600);
		
		//Making it non resizable
		frame.setResizable(false);
		
		//Setting title of frame
		frame.setTitle("DropDown Menu Used In Forms");
		
		//Container of frame
		Container c = frame.getContentPane();
		
		//Setting layout to null
		c.setLayout(null);
		
		//Setting background color
		c.setBackground(new Color(255,190,100));
		
		//Inserting Text Field In Body
		JTextField text = new JTextField();
		
		//Setting bounds in frame
		text.setBounds(100, 50, 200, 30);
		
		//Adding to container
		c.add(text);
		
		//Setting Default Text
		text.setText("Akshay Garg ");
		
		//Font Styles
		Font font =new Font("Arial",Font.BOLD,20);
		text.setFont(font);
		
		//Changing Text Color
		text.setForeground(new Color(0,59,93));
		
		//Changing Background Color
		text.setBackground(Color.cyan);
		
		//Not allowing user to edit the value of Text Field
		text.setEditable(true);
		
		//Making frame visible
		frame.setVisible(true);
	}
}