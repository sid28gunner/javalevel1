package Encapsulation;

public class Employee {
	//In this programme we want to set programmer Analyst salary
	private int salary;
	String name;
	
	public int getSalary()
	{
		return salary;
	}
	public void setSalary(int salary) 
	{
		if(salary>=20610 && salary<=28000)
		this.salary = salary;
		else
		{
			System.out.println("You must be an associate or higher please check your salary");
		}
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public void details()
	{
		System.out.println("Your name and salary is "+ getName()+" $"+getSalary());
	}

}
