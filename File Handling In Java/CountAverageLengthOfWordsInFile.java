import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class CountAverageLengthOfWordsInFile {

	public static void main(String[] args) {
		FileReader file = null;
		BufferedReader rfile=null;
		try
		{
			file = new FileReader("test1.txt");
			rfile = new BufferedReader(file);
			String line="";
			int mean=0;
			int sum=0;
			ArrayList<Integer> len = new ArrayList<Integer>();
			
			while((line = rfile.readLine())!=null)
			{
				String[] word = line.split(" ");
				for(int i=0;i<word.length;i++)
				{
					len.add(word[i].length());
				}
			}
			System.out.println(len);
			for(int i =0;i<len.size();i++)
			{
				sum+=len.get(i);
			}
			mean = sum/len.size();
			System.out.println("The average length is :  "+mean);
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
