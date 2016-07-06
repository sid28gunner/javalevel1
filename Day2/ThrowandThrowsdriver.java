package Day2;

public class ThrowandThrowsdriver  {

	public static void main(String[] args) {
		
		ThrowandThrows a=new ThrowandThrows();
		
		try {
			
			System.out.println(a.div(4,0));
		} 
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
		}

	}

	
		
	}


