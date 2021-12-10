import java.io.FileReader;
import java.util.Scanner;

public class NumOfDigitsInFile {
	public static void main(String[] args) {
		FileReader file = null;
		int cnt = 0;
		try
		{
			file = new FileReader("test1.txt");
			int i;
			char ch;
			while((i = file.read())!=-1)
			{
				ch = (char)i;
				if(ch >='0' && ch<='9')
				{
					cnt++;
				}
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
				System.out.println("there are "+ cnt + " digits in file.");
				file.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}

	}

}
