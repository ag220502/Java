package AdvanceComponents2;
import javax.swing.*;
import java.awt.*;
public class DesktopPaneInJava extends JFrame
{	
	JDesktopPane dp;
	DesktopPaneInJava()
	{
		setSize(700,700);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		dp = new JDesktopPane();
		add(dp,BorderLayout.CENTER);
		display(dp);
	}
	private void display(JDesktopPane dp2) {
		int num = 5;
		int x=30,y=30;
		for(int i=0;i<num;i++)
		{
			JInternalFrame frame=new JInternalFrame("Internal Frame"+(i+1),true,true,true,true);
			frame.setBounds(x, y, 250, 100);
			frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
			frame.add(new JLabel("Hello"));
			frame.setVisible(true);
			dp2.add(frame);
			y+=100;
		}
	}
	public static void main(String[] args) {
		new DesktopPaneInJava();
	}
}