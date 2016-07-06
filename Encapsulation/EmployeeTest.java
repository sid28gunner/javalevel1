package Encapsulation;
import java.util.*;
public class EmployeeTest {

	public static void main(String[] args) {
	Employee e=new Employee();
	
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the salary");
	int sal=in.nextInt();
	in.close();
	
	e.setSalary(sal);
	e.setName("Batman");
	System.out.println("$"+e.getSalary());
	e.details();

	}

}
