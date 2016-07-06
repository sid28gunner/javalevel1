package Day1;
import java.util.Scanner;
public class while_dowhile {

	public static void main(String[] args) {
		//checking whether the number is odd
		
		System.out.println("Enter the number you want to check");
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		int count=0;
		while(count==0)
		{
			int a=n%2;
			if(a==0)
			{
				System.out.println("The number is even");
			}
			else
				System.out.println("The number is odd");
			count++;
		}
		
      //Do while Loop
		System.out.println("Enter the number you want to check");
		int m=in.nextInt();
		do
		{
			int a=m%2;
			if(a==0)
			{
				System.out.println("The number is even");
			}
			else
				System.out.println("The number is odd");
			count++;	
		}while(count==0);
	}

}
