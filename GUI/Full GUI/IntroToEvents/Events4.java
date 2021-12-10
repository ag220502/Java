package IntroToEvents;
//Here we are doing event handling in another class
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Events4 {

	public static Container c;
	
	public static void main(String[] args) {
		//Creating New Frame
		JFrame frame=new JFrame();
		//Setting Bounds of frame
		frame.setBounds(100,70,1000,500);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("Text Field In Frame");
		c = frame.getContentPane();
		c.setLayout(null);
		c.setBackground(new Color(255,191,100));
		
		//Creating button1
		JButton btn1= new JButton("Red");
		//Creating button2
		JButton btn2= new JButton("Yellow");
		//Creating button3
		JButton btn3= new JButton("Blue");

		//Location and size of button
		btn1.setBounds(50,100,200,30);
		btn2.setBounds(250,100,200,30);
		btn3.setBounds(450,100,200,30);

		//Adding button to body
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		
		//Adding event by passing object of class in which event of btn is defined
		btn1.addActionListener(new RedClass());
		btn2.addActionListener(new YellowClass());
		btn3.addActionListener(new BlueClass());
		frame.setVisible(true);
	}
}
class RedClass implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		Events4.c.setBackground(Color.red);
	}
}
class YellowClass implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		Events4.c.setBackground(Color.yellow);
	}
}
class BlueClass implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		Events4.c.setBackground(Color.blue);
	}
}