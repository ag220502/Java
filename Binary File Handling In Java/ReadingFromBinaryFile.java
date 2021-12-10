import java.io.*;
public class ReadingFromBinaryFile {
	public static void main(String[] args) {
		FileInputStream file = null;
		try
		{
			file = new FileInputStream("test4.dat");
			int i;
			System.out.println("Reading from binary file :- ");
			while((i = file.read())!=-1)
			{
				System.out.print((char)i);
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
				file.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}