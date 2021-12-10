import java.io.*;
import java.util.*;
public class StrudenManagementSystem {

	private static Scanner scan = new Scanner(System.in);
	static FileOutputStream file = null;
	
	static BufferedWriter wfile=null;
	static File rfile;
	private static Scanner sfile = new Scanner(System.in);
	private static int roll;
	private static String name;
	private static float mks1,mks2,mks3,total;
	
	public StrudenManagementSystem()
	{
		roll=1;
		name="";
		mks1=0;
		mks2=0;
		mks3=0;
		total=mks1+mks2+mks3;
	}
	public static void getData()
	{
		System.out.println("Enter Roll Number Of Student : ");
		roll = scan.nextInt();
		System.out.println("Enter Name Of Student        : ");
		name = scan.next();
		System.out.println("Enter Marks 1 Of Student     : ");
		mks1 = scan.nextInt();
		System.out.println("Enter Marks 2 Of Student     : ");
		mks2 = scan.nextInt();
		System.out.println("Enter Marks 3 Of Student     : ");
		mks3 = scan.nextInt();
	}
	public static void showData()
	{
		total=mks1+mks2+mks3;
		System.out.println("Roll Number Of Student     : "+roll);
		System.out.println("Name Of Student            : "+name);
		System.out.println("Marks 1 Of Student         : "+mks1);
		System.out.println("Marks 2 Of Student         : "+mks2);
		System.out.println("Marks 3 Of Student         : "+mks3);
		System.out.println("Total Marks Of Student     : "+total);
	}
	public static void header()
	{
		for(int i=0;i<81;i++)
		{
			System.out.print("=");
		}
		System.out.println();
		System.out.print("==");
		System.out.printf("%-10s", " Roll No.");
		System.out.print("|");
		System.out.printf("%-20s", " Name");
		System.out.print("|");
		System.out.printf("%-10s", " Marks1");
		System.out.print("|");
		System.out.printf("%-10s", " Marks2");
		System.out.print("|");
		System.out.printf("%-10s", " Marks3");
		System.out.print("|");
		System.out.printf("%-12s", "Total Marks");
		System.out.print("==");
		System.out.println();
		for(int i=0;i<81;i++)
		{
			System.out.print("=");
		}
		System.out.println();
	}
	public static void list()
	{
		System.out.print("==");
		System.out.printf("%-10s"," "+roll);
		System.out.print("|");
		System.out.printf("%-20s", " "+name);
		System.out.print("|");
		System.out.printf("%-10s", " "+mks1);
		System.out.print("|");
		System.out.printf("%-10s", " "+mks2);
		System.out.print("|");
		System.out.printf("%-10s", " "+mks3);
		System.out.print("|");
		System.out.printf("%-12s", " "+total);
		
		System.out.print("==");
		System.out.println();
		
	}
	public static void menu()
	{
		System.out.println("===================================");
		System.out.println("==   STUDENT MANAGEMENT SYSTEM   ==");
		System.out.println("===================================");
		System.out.println("== 0. EXIT                       ==");
		System.out.println("== 1. Add New Record             ==");
		System.out.println("== 2. Display All Record         ==");
		System.out.println("== 3. Search Record              ==");
		System.out.println("== 4. Delete One Record          ==");
		System.out.println("== 5. Modify Record              ==");
		System.out.println("===================================");
	}
	public static void write() throws IOException
	{
		try 
		{
			file = new FileOutputStream("student1.dat");
			rfile = new File("student1.dat");
			wfile = new BufferedWriter(new FileWriter(rfile));
			getData();
			String input = "\n"+roll +" "+name+" "+mks1+" "+mks2+" "+mks3;
			byte[] array =input.getBytes();
			try 
			{
				file.write(array);
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				file.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	public static void display()
	{
		try
		{
			sfile = new Scanner("student2.dat");
			while(sfile.hasNext())
			{
				roll = scan.nextInt();
				name = scan.next();
				mks1 = scan.nextInt();
				mks2 = scan.nextInt();
				mks3 = scan.nextInt();
				total = mks1+mks2+mks3;
				list();
			}
		}
		catch(Exception e)
		{
			
		}
	}
	public static void search()
	{
		
	}
	public static void modify()
	{
		
	}
	public static void delete()
	{
		
	}
	public static void project()
	{
		int ch;
		do
		{
			menu();
			System.out.println("Enter Your Choice : ");
			ch = scan.nextInt();
			switch(ch)
			{
			case 0: 
				System.out.println("Good Bye!!!");
				break;
			case 1: 
				try {
					write();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2: 
				display();
				break;
			case 3: 
				search();
				break;
			case 4: 
				modify();
				break;
			case 5: 
				delete();
				break;
			default :
				System.out.println("Please Select right choice.");
			}
		}while(ch!=0);	
	}
	public static void main(String[] args) {
		getData();
		header();
		list();
	}
}