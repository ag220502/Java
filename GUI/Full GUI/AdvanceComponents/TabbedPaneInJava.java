package AdvanceComponents;

import java.awt.*;

import javax.swing.*;

public class TabbedPaneInJava {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBounds(100,100,700,500);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		JTabbedPane tab = new JTabbedPane();
		tab.setBounds(100, 50, 400, 300);
		
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		panel1.add(new JLabel("Hello akshay here"));
		panel2.add(new JLabel("But akshay is not interedted"));
		panel3.add(new JLabel("So, Bye bye"));
		
		panel1.setBackground(Color.gray);
		
		tab.add("First",panel1);
		tab.add("Second",panel2);
		tab.add("Third",panel3);
		
		frame.add(tab);
		
		frame.setVisible(true);
	}
}