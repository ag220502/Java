//Exceptional handling is for handling the exceptions when the program is running 
//
public class Expec1 {
	public static void main(String[] args) {
		//Try block is to run the program and if the exception occurs in try block the catch block will catch it 
		try{  
			
			    try
				{  
				     System.out.println("going to divide");
				     //Here there is exception that a number cannot be divided by zero then this error will be handelled by catch block
				     int b =39/0;  
				     System.out.println(b);
			    }
			    //Finally block will always continue to run the program so if the error comes then it stops the prgram smoothlty  
			    finally
			    {
			    	System.out.println("other statement");
			    }
			      
		}
		//Error will be catched here 
		catch(Exception e)
		{
			//Printing the error
			System.out.println(e);
		} 
		//After catching the error this code will work
		System.out.println("normal flow..");  
	}

}
