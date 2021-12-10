package AdvanceComponents;

import java.awt.*;
import javax.swing.*;
public class ScrollPaneInJava 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setBounds(100,100,700,500);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		JTextArea text = new JTextArea(20,30);
		JScrollPane sroll = new JScrollPane(text,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		frame.add(sroll);
		frame.setVisible(true);
	}
}