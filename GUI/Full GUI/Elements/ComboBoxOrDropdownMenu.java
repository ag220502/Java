package Elements;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBoxOrDropdownMenu 
{
	
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
				
		//Values for Dropdown Menu
		String[] values = {"A","B","C","D","E"};
		
		//Creating menu
		JComboBox box = new JComboBox(values);
		
		//Setting bounds of menu
		box.setBounds(100,50,200,50);
		
		//Setting C to selected
		box.setSelectedItem("C");
		
		//Selecting by default using index 
		//box.setSelectedIndex(4);
		
		//Adding Item
		box.addItem("F");
		
		//Removing Item
		box.removeItem("B");
		
		//Adding to container
		c.add(box);
		
		
		
		//Creating New Button
		JButton btn = new JButton("Click Here");
		//setting bounds of button 
		btn.setBounds(200, 200, 200, 50);
		
		
		
		
		
		
		JLabel txt = new JLabel();
		txt.setBounds(100, 400, 400, 50);
		
		
		
		
		c.add(btn);
		c.add(txt);
		
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String item=(String)box.getSelectedItem();
				String item1= String.valueOf(box.getSelectedIndex());
				txt.setText(item);
				
			}
		});
		frame.setVisible(true);

	}
	

}
