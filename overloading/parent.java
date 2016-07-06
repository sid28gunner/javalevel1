package overloading;

public class parent {

	//Area of square
	public void area(int l)
	{
		System.out.print("The area of sqaure is ");
		int ar=l*l;
		System.out.println(ar);
	}
	
	//Area of circle
	public void area(double l)
	{
		System.out.print("The area of circle is ");
		double ar=3.14*l*l;
		System.out.println(ar);
	}
	
	public void area(int l,int b)
	{
		System.out.print("The area of rectangle is ");
		int ar=l*b;
		System.out.println(ar);
	}
}
