package Elements;
import java.awt.*;
import javax.swing.*;

public class CheckBox {
	public static void main(String[] args) {
		//Creating New frame
		JFrame frame=new JFrame();
		
		//Closing frame when user click on close button
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		//Setting bounds for frame
		frame.setBounds(100, 70, 600, 600);
		
		//Making it non resizable
		frame.setResizable(false);
		
		//Setting title of frame
		frame.setTitle("Text Area Used In Forms");
		
		//Container of frame
		Container c = frame.getContentPane();
		
		//Setting layout to null
		c.setLayout(null);
		
		//Setting background color
		c.setBackground(new Color(255,190,100));
		
		//Creating Checkbox1
		JCheckBox box1 = new JCheckBox("High School");
		
		//Creating Checkbox2
		JCheckBox box2 = new JCheckBox("Senior School");
		
		//Creating Checkbox3
		JCheckBox box3 = new JCheckBox("Graduation");
		
		//Setting bounds for checkbox1
		box1.setBounds(100, 50, 100, 50);
		
		//Setting bounds for checkbox2
		box2.setBounds(100, 100, 100, 50);
		
		//Setting bounds for checkbox3
		box3.setBounds(100, 150, 100, 50);
		
		//Making it by default selected
		box1.setSelected(true);
		
		//Disabling option
		box2.setEnabled(false);
		
		//Adding to container
		c.add(box1);
		c.add(box2);
		c.add(box3);
		
		frame.setVisible(true);
	}

}
