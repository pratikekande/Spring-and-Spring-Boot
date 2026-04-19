enum Week
{
	MON, TUE, WED, THU, FRI, SAT, SUN;
}
public class Enum1
{
	
	public static void main(String[] args) 
	{
		Week week = Week.THU;
		System.out.println(week);
		int index=Week.THU.ordinal();
		System.out.println(index);
		
		Week[] weeks = Week.values();
		for(Week data:weeks)
		{
			System.out.println(data);
		}
	}

}
