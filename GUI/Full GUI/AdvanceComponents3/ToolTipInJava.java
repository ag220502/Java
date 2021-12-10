package AdvanceComponents3;

import java.awt.*;
import javax.swing.*;

public class ToolTipInJava extends JFrame
{
	ToolTipInJava()
	{
		setSize(500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		JLabel label = new JLabel("Password : ");
		JPasswordField pass = new JPasswordField();
		
		label.setBounds(100,50,100,30);
		pass.setBounds(250,50,100,30);
		
		String display = "<html>"+
					"<div bgcolor='#003B5D' color='#ffffff'>"+
					"Enter Your Password<br>"+ 
					"Password SHould Be atleast 8 characters long"+
					"</div>"+
				"</html>";
		//String display="Enter your Password";
		pass.setToolTipText(display);
		//pass.setToolTipText("Enter Your Password");
		add(label);
		add(pass);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ToolTipInJava();
	}
}
