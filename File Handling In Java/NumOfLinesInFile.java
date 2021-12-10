import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class NumOfLinesInFile {

	public static void main(String[] args) {
		FileReader file=null;
		BufferedReader fread = null;
		try
		{
			file = new FileReader("test1.txt");
			fread = new BufferedReader(file);
			String line="";
			int num=0;
			while((line=fread.readLine())!=null)
			{
				num++;
			}
			System.out.println("File Contains "+num+" lines.");
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
