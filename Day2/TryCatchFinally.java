/*Exceptions: Are runtime errors which java compiler is unable to find during compilation. They disrupt the 
 * normal flow of programme. 
 * We handle exception through try, catch and finally block
 */
package Day2;
import java.util.*;
public class TryCatchFinally {

	public static void main(String[] args) 
	{
		int a;
		int b;
		int c=0;
		Scanner in= new Scanner(System.in);
         System.out.println("Enter the first number");
         a=in.nextInt();
         System.out.println("Enter the second number");
         b=in.nextInt();
         try
         {
        	 c=a/b;
         }
         catch(Exception e)
         {
        	 System.out.println("You are getting "+ e);
         }
         finally
         {
        	 System.out.println("This block will always execute");
         }
         System.out.println("Output for Division operation is  "+ c);
	}

}
