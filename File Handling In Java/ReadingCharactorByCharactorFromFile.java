import java.io.FileReader;
import java.io.IOException;

public class ReadingCharactorByCharactorFromFile {
	public static void main(String[] args) {
		FileReader file = null;
		try
		{
			file = new FileReader("test1.txt");
			int i;
			char ch;
			System.out.println("The file contains :- ");
			while((i=file.read())!=-1)
			{
				ch = (char)(i);
				System.out.print(ch);
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
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
}