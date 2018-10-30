package MS_Practice;

public class sort_int {

public static void main(String[] args) {
	int number = 52146729;
	int sortedNumber = 0;
	for (int i = 9; i >= 0; i--)
	{
	    int tmpNumber = number;
	    while (tmpNumber > 0)
	    {
	        int digit = tmpNumber % 10;             
	        if (digit == i)
	        {
	            sortedNumber *= 10;
	            sortedNumber += digit;
	        }
	        tmpNumber /= 10;                
	    }               
	}
	System.out.println(sortedNumber);
}
}
