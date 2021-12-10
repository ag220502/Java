package MouseListeners;
//Which listens to mouse events
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MouseFrame1 extends JFrame implements MouseListener
{
	JLabel label;
	JTextArea txt;
	public MouseFrame1()
	{
		Container c = getContentPane();
		c.setLayout(null);
		label = new JLabel("New Label");
		label.setBounds(100,50,200,30);
		c.add(label);
		txt = new JTextArea();
		txt.setBounds(100, 100, 200, 200);
		c.add(txt);
		setVisible(true);
		label.addMouseListener(this);
	}
	//When Mouse Is Clicked
	public void mouseClicked(MouseEvent e) 
	{
		txt.setText(txt.getText()+"\nMouse Is Clicked");
	}
	//When Mouse Is Entered
	public void mouseEntered(MouseEvent e)
	{
		txt.setText(txt.getText()+"\nMouse Enetered");
	}
	//When Mouse Is Exited
	public void mouseExited(MouseEvent e)
	{
		txt.setText(txt.getText()+"\nMouse Exited");
	}
	//When mouse is pressed
	public void mousePressed(MouseEvent e)
	{
		txt.setText(txt.getText()+"\nMouse Is Pressed");
	}
	//When mouse is Released
	public void mouseReleased(MouseEvent e) 
	{
		txt.setText(txt.getText()+"\nMouse Released");
	}
}
public class MouseListener1 {
	public static void main(String[] args) 
	{
		MouseFrame1 frame = new MouseFrame1();
		frame.setTitle("Mouse Listener");
		frame.setBounds(100,100,700,600);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
}