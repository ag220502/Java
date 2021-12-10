package Elements;
import java.awt.*;
import javax.swing.*;

public class RadioButtons {
	public static void main(String[] args) {
		//Creating New Frame
		JFrame frame=new JFrame();
		
		//Setting properties to frame
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		//Setting bounds for frame
		frame.setBounds(100, 70, 600, 600);
		
		//Making it non resizable
		frame.setResizable(false);
		
		//Setting title to frame 
		frame.setTitle("Radio Buttons In Java");
		
		//Creating container for frame 
		Container c = frame.getContentPane();
		
		//Setting null layout 
		c.setLayout(null);
		
		//Background color of frame 
		c.setBackground(new Color(255,190,100));
		
		//Creating Radio Button for male 
		JRadioButton btn = new JRadioButton("Male");
		
		//Setting bounds of radio button
		btn.setBounds(100,100,100,30);
		
		//Adding Radio Button to container
		c.add(btn);
		
		//Making the button selected by default
		btn.setSelected(true);
		
		//Creating Radio Button for female 
		JRadioButton btn1 = new JRadioButton("Female");
		
		//Setting bounds of radio button
		btn1.setBounds(210,100,100,30);
		
		//Adding Radio Button to container
		c.add(btn1);
		
		//Creating Radio Button for others 
		JRadioButton btn2 = new JRadioButton("Others");
		
		//Setting bounds of radio button
		btn2.setBounds(320,100,100,30);
		
		//Adding Radio Button to container
		c.add(btn2);
		
		//Making it disabled so that user cannot select that
		btn2.setEnabled(false);
		
		//Creating one button group for all genders so that the user can only select one
		ButtonGroup gender= new ButtonGroup();
		
		//Adding into button group
		gender.add(btn);
		gender.add(btn1);
		gender.add(btn2);
		
		//Making frame Visible
		frame.setVisible(true);

	}

}
