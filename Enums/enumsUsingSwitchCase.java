enum Days
{
	MONDAY,TUESDAY,WEDNESDAY;
}
public class enumsUsingSwitchCase {
	
	public static void main(String[] args) {
		Days day = Days.MONDAY;
		switch(day)
		{
			case MONDAY:
				System.out.println("This is "+day);
				break;
			case TUESDAY:
				System.out.println(day);
				break;
			case WEDNESDAY:
				System.out.println(day);
				break;
		}
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