package ItemListenerEvents;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

class ItemFrame3 extends JFrame implements ItemListener
{
	Container c;
	JCheckBox c1,c2,c3,c4;
	
	JTextArea text;
	ItemFrame3()
	{
		setTitle("Events Handling");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 70, 400, 500);
		setResizable(false);
		
		c= getContentPane();
		c.setLayout(null);
		
		c1 = new JCheckBox("10th Class");
		c1.setBounds(50, 50, 100, 20);
		c2 = new JCheckBox("12th Class");
		c2.setBounds(50, 80, 100, 20);
		c3 = new JCheckBox("UnderGraduate");
		c3.setBounds(50, 110, 100, 20);
		c4 = new JCheckBox("Masters");
		c4.setBounds(50, 140, 100, 20);
		
		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.add(c4);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
		
		
		text = new JTextArea();
		text.setBounds(150,200,200,150);
		c.add(text);
		
		
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(c1.isSelected())
		{
			text.setText("10th Class");
		}
		if(c2.isSelected())
		{
			text.setText(text.getText()+"\n"+"12th Class");
		}
		if(c3.isSelected())
		{
			text.setText(text.getText()+"\n"+"UnderGraduate");
		}
		if(c4.isSelected())
		{
			text.setText(text.getText()+"\n"+"Masters");
		}
	}
}
public class ItemListener3 {
	public static void main(String[] args) {
		ItemFrame3 frame = new ItemFrame3();
	}

}