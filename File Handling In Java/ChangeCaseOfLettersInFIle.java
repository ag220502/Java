import java.io.FileReader;
import java.io.IOException;

public class ChangeCaseOfLettersInFIle {

	public static void main(String[] args) {
		FileReader file = null;
		try
		{
			file = new FileReader("test1.txt");
			int i;
			char ch;
			while((i=file.read())!=-1)
			{
				ch = (char)(i);
				String tem = ch+"";
				if(tem.toLowerCase() != null)
				{
					
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
				file.close();
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}


	}

}
