import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class WritinfLinesInAFile {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		BufferedWriter wfile=null;
		try
		{
			//Creating new File Using FileWriter
			FileWriter file = new FileWriter("test2.txt");
			wfile = new BufferedWriter(file);
			char h = 0;
			System.out.println("Enter Details of file (Pls Press * to stop):");
			while(h!='*')
			{
				h = scan.next().charAt(0);
				wfile.write(h);
			}
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
