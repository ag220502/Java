package AdvanceComponents2;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;


public class SliderInJava extends JFrame implements ChangeListener
{
	JSlider s;
	JLabel label;
	SliderInJava()
	{
		setSize(500,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		s=new JSlider();
		add(s);
		
		s.setMinimum(0); 
		s.setMaximum(200);
		s.setPaintTicks(true);
		s.setPaintLabels(true);
		s.setMajorTickSpacing(50);
		s.setMinorTickSpacing(5);
		s.addChangeListener(this);
		//s.setOrientation(SwingConstants.VERTICAL);
		
		
		
		label = new JLabel();
		label.setText("The Value you have selected is : "+s.getValue());
		
		add(label);
	}
	public static void main(String[] args) {
		new SliderInJava();

	}
	
	public void stateChanged(ChangeEvent e) {
		
		label.setText("The Value you have selected is : "+s.getValue());
	}

}
