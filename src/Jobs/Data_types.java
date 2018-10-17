package Jobs;

public class Data_types {
	
	public static void main(String[] args) {
		
		int x=2147483647; //4 byte = 32 bite -2,147,483,648 to 2,147,483,647 , x=2147483648 will throw error
		char y='a'; //2 byte ,only one char can be assigned uses ASCI value
		String Str = "12345678912345678912345678912345678956789";//can be assigned any length of value
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(Str);
		
		int x1[]= {2,3,4}; // only x1 will throw error 
		System.out.println(x1[0]);
		
		char y1[]= {'a','b','c'};
		System.out.println(y1[0]);
		
		
	}

}
