package UBS;

public class ubs_cir_dist {

	public static void main(String[] args) {
	
		ubs_cir_dist D=new ubs_cir_dist();
		System.out.println(D.Max_Distance("AA?ACAACCC"));

		
	}
	
	public int Max_Distance(String S)
	{
		int distance=0;
		int dist_C=0;
		int dist_A=0;
		int L=S.length();
		
		String Rep_A=S.replace("?","A");
		String Rep_C=S.replace("?","C");
		
		for(int i=0;i<L;i++)
		{
			if(Rep_A.charAt(i)=='A')
			{
				dist_A++;
			}
			if(Rep_A.charAt(i)=='C')
			{
				dist_A--;
			}
		}		
		
		for(int i=0;i<L;i++)
		{
			if(Rep_C.charAt(i)=='C')
			{
				dist_C++;
			}
			if(Rep_C.charAt(i)=='A')
			{
				dist_C--;
			}
		}
		
		if(dist_A>dist_C)
		{
			distance=dist_A;	
		}
		
		else
			distance=dist_C;
		return distance;
	}
}
