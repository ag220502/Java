package Elements;
import javax.swing.*;
import java.awt.*;
public class JLabelClass {
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
		
		//JLabel class to set labels in frame
		JLabel label=new JLabel("UserName");

		//By default all things are set in center to change it 
		label.setBounds(50, 50, 400, 50);
		
		//To set new text at same position
		label.setText("Enter Your User Name : ");
				
		//Changing font Styles
		Font font=new Font("Arial",Font.ITALIC,30);
		label.setFont(font);

		//By default we cannot see the label so we have add it to body
		c.add(label);
		
	}
}
