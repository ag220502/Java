package LayoutManagers;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
import javax.swing.*;

public class TestClock extends JFrame 
{
	//Declaring Objects
	private JPanel panel;
	private JLabel hours,mins,secs,amPm;
	private Calendar time;
	
	//Constructor 
	TestClock()
	{
		//Frame Settings 
		setSize(400,200);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Declaring Objects
		panel = new JPanel();
		hours= new JLabel("HH",SwingConstants.CENTER);
		mins= new JLabel("MM",SwingConstants.CENTER);
		secs= new JLabel("SS",SwingConstants.CENTER);
		amPm= new JLabel("AM/PM",SwingConstants.CENTER);
		
		//Adding Panel into frame
		add(panel,BorderLayout.CENTER);
		
		//Setting layout for panel
		panel.setLayout(null);

		//Setting Bounds 
		hours.setBounds(70, 20, 80, 50);
		mins.setBounds(170, 20, 80, 50);
		secs.setBounds(250, 20, 70, 50);
		amPm.setBounds(150, 80, 90, 50);
		
		JLabel[] labels= {hours,mins,secs,amPm};
		//Setting labels
		for(int i=0;i<labels.length;i++){
			labels[i].setForeground(new Color(0,59,93));
			labels[i].setFont(new Font("Serif",Font.ITALIC,36));
			panel.add(labels[i]);
		}
		
		//Making frame visible
		setVisible(true);
		
		
		//For loop for running time
		for(;;)
		{
			//Creating time object 
			time = Calendar.getInstance();
			
			//Setting the text for current time
			String hr=String.valueOf(time.get(Calendar.HOUR_OF_DAY));
			String min=String.valueOf(time.get(Calendar.MINUTE));
			String sec=String.valueOf(time.get(Calendar.SECOND));
			hours.setText(hr + "  : ");
			mins.setText(min + "  : ");
			secs.setText(sec);
			
			//Setting text for am and pm
			if(time.get(Calendar.AM_PM)==0){
				amPm.setText("AM");
			}
			else{
				amPm.setText("PM");
			}
		}
	}
	public static void main(String[] args) {
		new TestClock();
	}
}