package AdvanceComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxMenuItem extends JFrame{
	
	//Creating menu Items
	JMenuItem item1 = new JMenuItem("New");
	JMenuItem item2 = new JMenuItem("Open");
	JMenuItem item3 = new JMenuItem("Undo");
	JMenuItem item4 = new JMenuItem("Redo");
	//Creating checkbox menu item
	JCheckBoxMenuItem item5 = new JCheckBoxMenuItem("Word Wrap");
	//Creating text area
	JTextArea txt = new JTextArea("Hello Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
	
	public CheckBoxMenuItem()
	{
		//Frame Setting
		setSize(500,700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		//
		JMenuBar menu = new JMenuBar();
		
		add(menu,BorderLayout.PAGE_START);		
		
		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");
		JMenu format = new JMenu("Format");
		
		menu.add(file);
		menu.add(edit);
		menu.add(format);
		
		file.add(item1);
		file.add(item2);
		edit.add(item3);
		edit.add(item4);
		format.add(item5);
		
		add(txt);
		
		item5.addActionListener(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e) 
				{
					if(item5.isSelected())
					{
						txt.setLineWrap(true);
						txt.setWrapStyleWord(true);
					}
					else
					{
						txt.setLineWrap(false);
						txt.setWrapStyleWord(false);
					}
				}
			}
		);
		setVisible(true);
		validate();
	}
	public static void main(String[] args) 
	{
		new CheckBoxMenuItem();
	}
}