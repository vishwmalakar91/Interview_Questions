package Jobs;

public class Strings_Qu {
	

	public static void main(String[] args) 
	{
		
		String name = "Vishwanathx";
		Strings_Qu obj = new Strings_Qu() ;
		
		obj.matched(name);
		obj.get_length(name);
		
		
		
		int length_of_string=name.length();		
		System.out.println(length_of_string);
	}
	
	
	
	
	
	
	
	
	
	public void matched(String test)
	{

	if(test=="Vishwanath")
			{
				System.out.println("matched");
			}
		
		
	}
	
	
	public int get_length(String test)
	{
		int length=0;
		
		while(test.charAt(length)!='x')
		{
			length++;

		}
		System.out.println(length);
		return length;
		
	}
	
}
