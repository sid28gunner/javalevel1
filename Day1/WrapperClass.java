package Day1;

public class WrapperClass {

	public static void main(String[] args) 
  {
		String val="123";
		int a = Integer.parseInt(val);
		double b= Double.parseDouble(val);
		System.out.println(a);
		System.out.println(b);
		
		int temp=0;
		String[] str={"56","89","97","98"};
		
		for(String x:str)
		{
			temp=temp+Integer.parseInt(x);
		}
		System.out.println("Sum of all the strings is "+temp);
		
		
   }

}
