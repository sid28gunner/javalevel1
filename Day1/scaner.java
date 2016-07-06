package Day1;
/*
 * Never use java keyword like while, Scanner, for in naming your variables and classes.
 */
import java.util.Scanner;
/*
 * Scanner classes are used to take data from user.
 */

public class scaner {

	public static void main(String[] args) {
		
	Scanner input=new Scanner(System.in);
	//int age = input.nextInt();
	//double age = input.nextDouble();
	//String name=input.next();
	String name=input.nextLine();
	/*
	 * Other forms of taking input
	 * 1.nextDouble(); 
	 * 2.nextLine();  -- Whole text line
	 * 3.next();      --only a single word 
	 */
	System.out.println(name);
	
		

	}

}

