package Barclays;

public class Min_amount {
	
	public static void main(String[] args) {
		
		Min_amount M = new Min_amount();
		M.get_min();
		
	}
	
	
	public int get_min()
	{
		int amount=0;
		int min_amount=1000;
		int Energy=10;
		
		int Apple_energy = 5;
		int Mango_energy =3;
		int Orange_energy =2;
		
		int Apple_price = 20;
		int Mango_Price =5;
		int Oramge_Price =5;
		
		int Apple_qty=5;
		int Mango_qty=5;
		int Orange_qty=5;
		
		int i,j,k;
		
		for(i=0;i<=Apple_qty;i++)
		{
			for(j=0;j<=Mango_qty;j++)
			{
				for(k=0;k<=Orange_qty;k++)
				{
					amount=(Apple_price*i)+(Mango_Price*j)+(Oramge_Price*k);
					Energy=(Apple_energy*i)+(Mango_energy*j)+(Orange_energy*k);
					if(Energy==10)
					{
						System.out.print("apple = "+i+" Mango = "+j+" Orange = "+k);
						System.out.println(" Total amount ="+amount+","+"Enery = "+Energy);
						

					if(amount<min_amount)
					{
						min_amount=amount;
						
					}
					}
					
				}
			}
		}
		
			System.out.println("\nMinimum required amount is : "+min_amount);		
		return min_amount;
	}
	

}
