package AdvanceComponents2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;

public class PlainEditorPane extends JFrame{
	JEditorPane pane;
	PlainEditorPane()
	{
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		pane =new JEditorPane();

		pane.setContentType("text/plain");
		pane.setText("Hello Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
		
		add(pane,BorderLayout.CENTER);
		setVisible(true);
	}
	public static void main(String[] args) {
		new PlainEditorPane();
	}
}