package MS_Practice;

public class Sub_String_Vishwa {

	public static void Search(String Text,String Pat) 
	{
	
		int T_Len=Text.length();
		int P_Len=Pat.length();
		int i,j;
		int count=0;
		for(i=0;i<P_Len;i++)
		{
			for(j=0;j<T_Len;j++)
			{
				
				if(Pat.charAt(i)==Text.charAt(j))
				{
					System.out.println(i+"-"+j);
					count++;
	
			}
			}
		
}
	}
	public static void main(String[] args) {
		
		String Text="DEEPAKPRANAB";
		String pat="PAK";
		Search(Text,pat);
		
	}
	
}
