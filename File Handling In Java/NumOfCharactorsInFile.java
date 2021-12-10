import java.io.*;
public class NumOfCharactorsInFile {
	public static void main(String[] args) {
		FileReader file = null;
		int cnt=0;
		try
		{
			file= new FileReader("test1.txt");
			
			int i;
			char ch;
			while((i=file.read())!=-1)
			{
				cnt++;
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
				System.out.println("The total number of characters are : "+(cnt-1));
				file.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}

	}

}
