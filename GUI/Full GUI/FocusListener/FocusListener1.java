package FocusListener;
//Which listenes to focus
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class FocusFrame extends JFrame implements FocusListener
{
	JTextField field;
	JTextArea txt;
	public FocusFrame()
	{
		Container c = getContentPane();
		c.setLayout(null);
		field = new JTextField();
		field.setBounds(100,50,200,30);
		c.add(field);
		field.addFocusListener(this);
		txt = new JTextArea();
		txt.setBounds(100, 100, 400, 400);
		txt.setLineWrap(true);
		c.add(txt);
		setVisible(true);
		
	}
	public void focusGained(FocusEvent e) {
		txt.setText(txt.getText()+"Focus Gained");
		
	}
	
	public void focusLost(FocusEvent e) {
		txt.setText(txt.getText()+"Focus Lost");
	}
	
}

public class FocusListener1 {

	public static void main(String[] args) {
		FocusFrame frame = new FocusFrame();
		frame.setTitle("Focus Listener");
		frame.setBounds(100,100,700,600);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

	}

}
