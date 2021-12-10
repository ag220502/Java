package AdvanceComponents2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogBoxInJava {
	JFrame frame;
	DialogBoxInJava()
	{
		frame = new JFrame();
		frame.setTitle("JFrame");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		JButton btn = new JButton("Click 1");
		panel.add(btn);
		btn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				JDialog d = new JDialog(frame,"JDialog1");
				d.setSize(200,200);
				d.setVisible(true);
				JPanel panel1 = new JPanel();
				d.add(panel1);
				
				JButton btn1 = new JButton("Click 2");
				panel1.add(btn1);
				btn1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e) {
						
						JDialog d1 = new JDialog(d,"JDialog2");
						d1.setSize(200,200);
						d1.setVisible(true);
						d1.add(new JLabel("This is a second dialogbox"));
					}
				});
			}
		});
	}
	
	public static void main(String[] args) {
		new DialogBoxInJava();

	}

}
