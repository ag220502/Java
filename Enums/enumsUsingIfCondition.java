
public class enumsUsingIfCondition {
	enum Days
	{
		MONDAY,TUESDAY,WEDNESDAY;
	}
		public static void main(String[] args)
		{
			Days day1 = Days.WEDNESDAY;
			if(day1 == Days.MONDAY)
			{
				System.out.println("This is "+day1);
			}
			else if(day1 == Days.TUESDAY)
			{
				System.out.println("This is "+day1);
			}

			else if(day1 == Days.WEDNESDAY)
			{
				System.out.println("This is "+day1);
			}
		}
}
