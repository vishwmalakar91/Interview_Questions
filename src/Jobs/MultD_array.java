package Jobs;

public class MultD_array {

	public static void main(String[] args) 
	{
		int i=0;
		int j=0;
	
		int x= 3;
		//System.out.println(x);
		
		//if i need multiple i will do like below
		
		//int x=3;
		//int y=3;
		//int z=3;
		//int a=4;
		//instead of this, i will create an array
				
		int []a= {3,5,3,4};
		//System.out.println(a[0]); //will print 3 value
		
		int p[]= {3,5,3,4};
		int q[]= {5,7,3,5};
		int r[]= {7,8,9,5};
		
		//instead of this, i will create an Multi dimensal array
		
		int [][] Mdarray= {{3,5,3,4},{5,7,3,5},{7,8,9,5}};  //[row][column]
		//System.out.println(Mdarray[0][0]);
		
		int row=Mdarray.length; //length is row i e number of individual arrays it consist
		//System.out.println(row);
		
		int col=Mdarray[0].length; //length is col i e data element in each array
		//System.out.println(col);
				
		//System.out.println(Mdarray[0][0]);
		//System.out.println(Mdarray[1][0]);
		//System.out.println(Mdarray[2][0]);
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(Mdarray[i][j]);
			}
			System.out.print("\n");
		}
		
	}
}
