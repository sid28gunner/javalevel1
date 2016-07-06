package overloading;

public class parentdriver {

	public static void main(String[] args) {
		parent p=new parent();
		p.area(5);
		
		p.area(5.0);
		
		p.area(5,2);

	}

}
