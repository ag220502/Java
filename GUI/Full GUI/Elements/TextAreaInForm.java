package Elements;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.*;

public class TextAreaInForm {
	public static void main(String[] args) {
		//Creating New Frame
		JFrame frame=new JFrame();
		
		//Setting properties to frame
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		frame.setBounds(100, 70, 600, 600);
		frame.setResizable(false);
		
		//Setting title to frame
		frame.setTitle("Text Area In Java");
		
		//Creating container for frame 
		Container c = frame.getContentPane();
		
		//Setting null layout 
		c.setLayout(null);
		
		//Background color of frame 
		c.setBackground(new Color(255,190,100));
		
		//Creating one textArea for body 
		JTextArea text = new JTextArea("This is a Text Area...");
		
		//Setting bounds of Text Area 
		text.setBounds(100,100,400,200);
		
		//Setting default Text to text area 
		text.setText("This is a Text Area...");
		
		//Setting font style to text area 
		text.setFont(new Font("Arial",Font.ITALIC|Font.BOLD,20));
		
		//Setting the text area field to edit
		//if the value is false then the user cannot edit this
		text.setEditable(true);
		
		//Setting the Line wrap true so that the text automatically comes to next line
		//By Default its false
		text.setLineWrap(true);
		
		//Adding text area to container  
		c.add(text);
		
		//Making frame visible
		frame.setVisible(true);
	}

}
