package AdvanceComponents;

import javax.swing.*;
import java.awt.*;

public class SplitPaneInJava {

	public static void main(String[] args) {
		 JFrame frame = new JFrame();
		frame.setBounds(100,100,700,500);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		frame.setLocationRelativeTo(null);
		
		JButton btn = new JButton("Button 1");
		JButton btn1 = new JButton("Button 2");
		
		JSplitPane pane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		
		pane.setTopComponent(btn1);
		pane.setBottomComponent(btn);
		
		pane.setDividerLocation(100);
		pane.setDividerSize(10);
		pane.setOneTouchExpandable(true);
		
		frame.add(pane);
		frame.validate();
		frame.setVisible(true);
	}
}