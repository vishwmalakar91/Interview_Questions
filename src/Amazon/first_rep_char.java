package Amazon;

public class first_rep_char {
	
	
	public static char getFirstRepChar() 
	{
		char repChar='0';
		boolean b=false;
		char status[]={'m','t','x','0','7'};
		int length=status.length;
		for(int i=0;i<length-1;i++) {
			for (int j = i + 1; j < length; j++) {
				if (status[i] == status[j]) {
					repChar = status[i];
					b=true;
					break;
				}
			}

			if(b) {
				break;
			}
		}

		return repChar;
	}
	
	public static void main(String[] args) {
		
		System.out.println("First Repeat Char is "+getFirstRepChar());
		
	}

}
