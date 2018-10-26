package Abstraction_Ex;

public class Square extends Shape
{
	int side;
	public void area(int var)
	{
		side=var;
		System.out.println("Area of Square: "+side*side);
	}
}