import java.io.*;
import java.util.*;

public class SearchCharacterInFile {
	public static void main(String[] args) {
		FileReader file = null;
		int cnt = 0;
		try
		{
			Scanner scan = new Scanner(System.in);
			file = new FileReader("test1.txt");
			int i;
			char ch;
			char search;
			System.out.print("Enter the character you want to search : ");
			search = scan.next().charAt(0);
			while((i = file.read())!=-1)
			{
				ch = (char)i;
				if(ch == search)
				{
					cnt++;
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
				if(cnt!=0)
				{
					System.out.print("The character you entered found and it is coming "+cnt+" times.");
				}
				else
				{
					System.out.print("The character you entered not found.");
				}
				file.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
			

	}

}
