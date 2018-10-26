package Abstraction_Ex;

public class Circle extends Shape
{
	int radius;
	double pi=3.14;
	public void area(int var)
	{
		radius=var;
		System.out.println("Arear of Circle: "+(pi*radius*radius));
	}
}