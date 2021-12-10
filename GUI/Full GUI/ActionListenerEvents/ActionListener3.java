package ActionListenerEvents;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Example Of clicking on menu Item
class MenuFrame extends JFrame implements ActionListener
{
	//Object of class container
	Container c;
	//Constructor of class Frame
	//Creating one new menu bar
	JMenuBar menubar;
	//Creating File Menu
	JMenu file;
	//Creating Edit Menu
	JMenu edit;
	JMenuItem item1,item2,item3,item4;
	JMenuItem edit1,edit2,edit3,edit4,edit5;
	JTextArea txt;
	
	MenuFrame()
	{
		//Creating Body panel
		c = getContentPane();
		//Setting null Layout
		c.setLayout(null);
		
		//Creating one new menu bar
		menubar=new JMenuBar();
		//Creating File Menu
		file = new JMenu("File");
		//Creating Edit Menu
		edit = new JMenu("Edit");
		//Creating elements of File Menu 
		item1 = new JMenuItem("New File");
		item2 = new JMenuItem("Open File");
		item3 = new JMenuItem("Save");
		item4 = new JMenuItem("Save As");
		
		item1.addActionListener(this);
		item2.addActionListener(this);
		item3.addActionListener(this);
		item4.addActionListener(this);
		
		//Creating elements of Edit Menu
		edit1 = new JMenuItem("Undo");
		edit2 = new JMenuItem("Select All");
		edit3 = new JMenuItem("Cut");
		edit4 = new JMenuItem("Copy");
		edit5 = new JMenuItem("Paste");
		
		edit1.addActionListener(this);
		edit2.addActionListener(this);
		edit3.addActionListener(this);
		edit4.addActionListener(this);
		edit5.addActionListener(this);
		
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
		//file.add(edit);
		//Adding MenuBar to Frame
		this.setJMenuBar(menubar);	
		
		txt = new JTextArea();
		txt.setBounds(10,10,270,200);
		txt.setLineWrap(true);
		c.add(txt);
	}
	//It is compulsory to override this function in order to create new event
	public void actionPerformed(ActionEvent e)
	{
		//String tx = txt.getText();
		if(e.getSource()==item1)
		{
			txt.setText("New File");
		}
		else if(e.getSource()==item2)
		{
			txt.setText("Open File");
		}
		else if(e.getSource()==item3)
		{
			txt.setText("Save File");
		}
		else if(e.getSource()==item4)
		{
			txt.setText("Save As File");
		}
		else if(e.getSource()==edit1)
		{
			txt.setText("Undo Command");
		}
		else if(e.getSource()==edit2)
		{
			txt.selectAll();
		}
		else if(e.getSource()==edit3)
		{
			txt.cut();
		}
		
		else if(e.getSource()==edit4)
		{
			txt.copy();
		}
		else if(e.getSource()==edit5)
		{
			txt.paste();
		}		
	}
}
public class ActionListener3 
{
	public static void main(String[] args) {
		MenuFrame frame = new MenuFrame();
		//Settings Of Frame
		frame.setTitle("Events Handling");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setBounds(100, 70, 400, 400);
		frame.setVisible(true);
		frame.setResizable(false);
	}
}