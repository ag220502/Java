package ItemListenerEvents;

import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

class ItemFrame4 extends JFrame implements ItemListener
{
	Container c;
	JMenuBar menubar;
	JMenu menu;
	JCheckBoxMenuItem item;
	JTextArea text;
	
	ItemFrame4()
	{
		setTitle("Events Handling");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 70, 400, 500);
		setResizable(false);
		
		c = getContentPane();
		c.setLayout(null);
		
		menubar = new JMenuBar();
		menu = new JMenu("File");
		
		item = new JCheckBoxMenuItem("Print");
		menu.add(item);
		menubar.add(menu);
		this.setJMenuBar(menubar);
		
		item.addItemListener(this);
		
		text = new JTextArea();
		text.setBounds(150,200,200,150);
		c.add(text);
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(item.isSelected())
		{
			text.setText("Print is On");
		}
		else
		{
			text.setText("Print is Off");
		}
	}
}
public class ItemListener4 
{
	public static void main(String[] args) {
		ItemFrame4 frame = new ItemFrame4();
	}
}