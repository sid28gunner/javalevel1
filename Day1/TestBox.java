package Day1;

public class TestBox {

	public static void main(String[] args) 
	{
		//For creating a object we use new Keyword
	Box b = new Box(4,5);
	b.calculateArea();
	
	b.setLength(10);
	b.setHeight(20);
	b.calculateArea();
	
	System.out.println(b.getLength());
	System.out.println(b.getHeight());
	
	}

}
