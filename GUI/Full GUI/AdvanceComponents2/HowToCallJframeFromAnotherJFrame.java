package AdvanceComponents2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class frames implements ActionListener
{
	JFrame frame,frame1;
	JTextField txt = new JTextField();
	JButton btn = new JButton("Click Here");
	JLabel label= new JLabel("Hello there");
	JButton btn1 = new JButton("Submit");
	JPanel panel1 = new JPanel();
	frames()
	{
		frame = new JFrame();
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.add(btn);
		panel.add(label);
		frame.add(panel);
		btn.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("Click Here"))
		{
			frame.dispose();
			frame1 = new JFrame("Enter your message");
			frame1.setSize(500,500);
			frame1.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
			frame1.setLocationRelativeTo(frame);
			frame1.setVisible(true);
			txt.setColumns(20);
			panel1.add(txt);
			panel1.add(btn1);
			frame1.add(panel1); 
			btn1.addActionListener(this);
		}
		else if(e.getActionCommand().equals("Submit"))
		{
			frame1.dispose();
			String msg = txt.getText().toString();
			label.setText(msg);
			frame.setVisible(true);
		}
	}
}
public class HowToCallJframeFromAnotherJFrame {
	public static void main(String[] args) 
	{
		frames frame = new frames();
	}
}
