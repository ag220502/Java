package CaretListener;
import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;

class CaretFrame extends JFrame implements CaretListener
{
	JTextField field;
	JTextArea txt;
	public CaretFrame()
	{
		Container c = getContentPane();
		c.setLayout(null);
		field = new JTextField();
		field.setBounds(100,50,200,30);
		c.add(field);
		field.addCaretListener(this);
		txt = new JTextArea();
		txt.setBounds(100, 100, 400, 400);
		txt.setLineWrap(true);
		c.add(txt);
		setVisible(true);	
	}
	
	public void caretUpdate(CaretEvent e) {
		txt.setText(txt.getText()+"Caret updated : "+e.getDot()+" : "+e.getMark());
	}
}

public class CaretListener1 {

	public static void main(String[] args) {
		CaretFrame frame = new CaretFrame();
		frame.setTitle("Caret Listener");
		frame.setBounds(100,100,700,600);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
}