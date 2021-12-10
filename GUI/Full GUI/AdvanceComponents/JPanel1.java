package AdvanceComponents;

import javax.swing.*;
import java.awt.*;

public class JPanel1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setBounds(100,50,700,500);
		frame.setTitle("JPanel Example");
		
		Container c = frame.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.WHITE);
		
		JPanel panel = new JPanel();
		panel.setBounds(50, 50, 400, 300);
		c.add(panel);
		panel.setBackground(Color.green);
		
		JButton btn = new JButton("Hello");
		panel.add(btn);
		
		frame.setVisible(true);
	}
}