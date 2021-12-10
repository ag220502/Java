package Elements;
import java.awt.*;

import javax.swing.*;

public class MenuBar {

	public static void main(String[] args) {
		//Creating new Frame
		JFrame frame=new JFrame();
		
		//Closing frame when user click on close button
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		//Setting bounds for frame
		frame.setBounds(100, 70, 600, 600);
		
		//Making it non resizable
		frame.setResizable(false);
		
		//Setting title of frame
		frame.setTitle("DropDown Menu Used In Forms");
		
		//Container of frame
		Container c = frame.getContentPane();
		
		//Setting layout to null
		c.setLayout(null);
		
		//Setting background color
		c.setBackground(new Color(255,190,100));

		//Creating Menu Bar 
		JMenuBar menubar=new JMenuBar();
		
		//Creating File Menu
		JMenu file = new JMenu("File");
		
		//Creating Edit Menu
		JMenu edit = new JMenu("Edit");
		
		//Creating elements of File Menu 
		JMenuItem item1 = new JMenuItem("New File");
		JMenuItem item2 = new JMenuItem("Open File");
		JMenuItem item3 = new JMenuItem("Save");
		JMenuItem item4 = new JMenuItem("Save As");
		
		//Creating elements of Edit Menu
		JMenuItem edit1 = new JMenuItem("Undo");
		JMenuItem edit2 = new JMenuItem("Redo");
		JMenuItem edit3 = new JMenuItem("Cut");
		JMenuItem edit4 = new JMenuItem("Copy");
		JMenuItem edit5 = new JMenuItem("Paste");
		
		//Adding elements to file menu
		file.add(item1);
		file.add(item2);
		file.add(item3);
		file.add(item4);
		
		//Adding elements to Edit Menu
		edit.add(edit1);
		edit.add(edit2);
		edit.add(edit3);
		edit.add(edit4);
		edit.add(edit5);
		
		//Adding Menus to Menubar
		menubar.add(file);
		menubar.add(edit);
		
		//Adding edit menu to file menu
		file.add(edit);
		
		//Adding MenuBar to Frame
		frame.setJMenuBar(menubar);		
		
		//Making frame visible
		frame.setVisible(true);
	}
}