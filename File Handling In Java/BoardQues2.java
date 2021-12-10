import java.io.*;
public class BoardQues2 {

	public static void main(String[] args) {
		FileReader file = null;
		BufferedReader rfile = null;
		try
		{
			file = new FileReader("test2.txt");
			rfile = new BufferedReader(file);
			String line="";
			while((line = rfile.readLine())!=null)
			{
				String[] word = line.split(" ");
				for(int i=0;i<word.length;i++)
				{
					if(word[i].length()>9)
					{
						String temp = word[i];
						if(temp.charAt(0)=='w')
						{
							if(temp.charAt(1)=='w')
							{
								if(temp.charAt(2)=='w')
								{
									if(temp.charAt(3)=='.')
									{
										System.out.print(word[i]+" ");
									}
								}
							}
						}
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
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}

	}

}
