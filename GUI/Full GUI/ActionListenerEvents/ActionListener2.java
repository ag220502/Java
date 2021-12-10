package ActionListenerEvents;
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

//Example Of clicking Enter In Text Field


class TextFrame extends JFrame implements ActionListener
{
	//Object of class container
	Container c;
	
	//Creating TextFiled
	JTextField txt;
	
	//Constructor of class TextFrame
	TextFrame()
	{
		//Creating Body panel
		c = getContentPane();
		
		//Setting null Layout
		c.setLayout(null);
		
		//Creating one new Text Field
		txt = new JTextField();
		
		//Location and size of button
		txt.setBounds(100,100,200,50);
		
		//Adding button to body
		c.add(txt);
		
		//Adding event by passing object of class in which event of btn is defined
		txt.addActionListener(this);
	}
	
	//It is compulsory to override this function in order to create new event
	public void actionPerformed(ActionEvent e)
	{
		//Getting text of frame
		String tx = txt.getText();
		
		//Changing text to upper case 
		txt.setText(tx.toUpperCase());
	}
}
public class ActionListener2 {
	public static void main(String[] args) {

		TextFrame frame = new TextFrame();

		//Settings Of Frame
		frame.setTitle("Events Handling");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setBounds(100, 70, 400, 400);
		frame.setVisible(true);
		frame.setResizable(false);
	}
}