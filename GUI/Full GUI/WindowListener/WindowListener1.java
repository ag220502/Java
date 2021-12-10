package WindowListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class WindowFrame extends JFrame implements WindowListener
{	
	public WindowFrame(){
		this.addWindowListener(this);
		setVisible(true);	
	}
	public void windowOpened(WindowEvent e) {
		System.out.println("Window Opened");
	}
	public void windowClosing(WindowEvent e) {
		System.out.println("Window Closing");
	}
	public void windowClosed(WindowEvent e) {
		System.out.println("Window Closed");
	}
	public void windowIconified(WindowEvent e) {
		System.out.println("Window Iconified");
	}
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Window Deiconified");
	}
	public void windowActivated(WindowEvent e) {
		System.out.println("Window Activated");
	}
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Window Deactivated");
	}
}
public class WindowListener1 
{
	public static void main(String[] args) 
	{
		WindowFrame frame = new WindowFrame();
		frame.setTitle("Window Listener");
		frame.setBounds(100,100,700,600);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
}