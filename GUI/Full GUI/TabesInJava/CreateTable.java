package TabesInJava;

import javax.swing.*;
import java.awt.*;
public class CreateTable 
{
	public static void main(String[] args) 
	{		
		JFrame frame = new JFrame();
		frame.setBounds(100,100,700,500);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		String data[][]= {
			{"1","User1","45"},
			{"2","User2","23"},
			{"3","User3","97"}			
		};
		String[] clm = {"Roll No.","Name","Age"};
		JTable table = new JTable(data,clm);		
		frame.add(new JScrollPane(table));
		frame.setVisible(true);
	}
}