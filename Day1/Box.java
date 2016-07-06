package Day1;

public class Box 
{
	private int length;
	private int height;
	int area;
	//******************************Constructors**********************************
	/*
	 * Constructors:
	 * 1.Set a default value to the variables
	 * 2.Same name as that of class
	 * 3.Doesn't return anything
	 */
	public Box(int i, int j) {
		length=i;
		height=j;
	}
	public Box(int i) {
		length=i;
		height=0;
	}
	public Box() {
		System.out.println("Constructor fired");
	}
	//********************************************************************************
	
	
	//****************************Setters and Getters********************************
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	//*********************************************************************************
	public void calculateArea()
	{
		area= length* height;
		System.out.println("The area of the box is "+ area);
	}
	
}
