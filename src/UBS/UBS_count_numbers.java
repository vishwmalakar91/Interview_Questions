package UBS;

//program to count number of 9's in 59 to 99 and print it's sum.

public class UBS_count_numbers 
{
	
	public static void main(String[] args) 
	{
		
		int start =59;
		int End=99;
		int Sum=0;
		int counts=0;
		int digit_to_count=9;

		for(int i=start;i<=End;i++)
		{
		int unit= i%10;
		int tength=i/10;
		
		if(unit==digit_to_count|tength==digit_to_count)
		{
			Sum=Sum+i;
			counts++;
			System.out.print(i);
			System.out.print(",");
			if(unit==digit_to_count & tength==digit_to_count)
			{
				counts++;
			}
		}
		
		
		}
		System.out.println("");
		System.out.println("Sum of digit : "+Sum);
		System.out.println("count of "+digit_to_count+" is : "+counts);

	}
}