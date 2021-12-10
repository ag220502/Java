package AdvanceComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class InputDialogBoxInJava
{
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBounds(100,100,700,500);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		JButton btn = new JButton("CLick Here");
		frame.add(btn);
				
		btn.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String name = JOptionPane.showInputDialog("Enter Your Name : ");
				if(name.length()>0)
				{
					System.out.println("Your Name is : "+name);
				}
			}
		});
		frame.setVisible(true);
	}
}