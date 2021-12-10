package Elements;
import javax.swing.*;
import java.awt.*;

public class CreatingPasswordField {
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
		
		//Creating new Password Field
		JPasswordField pass = new JPasswordField();
		
		//Setting Bounds 
		pass.setBounds(100, 50, 200, 30);
		
		//Setting default value
		pass.setText("Hello");
		
		//Font Styles
		Font font = new Font("Arial",Font.BOLD,20);
		pass.setFont(font);
		
		//Setting Font Color
		pass.setForeground(new Color(0,59,93));
		
		//Setting Background Color
		pass.setBackground(new Color(255,204,0));
		
		//Setting font to print
		pass.setEchoChar('#');
		
		//Printing what the user is typing
		pass.setEchoChar((char)(0));
		
		//Adding field into body
		c.add(pass);
		
		frame.setVisible(true);
	}
}