import java.io.*;
public class CreateNewFile {
	public static void main(String[] args) {
		//We have to keep this is try-catch block 
		//because it can throw an exception 
		try 
		{
			//Creating new File Using FileWriter
			FileWriter file = new FileWriter("test2.txt");
		} 
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}