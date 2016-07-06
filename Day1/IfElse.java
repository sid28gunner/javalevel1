package Day1;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		/*
		 * Logical Operators : &, |, !
		*/
		
		/*
		 * Comparison Operators : =, ==, >,<,>= ,<=,!=
		*/
	    System.out.println("Enter the day ");
		Scanner input=new Scanner(System.in);
		String day = input.next();
		input.close();
		
		if(day.equals("Sunday") || day.equals("Saturday"))
		{
			System.out.println("Weekends");
			
		}
		
		else if(day.equals("Monday") || day.equals("Tuesday")||day.equals("Wednesday") || day.equals("Thursday")||day.equals("Friday"))
		{
			System.out.println("Weekdays");
			
		}
		else
			System.out.println("You must have entered something wrong");
	
		}

}
