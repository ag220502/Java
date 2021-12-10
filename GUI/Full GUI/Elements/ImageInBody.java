package Elements;
import java.awt.*;
import javax.swing.*;

public class ImageInBody {

	public static void main(String[] args) {
		//Creating new Frame
		JFrame frame=new JFrame();
		
		//Closing frame when user click on close button
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		//Setting bounds for frame
		frame.setBounds(100, 70, 600, 600);
		
		//Making it non resizable
		frame.setResizable(false);
		
		//Setting title of frame
		frame.setTitle("DropDown Menu Used In Forms");
		
		//Container of frame
		Container c = frame.getContentPane();
		
		//Setting layout to null
		c.setLayout(null);
		
		//Setting background color
		c.setBackground(new Color(255,190,100));
		
		//Creating Image Icon
		ImageIcon img=new ImageIcon("1.png");

		//Creating JLabel icon to display in body
		//JLabel label=new JLabel(img);
		
		//Creating JLabel icon to display img with text in body
		JLabel label=new JLabel("Image Text",img,JLabel.CENTER);
		
		//Setting Dimensions of Image
		//label.setBounds(20, 20, 225, 225);
		label.setBounds(20, 20,300,300);
		
		//Adding label in frame 
		c.add(label);
	}

}
