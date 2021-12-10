package AdvanceComponents;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MessageDialogBox {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBounds(100,100,700,500);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Plain Message");
		JButton btn1 = new JButton("Information Message");
		JButton btn2 = new JButton("Question Message");
		JButton btn3 = new JButton("Error Message");
		JButton btn4 = new JButton("Warning Message");
		frame.add(btn);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		
		
		btn.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(frame,"Hello there, This is plain message","Message",JOptionPane.PLAIN_MESSAGE);
			}
		});
		btn1.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(frame,"Hello there, This is Information Message","Infroamtion",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btn2.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(frame,"Hello There is a question for you. ","Question",JOptionPane.QUESTION_MESSAGE);
			}
		});
		btn3.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(frame,"Hello There is an error in your code. ","Error",JOptionPane.ERROR_MESSAGE);
			}
		});
		btn4.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(frame,"Hello There is a warning for you. ","Warning",JOptionPane.WARNING_MESSAGE);
			}
		});
		
		frame.setVisible(true);

	}

}
