package Day1;

public class Dog {
//1.Data means Characteristics
	private int height;
	private String color;
	private String breed;
	private int age;
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void bark()
	{
		System.out.println("Bow Bow");
	}
	
	public void bite()
	{
		System.out.println("Ouch");
	}
	
	public void run()
	{
		System.out.println("Run Run");
	}
	
	public int future_age()
	{
		age=age+5;
		return age;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
