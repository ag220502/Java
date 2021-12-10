import java.io.*;

public class MarksExcep {
	
	//We have written *throws IOException* because this method can throw error 
	public static void marks(int mks) throws IOException
	{
		//If the marks is greater than 100 or less than 0 then error should come bcz its not possible
		if(mks<0 || mks>100)
		{
			throw new IOException("Marks Input Error");
		}
		//else marks is okay
		else
		{
			System.out.print("Marks Is Okay");
		}
	}
	public static void main(String[] args) throws IOException {
		marks(100);
		System.out.println();
		marks(101);
	}
}