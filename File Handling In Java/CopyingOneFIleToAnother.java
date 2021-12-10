import java.io.*;
public class CopyingOneFIleToAnother {

	public static void main(String[] args) {
		FileWriter wfile = null;
		FileReader rfile = null;
		try
		{
			rfile = new FileReader("test1.txt");
			wfile = new FileWriter("test3.txt");
			int i;
			char ch;
			while((i = rfile.read())!=-1)
			{
				ch = (char)i;
				wfile.write(ch);
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		finally
		{
			try 
			{
				wfile.close();
				rfile.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			
			
		}

	}

}
