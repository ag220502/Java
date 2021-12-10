package LayoutManagers;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class TestProgress extends JFrame 
{
	//Declaring objects and array
	private JLabel lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8,lbl9,lbl10,lbl11;
	
	//Constructor
	TestProgress()
	{
		//Frame Settings
		setSize(200,770);
		setLocationRelativeTo(null);
		setTitle("Progrss");
		setResizable(false);
		setLayout(new GridLayout(11,1));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Declaring Labels
		lbl1 = new JLabel();
		lbl2 = new JLabel();
		lbl3 = new JLabel();
		lbl4 = new JLabel();
		lbl5 = new JLabel();
		lbl6 = new JLabel();
		lbl7 = new JLabel();
		lbl8 = new JLabel();
		lbl9 = new JLabel();
		lbl10 = new JLabel();
		lbl11 = new JLabel("0%",SwingConstants.CENTER);

		//Setting font for Label 11
		lbl11.setFont(new Font("Arial",Font.BOLD,26));

		JLabel[] label = {lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8,lbl9,lbl10};
		//For loop for label settings
		for(int i=0;i<label.length;i++)
		{
			label[i] = new JLabel();
			label[i].setBackground(Color.red);
			label[i].setOpaque(true);
			add(label[i]);	
		}
		//Adding label 11
		add(lbl11);
		
		// Making Frame visible	
		setVisible(true);
		
		//Scanner Object 
		Scanner scan = new Scanner(System.in);
		
		//Taking Input
		String input ="";
		int tmp=0;
		
		//For taking multiple Inputs
		for(int i=0;i<10;i++){
			input = scan.nextLine();
			if(input!=null)
			{
				
				label[i].setBackground(Color.green);
				label[i].setOpaque(true);
			}
			tmp+=10;
			lbl11.setText(tmp+"%");
		}
	}
	public static void main(String[] args) 
	{
		new TestProgress();
	}
}