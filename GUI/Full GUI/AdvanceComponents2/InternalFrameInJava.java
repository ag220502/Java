package AdvanceComponents2;
import javax.swing.*;
import java.awt.*;
public class InternalFrameInJava extends JFrame{
	InternalFrameInJava()
	{
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		JInternalFrame frame = new JInternalFrame("Internal Frame",true,true,true,true);
		
		add(frame);
		inframe(frame);
	}
	
	public void inframe(JInternalFrame frame)
	{
		frame.setSize(300,300);
		frame.setLocation(50,50);
		frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.add(new JButton("Hello"));
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new InternalFrameInJava();
	}
}