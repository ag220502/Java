package AdvanceComponents2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HTMLEditorPaneInJava extends JFrame{

	JEditorPane pane;
	JButton btn = new JButton("Show Code");
	HTMLEditorPaneInJava()
	{
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		pane =new JEditorPane();

		pane.setContentType("text/html");
		pane.setText(
				"<html>"
						+"<h1 color='red'>Hello World</h1>"
						+"<p color='green'>This is new paragraph</p>"
						+"<hr>"
						+"<ol>"
						+"<li>Item1</li>"
						+"<li>Item2</li>"
						+"<li>Item3</li>"
						+"</ol>"
				+"</html>"
		);
		
		add(pane,BorderLayout.CENTER);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(pane.getText());
				
			}
		});
		add(btn,BorderLayout.PAGE_END);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new HTMLEditorPaneInJava();
	}
}