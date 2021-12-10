package TabesInJava;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

public class TableUsingDefaultModel 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setBounds(100,100,700,500);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
			
		String data[][]=
		{
			{"1","Akshay","18"},
			{"2","Sana","18"},
			{"3","Bachi","17"}				
		};
		String[] clm = {"Roll No.","Name","Age"};
		
		DefaultTableModel model = new DefaultTableModel(data,clm);
		JTable table = new JTable(model);
		
		JTextField txt1,txt2,txt3;
		JButton btn1,btn2,btn3;
		JPanel panel= new JPanel();
		
		frame.setLayout(new GridLayout(3,1));
		frame.add(new JScrollPane(table));
		frame.add(new JPanel());
		frame.add(panel);
		
		txt1 = new JTextField();
		txt2 = new JTextField();
		txt3 = new JTextField();
		
		btn1 = new JButton("Add");
		btn2 = new JButton("Update");
		btn3 = new JButton("Delete");
		
		panel.setLayout(new GridLayout(3,3));
		
		panel.add(new JLabel("Roll No."));
		panel.add(txt1);
		panel.add(btn1);
		
		panel.add(new JLabel("Name"));
		panel.add(txt2);
		panel.add(btn2);
		
		panel.add(new JLabel("Age"));
		panel.add(txt3);
		panel.add(btn3);
		
		btn1.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e) 
				{	
					if(txt1.getText().toString().isEmpty() || txt2.getText().toString().isEmpty() || txt3.getText().toString().isEmpty())
					{
						JOptionPane.showMessageDialog(null, "Please Enter all the fields","Error Message",JOptionPane.ERROR_MESSAGE);
					}
					else
					{
						int roll = Integer.parseInt(txt1.getText().toString());
						String name = txt2.getText().toString();
						int age = Integer.parseInt(txt3.getText().toString());
						Object[] row = {roll,name,age};
						model.addRow(row);
						
						txt1.setText(null);
						txt2.setText(null);
						txt3.setText(null);
					}	
				}
			}
		);
		frame.setVisible(true);
		frame.validate();
		
		
		table.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				int row = table.getSelectedRow();
				int roll = (int)model.getValueAt(row, 0);
				int age = (int)model.getValueAt(row, 2);
				String name = (String)model.getValueAt(row,1);
				txt1.setText(String.valueOf(row));
				txt2.setText(name);
				txt3.setText(String.valueOf(age));
			}
		});
	}
}