import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class CountTotalNumOfMinWordsOfFourCharacters {

	public static void main(String[] args) {
		FileReader file = null;
		BufferedReader rfile=null;
		try
		{
			file = new FileReader("test1.txt");
			rfile = new BufferedReader(file);
			String line="";
			int cnt=0;
			ArrayList<Integer> len = new ArrayList<Integer>();
			
			while((line = rfile.readLine())!=null)
			{
				String[] word = line.split(" ");
				for(int i=0;i<word.length;i++)
				{
					len.add(word[i].length());
				}
			}
			for(int i =0;i<len.size();i++)
			{
				if(len.get(i)>=4)
				{
					cnt++;
				}
			}
			System.out.println("The Number of words with length of greater than or equal to 4 is :  "+cnt);
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
