package ActionListenerEvents;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//1. Action Listener - When We click on a button, or pressing enter in text field, or choose any menuItem -  we use action Listener
//Steps of implementing Action Listener
//1 - implemet Action Listener
//2 - override void actionPerformed() method
//3 - Add addActionListener() method

//Example Of Clicking A Button 
class MyFrame extends JFrame implements ActionListener
{
	//Object of class container
	Container c;

	//Creating one new button
	JButton btn=new JButton("Click Here");
	
	//Constructor of class Frame
	MyFrame()
	{
		//Creating Body panel
		c = getContentPane();
		
		//Setting null Layout
		c.setLayout(null);
		
		//Location and size of button
		btn.setBounds(100,100,200,30);
		
		//Adding button to body
		c.add(btn);
		
		//Adding event by passing object of class in which event of btn is defined
		btn.addActionListener(this);
		
		//Making frame Visible
		setVisible(true);
	}
	
	//It is compulsory to override this function in order to create new event
	public void actionPerformed(ActionEvent e)
	{
		//Getting text of Button
		String txt = btn.getText();
		
		//Changing text to upper case 
		btn.setText(txt.toUpperCase());
	}
}
public class ActionListener1 {

	
	public static void main(String[] args) {
		//Object Of class frame 
		MyFrame frame = new MyFrame();
		
		//Settings Of Frame
		frame.setTitle("Events Handling");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setBounds(100, 70, 400, 400);
		frame.setResizable(false);
	}
}
