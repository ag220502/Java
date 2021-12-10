package ItemListenerEvents;
//2. Item Listener - when we click on combo box,check box,radio 

//Steps to use Item Listener
//1 - implement ItemListener Interface
//2 - override void itemStateChanged() method
//3 - Call ddItemListener() method

//JComboBox in ItemListener
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ItemFrame1 extends JFrame implements ItemListener
{
	Container c;
	JComboBox box;
	JTextArea text;
	ItemFrame1()
	{
		setTitle("Events Handling");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 70, 400, 400);
		setResizable(false);
		
		c= getContentPane();
		c.setLayout(null);
		String[] val = {"A","B","C"};
		box = new JComboBox(val);
		
		box.setBounds(100,100,200,30);
		c.add(box);
		box.addItemListener(this);
		
		text = new JTextArea();
		text.setBounds(100,200,200,30);
		c.add(text);
	
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent e)
	{
		text.setText(box.getSelectedItem().toString());
	}
}

public class ItemListener1 {
	public static void main(String[] args) {
		ItemFrame1 frame = new ItemFrame1();
	}
}
