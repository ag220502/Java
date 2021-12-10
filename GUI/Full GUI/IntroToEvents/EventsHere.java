package IntroToEvents;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class OurFrame extends JFrame implements ActionListener
{
	Container c;
	JButton btn1= new JButton("Red");
	JButton btn2= new JButton("Yellow");
	JButton btn3= new JButton("Blue");
	
	OurFrame()
	{
		//Creating Body panel
		c = getContentPane();
		
		//Setting null Layout
		c.setLayout(null);
		
		//Location and size of button
		btn1.setBounds(50,100,200,30);
		btn2.setBounds(250,100,200,30);
		btn3.setBounds(450,100,200,30);
		
		//Adding button to body
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		
		//Adding event by passing object of class in which event of btn is defined
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btn1)
		{
			c.setBackground(Color.red);
		}
		if(e.getSource()==btn2)
		{
			c.setBackground(Color.yellow);
		}
		if(e.getSource()==btn3)
		{
			c.setBackground(Color.blue);
		}
	}
}
public class EventsHere {
	public static void main(String[] args) {
		OurFrame frame = new OurFrame();
		//Settings Of Frame
		frame.setTitle("Events Handling");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setBounds(100, 70, 1000, 500);
		frame.setVisible(true);
		frame.setResizable(false);
	}
}