package MouseListeners;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

//Listen to events when mouse is moved

class MouseMotionFrame1 extends JFrame implements MouseMotionListener
{
	JLabel label;
	JTextArea txt;
	public MouseMotionFrame1()
	{
		Container c = getContentPane();
		c.setLayout(null);
		label = new JLabel("New Label");
		label.setBounds(100,50,200,30);
		c.add(label);
		txt = new JTextArea();
		txt.setBounds(100, 100, 400, 400);
		txt.setLineWrap(true);
		c.add(txt);
		setVisible(true);
		label.addMouseMotionListener(this);
	}
	public void mouseDragged(MouseEvent e) {
		
		txt.setText("Mouse Dragged");
	}
	//When mouse is moved
	public void mouseMoved(MouseEvent e) {
		txt.setText("Mouse Moved");	
	}
}
public class MouseMotionListener1 
{
	public static void main(String[] args) 
	{
		MouseMotionFrame1 frame = new MouseMotionFrame1();
		frame.setTitle("Mouse Motion Listener");
		frame.setBounds(100,100,700,600);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
}