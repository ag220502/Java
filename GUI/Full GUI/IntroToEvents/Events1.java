package IntroToEvents;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener
{
	//Object of class container
	Container c;
	//Constructor of class Frame
	
	MyFrame()
	{
		//Creating Body panel
		c = getContentPane();
		//Setting null Layout
		c.setLayout(null);
		//Creating one new button
		JButton btn=new JButton("Click Here");
		//Location and size of button
		btn.setBounds(100,100,200,30);
		//Adding button to body
		c.add(btn);
		//Adding event by passing object of class in which event of btn is defined
		btn.addActionListener(this);
	}
	//It is compulsory to override this function in order to create new event
	public void actionPerformed(ActionEvent e)
	{
		c.setBackground(Color.yellow);
	}
}

public class Events1 
{
	public static void main(String[] args) 
	{
		//Object Of class frame 
		MyFrame frame = new MyFrame();
		//Settings Of Frame
		frame.setTitle("Events Handling");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setBounds(100, 70, 1000, 500);
		frame.setVisible(true);
		frame.setResizable(false);
	}
}