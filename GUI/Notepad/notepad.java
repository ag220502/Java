import javax.swing.*;
import javax.swing.filechooser.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.print.*;
import java.io.*;

public class notepad extends JFrame implements ActionListener 
{

	//Menubar for menu
	JMenuBar menubar= new JMenuBar();
	
	//All menus of frame
	JMenu file,edit,help;
	
	//All menu items 
	JMenuItem newfile,open,save,print,exit;
	JMenuItem cut,copy,paste,select;
	JMenuItem about;
	
	//TextArea for writing in document
	JTextArea text;
	//ScrollPane for adding scrolling text area
	JScrollPane pane;
	
	String copytext="";
	//Constructor of class 
	notepad()
	{
		//Setting bounds of frame
		setBounds(10,0,1400,800);
		
		//terminating program when user clicks on close button 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Making frame non resizable
		setResizable(false);
		
		//Creating All Menus
		file = new JMenu("File");
		edit = new JMenu("Edit");
		help = new JMenu("Help");
		
		//Creating Menu Items for File Menu
		newfile = new JMenuItem("New File");
		open = new JMenuItem("Open");
		save = new JMenuItem("Save");
		print = new JMenuItem("Print");
		exit = new JMenuItem("Exit");
		
		//Adding Key Shortcuts for File Menu Items
		newfile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
		open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));
		save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
		print.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
		exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE,0));
		
		//Creating Menu Items for Edit Menu
		cut = new JMenuItem("Cut");
		copy = new JMenuItem("Copy");
		paste = new JMenuItem("Paste");
		select = new JMenuItem("Select All");
		
		//Adding Key Shortcuts for Edit Menu Items
		cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
		copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
		paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,ActionEvent.CTRL_MASK));
		select.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
		
		//Creating Menu Items for Help Menu
		about = new JMenuItem("About");
		
		//Adding Key Shortcuts for Help Menu Items
		cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.CTRL_MASK));
		
		//Adding All MenuItems of File Menu To Menu
		file.add(newfile);
		file.add(open);
		file.add(save);
		file.add(print);
		file.add(exit);
		
		//Adding All MenuItems of Edit Menu To Menu		
		edit.add(select);
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		
		//Adding All MenuItems of Edit Menu To Menu
		help.add(about);
		
		//Adding all Menus to MenuBar
		menubar.add(file);
		menubar.add(edit);
		menubar.add(help);
		
		//Adding MenuBar to Frame
		setJMenuBar(menubar);
		
		//Creating object of Text Area
		text = new JTextArea();
		
		//Setting fonts for TextArea
		text.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
		
		//Creating object of scrolling pane and adding text area into it
		pane = new JScrollPane(text);
		
		//Adding Empty Border to ScrollingPane
		pane.setBorder(BorderFactory.createEmptyBorder());
		
		//Adding Properties of TextArea
		text.setLineWrap(true);
		text.setWrapStyleWord(true);
		
		//Adding Scrolling Pane to Frame
		add(pane,BorderLayout.CENTER);

		//Adding Action Listener Property to all MenuItems
		newfile.addActionListener(this);
		open.addActionListener(this);
		save.addActionListener(this);
		print.addActionListener(this);
		exit.addActionListener(this);
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		select.addActionListener(this);
		about.addActionListener(this);
		
		//Making Frame Visible
		setVisible(true);
		
	}
	
	//Action Performed method to Handling Events
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getActionCommand().equals("New File"))
		{
			text.setText("");
		}
		else if(e.getActionCommand().equals("Open"))
		{
			//File Chooser for saving file
			JFileChooser ofile = new JFileChooser();
			//Applying all filter to not select
			ofile.setAcceptAllFileFilterUsed(false);
			FileNameExtensionFilter filter=  new FileNameExtensionFilter("Only .txt Files","txt");
			ofile.addChoosableFileFilter(filter);
			
			//Opening Dialog
			int action = ofile.showOpenDialog(this);
			
			//If the option selected is not Approved button
			if(action!=JFileChooser.APPROVE_OPTION)
			{
				return;
			}
			
			File file = ofile.getSelectedFile();
			BufferedReader rfile=null;
			try
			{
				rfile = new BufferedReader(new FileReader(file));
				text.read(rfile,null);
			}
			catch(Exception ae)
			{
				
			}
			
		}
		else if(e.getActionCommand().equals("Save"))
		{
			//File CHooser for saving file
			JFileChooser file = new JFileChooser();
			
			//Setting new Approval Button as Save Button
			file.setApproveButtonText("Save");
			
			//Opening Dialog
			int action = file.showOpenDialog(this);
			
			//If the option selected is not Approved button
			if(action!=JFileChooser.APPROVE_OPTION)
			{
				return;
			}
			//Giving File Name
			File filename = new File(file.getSelectedFile()+".txt");
			//Creating object of Buffered Reader
			BufferedWriter wfile = null;
			try
			{
				//Writing into file 
				wfile = new BufferedWriter(new FileWriter(filename));
				text.write(wfile);
			}
			catch(Exception ae)
			{
				System.out.println();
			}			
		}
		else if(e.getActionCommand().equals("Print"))
		{
			try 
			{
				text.print();
			}
			catch (PrinterException e1) 
			{
				e1.printStackTrace();
			}
		}
		
		else if(e.getActionCommand().equals("Exit"))
		{
			System.exit(0);
		}
		else if(e.getActionCommand().equals("Cut"))
		{

			copytext = text.getSelectedText();
			text.replaceRange("", text.getSelectionStart(), text.getSelectionEnd());
		}
		else if(e.getActionCommand().equals("Copy"))
		{
			copytext = text.getSelectedText();
		}
		else if(e.getActionCommand().equals("Paste"))
		{
			text.insert(copytext,text.getCaretPosition());
		}
		else if(e.getActionCommand().equals("Select All"))
		{
			text.selectAll();
		}
		else if(e.getActionCommand().equals("About"))
		{
			new About().setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new notepad().setVisible(true);
	}

	
}