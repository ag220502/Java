package BasicFrames;
import javax.swing.*;
public class BasicFrame {
	public static void main(String[] args) {	
		//Creating object of JFrame
		JFrame frame=new JFrame();

		//Making Frame visible by passing true value
		frame.setVisible(true);
		
		//Exiting the program when we click on Close button
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		//Setting size of frame
		//frame.setSize(1000,200);
		
		//Setting location of Frame
		//frame.setLocation(100,50);
		
		//Setting Size and Location of Frame using one method
		//Left Margin - Top Margin - Width - Height 
		frame.setBounds(100,50,500,300);
		
		//Resizing of Frame
		//If we will pass the true value the user can resize the frame
		frame.setResizable(false);
		
		//Setting Title to frame
		frame.setTitle("First Basic Frame");
		
		//Setting Icon Image to Frame
		ImageIcon img=new ImageIcon("1.png");
		frame.setIconImage(img.getImage());	
	}
}