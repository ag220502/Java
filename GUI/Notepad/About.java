import javax.swing.*;
import javax.swing.filechooser.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.print.*;
import java.io.*;

public class About extends JFrame implements ActionListener{

	About()
	{
		setBounds(300,100,500,400);
		setLayout(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setResizable(false);
		JLabel label = new JLabel();
		label.setText("NotePad");
		label.setBounds(10,10,300,30);
		add(label);
		JButton btn =  new JButton("Ok");
		add(btn);
		btn.setBounds(200,100,200,30);
		btn.addActionListener(this);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new About().setVisible(true);

	}
	
	public void actionPerformed(ActionEvent e) {
		this.setVisible(false);
	}
}