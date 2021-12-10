package BasicFrames;
import javax.swing.*;
import java.awt.*;

public class BodyOfFrame {
	public static void main(String[] args) {
		//Creating new frame
		JFrame frame=new JFrame();
		
		//Making it visible
		frame.setVisible(true);
		
		//Closing when user clicks on close button
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		//Setting Bounds to image
		frame.setBounds(100, 70, 500, 300);
		
		//Making it non resizable
		frame.setResizable(false);
		
		//Giving name to frame
		frame.setTitle("Editing Body Contents");

		//Making One container for body of frame
		Container c = frame.getContentPane();
		
		//Setting background colour of body
		//Also, we can use new Color(255,0,0)
		c.setBackground(Color.RED);
		//c.setBackground(new Color(255,190,100));
		
	}
}
