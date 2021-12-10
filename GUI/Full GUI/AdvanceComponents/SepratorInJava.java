package AdvanceComponents;

import javax.swing.*;
import java.awt.*;
public class SepratorInJava extends JFrame
{
	SepratorInJava()
	{
		setSize(500,700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,1));
		
		panel.add(new JLabel("First Line"));
		panel.add(new JSeparator());
		panel.add(new JLabel("Second Line"));

		add(panel);	
		setVisible(true);
	}
	public static void main(String[] args) {
		new SepratorInJava();
	}
}