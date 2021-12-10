import java.io.*;

public class WritingInBinaryFile {
	public static void main(String[] args) {
		FileOutputStream file = null;
		String cities = "1 Akash 45 55 67";
		byte[] array = cities.getBytes();
		try
		{
			file = new FileOutputStream("student.dat");
			file.write(array);
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
