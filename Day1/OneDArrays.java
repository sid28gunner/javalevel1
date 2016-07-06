package Day1;

public class OneDArrays {

	public static void main(String[] args) {
		//Number Arrays
		int[] en={2,4,6,8,10};
		for(int x:en)
		{
			System.out.println(x);
		}
		System.out.println("-----------------------------------------------------------");
		//String arrays
		String[] vowels={"a","e","i","o","u"};
		for(String x:vowels)
		{
			System.out.println(x);
		}
		System.out.println("-----------------------------------------------------------");
	//******************************************************************************************//
		//Number arrays
		int[] on=new int[5];
		on[2]=5;
		on[4]=50;
		
		for(int x:on)
		{
			System.out.println(x);
		}
		
		System.out.println("-----------------------------------------------------------");
		
		
		//String arrays
		String[] st=new String[3];
		st[1]="Siddharth";
		st[2]="Amit";
		for(String s:st)
		{
			System.out.println(s);
		}
	}
}
