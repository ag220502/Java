 import java.util.*;

//ArrayList is the inbuilt class present in util package which is similar to arrays but the arrays are not dynamic and Array Lists are dynamic for storing elements
 
// ArrayList is of generic type it means that when we will create ArrayList we have to pass a parameter for its data type
//you replace <E> with <String> to tell the class that you're going to store strings as the data type inside where E is the parameter present in class 

 
public class ArrayListProgram
{
	
	//The final keyword is used to define constant values and it cannot be changed later.Also These methods cannot be overridden. For example math class which is inbuilt class and we cannot override that class as final keyword is used
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		
		String[] array = {"red", "green", "blue"};
	
		ArrayList<String> ob = new ArrayList<>(Arrays.asList(array));
		
		System.out.print(ob);
		
		String[] array1 = new String[ob.size()];
		
		ob.toArray(array1);
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array1[i]);
		}
		
		
		//Creating New Array
		int[] arr=new int[10];
		
		System.out.println();
		
		//Creating Array List
		ArrayList<Integer> ar =new ArrayList<>();
		
		
		System.out.print("How Many elements you would like to enter: ");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" elements: ");
		
		//Adding new elements in ArrayList
		for(int i=0;i<n;i++)
		{
			int ele=sc.nextInt();
			ar.add(ele);
		}
		ar.add(2,32);
		//Printing all the elements of ArrayList
		System.out.println();
		System.out.println("The Array You entered is : ");
		System.out.println(ar);
		
		
		//Printing the maximum value from the list 
		System.out.println("Max Value In the Array you entered is : "+ Collections.max(ar));
		
		
		//Printing the minimum value from the list 
		System.out.println("Min Value In the Array you entered is : "+ Collections.min(ar));
		
		
		//Shuffling the array List
		System.out.println("Shuffling the Array List You Entered : ");
		Collections.shuffle(ar);
		System.out.println(ar);
		
		
		//Removing One element from arrayList
		System.out.println("Enter The index of element you want to remove : ");
		int ak=sc.nextInt();
		ar.remove(ak);
		System.out.println();
		System.out.println("The Array after removing that element is : ");
		System.out.println(ar);
		
		
		//Removing All elements from arrayList
		ar.clear();
		

		System.out.println();
		System.out.println("The ArrayList after removing all elements is : ");
		System.out.println(ar);
		
	}
	

}
