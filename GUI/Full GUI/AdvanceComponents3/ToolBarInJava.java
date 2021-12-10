package AdvanceComponents3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBarInJava implements ActionListener{
	
	String[] val = {"Hello","Hii","Bye"};
	JToolBar tool = new JToolBar();
	JButton btn = new JButton("Button1");
	JButton btn1 = new JButton("Button1");
	JTextField txt = new JTextField();
	JComboBox box = new JComboBox(val);
	JLabel label = new JLabel();
	ToolBarInJava()
	{
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		tool.add(box);
		tool.add(txt);

		tool.add(new JSeparator());
		tool.add(btn);
		tool.add(btn1);
		
		//tool.setFloatable(false);
		
		frame.add(tool,BorderLayout.PAGE_START);
		frame.revalidate(); 
		
		btn.addActionListener(this);
		box.addActionListener(this);
		btn1.addActionListener(this);
		txt.addActionListener(this);
		
		frame.add(label);
	}
	
	public static void main(String[] args)
	{
	new ToolBarInJava();	
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn)
		{
			label.setText("Button 1 is clicked");
		}
		else if(e.getSource()==btn1)
		{
			label.setText("Button 2 is clicked");
		}
		else if(e.getSource()==box)
		{
			label.setText(box.getSelectedItem()+"  is clicked");
		}
		else if(e.getSource()==txt)
		{
			label.setText("Enter is pressed");
		}
		
	}
}
