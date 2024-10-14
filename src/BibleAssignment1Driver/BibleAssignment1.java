package BibleAssignment1Driver;

public class BibleAssignment1 {

	public static void main(String args[])
	{
		long disp = 13L;
		int years = 0;
		while(disp < 7700000000L)
		{
			years++;
			if(years%3==0)
			{
				disp = disp*2;
			}
		}
		
		System.out.println("1. " + years);
		
		disp = 13L;
		years = 0;
		while(disp < 7700000000L)
		{
			years++;
			if(years%3==0)
			{
				disp = disp*4;
			}
		}
		System.out.println("2. " + years);
	}
}
