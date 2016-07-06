/*
 * Throw and throws are used to define custom exceptions.
 */
package Day2;

    public class ThrowandThrows
    {
    public int div(int a,int b) throws Exception 
    {
    	int c=0;
    
	try
    {
	c=a/b;
    }
	catch(Exception e)
	{
	 throw new Exception("You are getting exception beware dont divide it by zero");	
	}
	return c;
}
}