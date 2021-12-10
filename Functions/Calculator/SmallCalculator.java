import java.util.*;
public class SmallCalculator {
	public static void Addition(int a, int b)
	{
		int c=a+b;
		System.out.println(a +" + "+b+" : "+c);
	}
	public static void Sub(int a,int b)
	{
		double c=a-b;
		System.out.println(a +" - "+b+" : "+c);
	}
	public static void Mul(int a,int b)
	{
		double c=a*b;
		System.out.println(a +" * "+b+" : "+c);
	}
	public static void Div(int a,int b)
	{
		double c=a/b;
		System.out.println(a +" / "+b+" : "+c);
	}
	public static void Mod(int a,int b)
	{
		double c=a%b;
		System.out.println(a +" % "+b+" : "+c);
	}
	public static void menu()
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("*********************************");
		System.out.println("**        MATHS OPERATORS      **");
		System.out.println("*********************************");
		System.out.println("** 0. Exit                     **");
		System.out.println("** 1. Addition                 **");
		System.out.println("** 2. Subtraction              **");
		System.out.println("** 3. Multiplication           **");
		System.out.println("** 4. Division                 **");
		System.out.println("** 5. Modulus                  **");
		System.out.println("*********************************");
		System.out.println("** Enter Your Choice : ");
		ch=sc.nextInt();
		switch(ch)
		{
			case 0:
				System.out.println("Good Bye!!!");
				break;
			case 1:
				Addition(10,5);
				break;
			case 2:
				Sub(10,5);
				break;
			case 3:
				Mul(10,5);
				break;
			case 4:
				Div(10,5);
				break;
			case 5:
				Mod(10,3);
				break;
			default:
				System.out.println("Wrong Input...");
				break;
		}
	}
	public static void main(String[] args) {
		menu();
	}
}
