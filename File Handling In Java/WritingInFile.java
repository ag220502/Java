import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class WritingInFile {
	public static void main(String[] args) {
		BufferedWriter wfile=null;
		try 
		{
			//Creating new File Using FileWriter
			FileWriter file = new FileWriter("test1.txt");
			wfile = new BufferedWriter(file);
			wfile.write("Hello This is akshay garg\n");
			wfile.write("Writing in file");
			wfile.write("Bye");
			wfile.close();
		} 
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				wfile.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
}