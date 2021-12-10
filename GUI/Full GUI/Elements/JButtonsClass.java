package Elements;
import javax.swing.*;
import java.awt.*;

public class JButtonsClass {
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
		
		//Creating New Button object
		JButton btn= new JButton("Click Here");
		
		//Setting bounds for button
		btn.setBounds(100,100,200,40);
		
		//Adding button to container
		c.add(btn);
		
		//Changing Font Styles
		btn.setFont(new Font("Arial",Font.BOLD,30));
		
		//Changing Text
		btn.setText("Click");
		
		//Setting font Color
		btn.setForeground(Color.red);
		
		//Setting Background Color
		btn.setBackground(Color.blue);
		
		//Setting Cursor on Hovering of Button
		Cursor cur=new Cursor(Cursor.HAND_CURSOR);
		btn.setCursor(cur);
		
		//Disabling the button
		//btn.setEnabled(false);
		
		//Not Showing the button
		//btn.setVisible(false);
		
		//Making frame visible
		frame.setVisible(true);
	}
}