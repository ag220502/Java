import java.io.*;
import java.util.*;
public class SearchAWordInFile {
	public static void main(String[] args) {
		FileReader file = null;
		int flag=0;
		try
		{
			Scanner scan = new Scanner(System.in);
			file = new FileReader("test1.txt");
			BufferedReader rfile = new BufferedReader(file);
			String line="";
			System.out.print("Enter the word you have to find : ");
			String sword = scan.next();
			while((line=rfile.readLine())!=null)
			{
				String[] word = line.split(" ");
				for(int i=0;i<word.length;i++)
				{
					if(sword.equalsIgnoreCase(word[i]))
					{
						flag++;
					}
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
				if(flag==0)
				{
					System.out.println("The word you enetered not found.");
				}
				else
				{
					System.out.println("The word you enetered found.");
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		

	}

}
