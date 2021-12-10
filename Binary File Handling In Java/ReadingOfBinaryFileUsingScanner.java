import java.util.*;
import java.io.*;


public class ReadingOfBinaryFileUsingScanner {
	public static void main(String[] args) {
		Scanner sfile =null;
		int roll,mks1,mks2,mks3,total;
		String name;
		File file= null;
		try
		{
			file = new File("student.dat");
			sfile = new Scanner(file);
			while(sfile.hasNext())
			{
				roll = sfile.nextInt();
				name = sfile.next();
				mks1 = sfile.nextInt();
				mks2 = sfile.nextInt();
				mks3 = sfile.nextInt();
				total = mks1+mks2+mks3;
				System.out.println("Roll Number : "+roll);
				System.out.println("Name        : "+name);
				System.out.println("Marks 1     : "+mks1);
				System.out.println("Marks 2     : "+mks2);
				System.out.println("Marks 3     : "+mks3);
				System.out.println("Total Marks : "+total);		
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				sfile.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}