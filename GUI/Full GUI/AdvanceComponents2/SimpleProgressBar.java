package AdvanceComponents2;

import javax.swing.*;
import java.awt.*;

public class SimpleProgressBar extends JFrame
{
	SimpleProgressBar()
	{
		setSize(500,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		 
		JProgressBar bar = new JProgressBar(0,100);
		
		add(bar);
		bar.setStringPainted(true);
		//bar.setOrientation(SwingConstants.VERTICAL);
		int i=0;
		while(i<=100)
		{
			/*if(i>0 && i<=50)
			{
				bar.setString("Processing");
			}
			else if(i>50 && i<70)
			{
				bar.setString("Wait for some time.");
			}
			else if(i>70 && i<90)
			{
				bar.setString("About to complete.");
			}
			else if(i==100)
			{
				bar.setString("Finished");
			}*/
			
			bar.setValue(i);
			try
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			i+=10;
		}
	}
	public static void main(String[] args) 
	{
		new SimpleProgressBar();
	}
}