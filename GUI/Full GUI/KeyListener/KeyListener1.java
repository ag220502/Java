package KeyListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//Events which are generated with Keyboard
class KeyFrame1 extends JFrame implements KeyListener
{
	Container c;
	JTextArea text;
	
	KeyFrame1()
	{
		setTitle("Events Handling - Key Events");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 70, 500, 500);
		setResizable(false);
		
		c = getContentPane();
		c.setLayout(null);

		text = new JTextArea();
		text.setBounds(50,50,300,250);
		c.add(text);
		text.addKeyListener(this);
		setVisible(true);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		text.setText(text.getText()+"\n"+"Key Is Typed : "+e.getKeyChar());	
	}
	@Override
	public void keyPressed(KeyEvent e) {
		text.setText(text.getText()+"\n"+"Key Is Pressed : "+e.getKeyChar());	
	}
	@Override
	public void keyReleased(KeyEvent e) {
		text.setText(text.getText()+"\n"+"Key is Released : "+e.getKeyChar());	
	}
}
public class KeyListener1 {
	public static void main(String[] args) {
		KeyFrame1 frame = new KeyFrame1();
	}
}