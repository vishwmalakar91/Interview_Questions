package MS_Practice;
//a program to extract the maximum value 

class max_number 
{ 
	// Method to extract the maximum value 
	static int extractMaximum(String str) 
	{ 
		int num = 0, res = 0; 
	
		// Start traversing the given string 
		for (int i = 0; i<str.length(); i++) 
		{ 
			// If a numeric value comes, start converting 
			// it into an integer till there are consecutive 
			// numeric digits 
			if (Character.isDigit(str.charAt(i))) 
				num = num * 10 + (str.charAt(i)-'0'); 
	
			// Update maximum value 
			else
			{ 
				res = Math.max(res, num); 
	
				// Reset the number 
				num = 0; 
			} 
		} 
	
		// Return maximum value 
		return Math.max(res, num); 
	} 
	
	// Driver method 
	public static void main(String[] args) 
	{ 
		String str = "100klh564abc365bg"; 
		System.out.println(extractMaximum(str)); 
	}	 
} 
