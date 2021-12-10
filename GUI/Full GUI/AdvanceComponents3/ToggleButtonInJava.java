package AdvanceComponents3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToggleButtonInJava extends JFrame
{
	private Color clr;
	ToggleButtonInJava()
	{
		setSize(500,500);
		
		setBackground(Color.red);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
		setVisible(true);
	
		Container c = getContentPane();
		
		c.setLayout(null);
		
		clr = getBackground();
		
		JToggleButton btn = new JToggleButton();
		
		btn.setBounds(100,100, 100, 30);
		
		btn.setText("Off");
		
		add(btn);
		
		btn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(btn.isSelected())
				{
					c.setBackground(Color.green);
					btn.setText("On");
				}
				else
				{
					c.setBackground(clr);
					btn.setText("Off");
				}	
			}
		});
		
	}
	public static void main(String[] args) 
	{ 
		new ToggleButtonInJava();
	}
}