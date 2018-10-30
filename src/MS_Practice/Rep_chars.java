package MS_Practice;

public class Rep_chars 
{

	public static void main(String[] args) 
	{
		String input="VISXHWAVISHWANATHNATM";
		
	 
		 int x[]=new int [100];
		
		    for (int i = 0; i < input.length(); i++) 
		    { 
		    	 x[input.charAt(i)]++ ;
		    	 
		    }

		    for (int i = 0; i < input.length(); i++) 
		    { 
		        if(x[input.charAt(i)] != 1)
		        {
				    System.out.println(input.charAt(i));
				    break;
		        }

		    }
		    
	}
	
   
}
