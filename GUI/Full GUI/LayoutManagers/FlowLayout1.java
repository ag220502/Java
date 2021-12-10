//Flow Layout - default layout for JPanel
//We don't have to give width as the size of frame increase, it sets automatically. If the width of the frame decreases then the components are shifted to next row 
//It sets width according to content 
package LayoutManagers;
import java.awt.*;
import javax.swing.*;

public class FlowLayout1 {

	public static void main(String[] args) {
		
		//Creating frame
		JFrame frame = new JFrame("Border Layout Example");
		
		//Setting bounds of frame 
		frame.setBounds(100,100,700,600);
		
		//CLosing frame when someone clicks on close button
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		//Container
		Container c = frame.getContentPane();

		//Creating flow layout object
		FlowLayout flow = new FlowLayout(FlowLayout.RIGHT,60,20);
		c.setLayout(flow);
		
		//Creating Buttons
		JButton btn1 = new JButton("Button1");
		JButton btn2 = new JButton("Button2");
		JButton btn3 = new JButton("Button3");
		JButton btn4 = new JButton("Button4");
		JButton btn5 = new JButton("Button5");
		
		//Adding buttons to container
		c.add(btn1);
		c.add(btn2);
		c.add(btn3,0);
		c.add(btn4);
		c.add(btn5,1);
		
		//Making frame visible
		frame.setVisible(true);
	}
}