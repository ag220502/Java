package AdvanceComponents;

import java.awt.BorderLayout;

import javax.swing.*;


public class SeparatorInMenuInJava extends JFrame{

	SeparatorInMenuInJava()
	{	
		setSize(500,700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JMenuBar menu = new JMenuBar();
		add(menu,BorderLayout.PAGE_START);
		
		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");
		
		menu.add(file);
		menu.add(edit);
		
		JMenuItem item1 = new JMenuItem("New");
		JMenuItem item2 = new JMenuItem("Open");

		JMenuItem edit1 = new JMenuItem("Undo");
		JMenuItem edit2 = new JMenuItem("Redo");
		JMenuItem edit3 = new JMenuItem("Cut");
		JMenuItem edit4 = new JMenuItem("Copy");
		JMenuItem edit5 = new JMenuItem("Paste");
		JMenuItem edit6 = new JMenuItem("Find");
		JMenuItem edit7 = new JMenuItem("Find Next");
		JMenuItem edit8 = new JMenuItem("Find and Replace");
		file.add(item1);
		file.add(item2);

		edit.add(edit1);
		edit.add(edit2);
		edit.add(new JSeparator());
		edit.add(edit3);
		edit.add(edit4);
		edit.add(edit5);
		edit.add(new JSeparator());
		edit.add(edit6);
		edit.add(edit7);
		edit.add(edit8);
		
		setVisible(true);
		validate();
	}
	public static void main(String[] args) {
		new SeparatorInMenuInJava();

	}

}