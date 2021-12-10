import java.io.*;
public class NumOfWordsInFile {

	public static void main(String[] args) {
		FileReader file = null;
		try {
			file = new FileReader("test1.txt");
			BufferedReader rfile = new BufferedReader(file);
			int num=0;
			String line="";
			while((line = rfile.readLine())!=null)
			{
				String[] word = line.split(" ");
				num+=word.length;
			}
			System.out.println("The file contains "+num+" words");
		} 
		catch (Exception e) 
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
}