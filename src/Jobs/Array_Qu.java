package Jobs;

public class Array_Qu {

	public static void main(String[] args) {
		
		String[] names = new String[10];
		names[1]= "vishwa";
		//System.out.println(names[1]);
		
		int length_of_array=names.length;
		//System.out.println(length_of_array);
		Array_Qu obj =new Array_Qu();
		obj.test();
		
	}
	
	
	public void test() {
		String Names[]= {"Vishwa","Neha","Pranab","Deepak","Umesh","Neha","Vishwa","Bhavana","Bhavana"};
		int i=0,j=0;
		boolean b=false;
		for(i=0;i<Names.length;i++)
		{
			for(j=i;j<(Names.length-1);j++)
			{
			if(Names[i].equals(Names[j+1]))
			{
				System.out.println("repeat is : "+Names[i]);
				b=false;
			}
			else
			{
				b=true;
			}
			
			}
			if(b==true)
			{
				System.out.println("Unique is : "+Names[i]);
			}
		}

	}
}

