package AdvanceComponents3;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.event.*;


public class SpinnerInJava extends JFrame implements ChangeListener{

	String[] mon =  {"Jan","Feb","Mar","April","May","June","July","Aug","Sept","Oct","Nov","Dec"};
	JSpinner  s1,s2,s3;
	SpinnerModel m1,m2,m3;
	JLabel label = new JLabel();
	
	SpinnerInJava()
	{
		setSize(500,700);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		m1 = new SpinnerNumberModel(1,1,31,1);
		
		m2 = new SpinnerListModel(mon);
		
		String y = String.valueOf(java.time.Year.now());
		
		int year = Integer.parseInt(y);
		
		m3 = new SpinnerNumberModel(year,year-100,year,1);
		
		s1 = new JSpinner(m1);
		
		s2 = new JSpinner(m2);
		
		s3 = new JSpinner(m3);
		
		s1.setBounds(100,20,100,30);
		s2.setBounds(100,100,100,30);
		s3.setBounds(100,200,100,30);
		
		s1.addChangeListener(this);
		s2.addChangeListener(this);
		s3.addChangeListener(this);
		
		add(s1);
		add(s2);
		add(s3);
		
		set();
		label.setBounds(100,300,400,30);
		add(label);
		
		validate();
	}
	public void set()
	{
		int date =(Integer) s1.getValue();
		int year =(Integer) s3.getValue();
		String month =(String) s2.getValue();
		label.setText("Date Of Birth Is : "+date + " - " +month +" - "+year);
	}
	public void stateChanged(ChangeEvent e) 
	{
		set();
	}
	public static void main(String[] args) 
	{
		new SpinnerInJava();
	}

}
