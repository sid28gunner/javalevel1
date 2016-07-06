package Abstractclass;

public abstract class Objectarea {

    public void calculateVol(double l, double h)
    {
      double vol=calculateArea(l) * h;
    	System.out.println("The volume is "+vol); 
    }
    
    
	
	public abstract double calculateArea(double l);
}
