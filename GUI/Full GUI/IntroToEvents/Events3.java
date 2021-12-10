package IntroToEvents;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//Here we are making an button event using an anonymous class which means we dont have to create object of this class
//Here we dont have to implement ActionListener class as we are using the constructor and using it in function only 
public class Events3 
{
	public static void main(String[] args) 
	{
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setBounds(100,70,1000,500);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("Text Field In Frame");
		
		Container c=  frame.getContentPane();
		c.setLayout(null);
		c.setBackground(new Color(255,191,100));
		
		JButton btn=new JButton("Click Here");
		btn.setBounds(100,70,200,40);
		c.add(btn);
		System.out.println("Hello world");

		btn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				c.setBackground(Color.RED);
			}
		});
	}
}
