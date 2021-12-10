package AdvanceComponents;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ConfirmDialogBox {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBounds(100,100,700,500);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		JButton btn = new JButton("CLick Here");
		frame.add(btn);
				
		btn.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				 int sel = JOptionPane.showConfirmDialog(frame, "Do you want to Exit?","Confirm Message",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
				 if(sel==JOptionPane.YES_OPTION)
				 {
					 System.out.println("Yes message is selected");
					 System.exit(0);
				 }
				 else if(sel ==JOptionPane.NO_OPTION)
				 {
					 System.out.println("No message is selected");
				 }
				 else if(sel ==JOptionPane.CANCEL_OPTION)
				 {
					 System.out.println("Cancel message is selected");
				 }
			}
		});
		frame.setVisible(true);
	}

}
