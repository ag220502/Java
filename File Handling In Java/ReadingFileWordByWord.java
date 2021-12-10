import java.io.*;
public class ReadingFileWordByWord {
	public static void main(String[] args) {
		FileReader file = null;
		BufferedReader rfile=null;
		try
		{
			file = new FileReader("test1.txt");
			rfile = new BufferedReader(file);
			String line="";
			while((line = rfile.readLine())!=null)
			{
				String[] word = line.split(" ");
				for(int i=0;i<word.length;i++)
				{
					System.out.print(word[i]+" ");
				}
				System.out.println();
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