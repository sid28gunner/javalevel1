package overriding;
/*
 * Overriding: When parent and child classes has exactly the same method name preference is given to child method.
 * We can stop overriding of the class and variables by using final keyword.final can used with classes, methods and data types.
 * Features of final keyword:
 * 1.You can't inherit final class.
 * 2.You can't override final methods.
 * 3.You can't change final variables. 
 */
public  class parent {
	
	public  void greeting()
	{
		System.out.println("Hello goodafternoon to all");
	}

}
