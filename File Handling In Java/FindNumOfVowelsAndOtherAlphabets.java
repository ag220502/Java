import java.io.FileReader;
import java.util.Scanner;

public class FindNumOfVowelsAndOtherAlphabets {

	public static void main(String[] args) {
		FileReader file = null;
		int cnt = 0;
		int cnt1 = 0;
		try
		{
			Scanner scan = new Scanner(System.in);
			file = new FileReader("test1.txt");
			int i;
			char ch;
			while((i = file.read())!=-1)
			{
				ch = (char)i;
				if(ch == 'a' || ch == 'e' || ch=='i' ||ch == 'o' || ch == 'u')
				{
					cnt++;
				}
				else
				{
					cnt1++;
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
				System.out.println("there are "+ cnt + " vowels and "+cnt1 +" consonants.");
				file.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}