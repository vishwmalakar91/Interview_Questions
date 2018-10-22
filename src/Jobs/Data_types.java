package Jobs;

public class Data_types {
	
	public static void main(String[] args) {
		
		int x=2147483647; //4 byte = 32 bite -2,147,483,648 to 2,147,483,647 , x=2147483648 will throw error
		char y='a'; //2 byte ,only one char can be assigned uses ASCI value
		String Str = "12345678912345678912345678912345678956789";//can be assigned any length of value , String is NOT data type
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(Str);
		
		int x_a[]= {2,3,4}; // only x1 will throw error , array of int
		System.out.println(x_a[0]);
		
		char y_a[]= {'a','b','c'}; //array of character
		System.out.println(y_a[2]);
		
		String Str_a[] = {"Vishwa","John","Neha"}; //array of string
		System.out.println(Str_a[0]);
		
		
	}

}
