import java.io.*;
public class ReadALineFromFile {
	public static void main(String[] args) {
		FileReader file= null;
		BufferedReader rfile=null;
		try
		{
			file = new FileReader("test1.txt");
			rfile = new BufferedReader(file);
			String line="";
			System.out.println("Reading line by line from file : -");
			while((line=rfile.readLine())!=null)
			{
				System.out.println(line+"\n");
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
