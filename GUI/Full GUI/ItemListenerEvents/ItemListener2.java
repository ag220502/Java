package ItemListenerEvents;
//Steps to use Item Listener
//1 - implement ItemListener Interface
//2 - override void itemStateChanged() method
//3 - Call ddItemListener() method

//JComboBox in ItemListener
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ItemFrame2 extends JFrame implements ItemListener
{
	Container c;
	JTextArea text;
	JRadioButton male,female;
	ItemFrame2()
	{
		setTitle("Events Handling");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 70, 400, 400);
		setResizable(false);
		
		c= getContentPane();
		c.setLayout(null);
		
		male = new JRadioButton("Male");
		female = new JRadioButton("Female");
		male.setBounds(100,100,80,30);
		female.setBounds(100,150,80,30);
		c.add(male);
		c.add(female);
		ButtonGroup grp = new ButtonGroup();
		
		grp.add(male);
		grp.add(female);
		
		male.addItemListener(this);
		female.addItemListener(this);
		
		text = new JTextArea();
		text.setBounds(100,200,200,30);
		c.add(text);
		
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent e)
	{
		String gen="others";
		if(e.getSource()==male)
		{
			gen="Male";
		}
		else if(e.getSource()==female)
		{
			gen="Female";
		}
		text.setText(gen);
	}
}
public class ItemListener2 {
	public static void main(String[] args) {
		ItemFrame2 frame = new ItemFrame2();
	}
}