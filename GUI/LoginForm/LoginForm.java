package SmallProjects;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Login1 extends JFrame implements ActionListener
{
	private Container c;
	private JLabel heading;
	private JLabel num1,num2;
	private JTextField no1,no2;
	private JButton add,sub,div,mul;
	private JLabel result;
	Login1()
	{
		setTitle("Calculator");
		
		setBounds(100,70,600,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
	
		c=getContentPane();
		c.setLayout(null);
		c.setBackground(new Color(255,190,100));
		
		//Heading For the Calculator
		heading= new JLabel("Calculator");
		heading.setBounds(200, 30, 400, 50);
		c.add(heading);
		heading.setFont(new Font("Arial",Font.BOLD,30));
		
		//Asking Input Of first Number
		num1= new JLabel("Enter First Number ");
		num1.setBounds(50, 100, 300, 50);
		num1.setFont(new Font("Arial",Font.PLAIN,19));
		c.add(num1);
		//Input For first number
		no1=new JTextField();
		no1.setBounds(350, 110, 100, 30);
		c.add(no1);
		
		//Asking Input Of Second Number
		num2= new JLabel("Enter Second Number ");
		num2.setBounds(50, 150, 300, 50);
		num2.setFont(new Font("Arial",Font.PLAIN,19));
		c.add(num2);
		//Input For Second number
		no2=new JTextField();
		no2.setBounds(350, 160, 100, 30);
		c.add(no2);
		
		//Button For Adding Two Numbers
		add = new JButton("Addition");
		add.setBounds(50,250, 120, 40);
		c.add(add);
		//Button For Subtraction Two Numbers
		sub = new JButton("Subtraction");
		sub.setBounds(170, 250, 120, 40);
		c.add(sub);
		//Button For Multiplication Two Numbers
		mul = new JButton("Multiplication");
		mul.setBounds(290, 250, 120, 40);
		c.add(mul);
		//Button For Division Two Numbers
		div = new JButton("Division");
		div.setBounds(410, 250, 120, 40);
		c.add(div);
		
		//
		result = new JLabel("Result : ");
		result.setBounds(50, 350, 300, 50);
		result.setFont(new Font("Arial",Font.PLAIN,19));
		c.add(result);
		
		setVisible(true);
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			if(e.getSource()==add)
			{
				int n1 = Integer.parseInt(no1.getText());
				int n2 = Integer.parseInt(no2.getText());
				int n=n1+n2;
				result.setText("Result : "+n);
			}
			else if(e.getSource()==sub)
			{
				int n1 = Integer.parseInt(no1.getText());
				int n2 = Integer.parseInt(no2.getText());
				int n=n1-n2;
				result.setText("Result : "+n);
			}
			else if(e.getSource()==mul)
			{
				int n1 = Integer.parseInt(no1.getText());
				int n2 = Integer.parseInt(no2.getText());
				int n=n1*n2;
				result.setText("Result : "+n);
			}
			else if(e.getSource()==div)
			{
				int n1 = Integer.parseInt(no1.getText());
				int n2 = Integer.parseInt(no2.getText());
				int n=n1/n2;
				result.setText("Result : "+n);
			}
		}
		catch(NumberFormatException e1)
		{
			result.setText("Please Input Numbers Only...");
			
		}
		catch(ArithmeticException e2)
		{
			result.setText("Numbers Cannot Be Divided By Zero...");
		}
	}
}

public class LoginForm {
	public static void main(String[] args) {
		Login1 frame = new Login1();
	}
}
