package MS_Practice;

public class Rep_Char {

	public static void main(String[] args) 
	{
	
		int i=0,j=0;
		String raw="ABH";
		
		int len =raw.length();
		
		for(i=0;i<len;i++)
		{
			for(j=0;j<len;j++)
			{
		if(raw.charAt(i)==raw.charAt(j))
		{
			System.out.println("A");
		}
		}
		}
	}
	
}
