package AdvanceComponents2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class JListInJava1 extends JFrame {
	JListInJava1()
	{
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		String[] arr = {"item1","item2","item3","item4","item5","item6","item7","item8","item9"};
		
		JList list = new JList(arr);
		list.setVisibleRowCount(5);
		JPanel panel= new JPanel();
		panel.add(new JScrollPane(list));
		revalidate();
		add(panel);
		JLabel label= new JLabel();
		panel.add(label);
		list.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e)
			{
				if(e.getClickCount()==2)
				{
					int i = list.getSelectedIndex();
					String item = (String)list.getSelectedValue();
					label.setText(item);
				}
			}
		});
		
	}
	public static void main(String[] args) {
		new JListInJava1();

	}

}
