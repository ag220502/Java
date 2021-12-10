package AdvanceComponents3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WndowInJava extends JFrame implements ActionListener
{
	WndowInJava()
	{
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		JPanel panel = new JPanel();
		JButton btn = new JButton("Click Me");
		panel.add(btn);
		add(panel);
		btn.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) 
	{
		JWindow w = new JWindow(this);
		w.setSize(500,500);
		w.setLocation(100,100);
		w.setLocationRelativeTo(null);
		w.setVisible(true);
		JPanel panel = new JPanel();
		panel.setBackground(Color.green);
		panel.setBorder(BorderFactory.createLineBorder(Color.red));
		panel.add(new JLabel("Hello"));
		w.add(panel);
		w.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				if(e.getClickCount()==2)
				{
					w.dispose();	
				}
			}
		});
	}
	public static void main(String[] args) {
		new WndowInJava();	
	}
}